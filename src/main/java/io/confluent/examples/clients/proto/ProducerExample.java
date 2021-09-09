package io.confluent.examples.clients.proto;

import com.google.protobuf.Any;
import com.google.protobuf.Message;

import io.confluent.kafka.serializers.AbstractKafkaSchemaSerDeConfig;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.kafka.common.serialization.StringSerializer;
// import io.confluent.kafka.serializers.protobuf.KafkaProtobufDeserializer;

import org.apache.kafka.common.errors.SerializationException;
import java.util.concurrent.ExecutionException;

import java.util.Properties;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.FileInputStream;
import java.io.InputStream;

import com.google.protobuf.Any;

import org.apache.kafka.clients.producer.*;

public class ProducerExample {

    private static final String TOPIC = "test-test";

    @SuppressWarnings("InfiniteLoopStatement")
    public static void main(final String[] args) throws IOException {

        System.out.println("AA");

      Properties props = new Properties();
      props.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
      props.put(AbstractKafkaSchemaSerDeConfig.SCHEMA_REGISTRY_URL_CONFIG, "http://127.0.0.1:8081");
    props.put(ProducerConfig.ACKS_CONFIG, "all");
    props.put(ProducerConfig.RETRIES_CONFIG, 0);
    props.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG, StringSerializer.class);
    props.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG, "io.confluent.kafka.serializers.protobuf.KafkaProtobufSerializer");


        try (KafkaProducer<String, BadAny> producer = new KafkaProducer<String, BadAny>(props)) {
            System.out.println("BB");
            for (long i = 0; i < 10; i++) {
                final String orderId = "id" + Long.toString(i);
                System.out.println("CC");
                GoodString goodString = GoodString.newBuilder().setMessage("good").build();
                BadAny badAny = BadAny.newBuilder().setEventData(Any.pack(goodString)).build();
                final ProducerRecord<String, BadAny> record = new ProducerRecord<String, BadAny>(TOPIC, Long.toString(i), badAny);
                producer.send(record);
                System.out.println("DD");
                Thread.sleep(1000L);

            }
            System.out.println("EE");
            producer.flush();
            System.out.printf("Successfully produced 10 messages to a topic called %s%n", TOPIC);

        } catch (final SerializationException e) {
            e.printStackTrace();
        } catch (final InterruptedException e) {
            e.printStackTrace();
        }

    }

//     public RecordMetadata sendMessage(String topic, String key, Message event) throws ExecutionException, InterruptedException {

//       topic = topic + "-" + key;
//       ProducerRecord<String, Message> record = new ProducerRecord<>(topic, key, event);

//       return producer.send(record);
//   }

}
