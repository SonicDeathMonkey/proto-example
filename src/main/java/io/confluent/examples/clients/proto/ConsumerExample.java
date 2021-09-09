package io.confluent.examples.clients.proto;

import com.google.protobuf.Any;
import com.google.protobuf.Message;

import io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig;
import io.confluent.kafka.serializers.protobuf.*;
import org.apache.kafka.common.serialization.StringSerializer;

import org.apache.kafka.common.errors.SerializationException;
import java.util.concurrent.ExecutionException;

import java.util.Properties;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileInputStream;
import java.io.InputStream;
import java.time.Duration;
import java.util.Collections;
import java.util.Properties;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileInputStream;
import java.io.InputStream;



import org.apache.kafka.clients.consumer.*;

public class ConsumerExample {

    private static final String TOPIC = "test-test";
    // private static final Properties props = new Properties();

    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(final String[] args) throws IOException {

        System.out.println("Setting up ConsumerConfig ...");

        Properties props = new Properties();
        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        props.put(AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://127.0.0.1:8081");    
        props.put(ConsumerConfig.GROUP_ID_CONFIG, TOPIC+"-cg");
        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, "true");
        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "1000");
        props.put(ConsumerConfig.AUTO_OFFSET_RESET_CONFIG, "earliest");
        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, "org.apache.kafka.common.serialization.StringDeserializer");
        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, "io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializer");
        props.put("specific.protobuf.class", io.confluent.examples.clients.proto.BadAny.class);
        props.put(KafkaProtobufDeserializerConfig.SPECIFIC_PROTOBUF_VALUE_TYPE, BadAny.class.getName());
        
        try (KafkaConsumer<String, BadAny> consumer = new KafkaConsumer<String, BadAny>(props)) {
            System.out.println("Consumer subscribing ...");
            
            consumer.subscribe(Collections.singletonList(TOPIC));
            
            while (true) {
                System.out.println("Consumer polling ...");
                final ConsumerRecords<String, BadAny> records = consumer.poll(Duration.ofMillis(100));
                for (final ConsumerRecord<String, BadAny> record : records) {
                    final String key = record.key();
                    final BadAny value = record.value();
                    System.out.printf("key = %s, value = %s%n", key, value);
                }
            }
        } 

    }

}
