// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: good.proto

package io.confluent.examples.clients.proto;

/**
 * Protobuf type {@code io.confluent.examples.clients.proto.GoodStringMulti}
 */
public  final class GoodStringMulti extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:io.confluent.examples.clients.proto.GoodStringMulti)
    GoodStringMultiOrBuilder {
private static final long serialVersionUID = 0L;
  // Use GoodStringMulti.newBuilder() to construct.
  private GoodStringMulti(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private GoodStringMulti() {
    message_ = com.google.protobuf.LazyStringArrayList.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new GoodStringMulti();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private GoodStringMulti(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    int mutable_bitField0_ = 0;
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          case 10: {
            java.lang.String s = input.readStringRequireUtf8();
            if (!((mutable_bitField0_ & 0x00000001) != 0)) {
              message_ = new com.google.protobuf.LazyStringArrayList();
              mutable_bitField0_ |= 0x00000001;
            }
            message_.add(s);
            break;
          }
          default: {
            if (!parseUnknownField(
                input, unknownFields, extensionRegistry, tag)) {
              done = true;
            }
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(
          e).setUnfinishedMessage(this);
    } finally {
      if (((mutable_bitField0_ & 0x00000001) != 0)) {
        message_ = message_.getUnmodifiableView();
      }
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return io.confluent.examples.clients.proto.Good.internal_static_io_confluent_examples_clients_proto_GoodStringMulti_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.confluent.examples.clients.proto.Good.internal_static_io_confluent_examples_clients_proto_GoodStringMulti_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.confluent.examples.clients.proto.GoodStringMulti.class, io.confluent.examples.clients.proto.GoodStringMulti.Builder.class);
  }

  public static final int MESSAGE_FIELD_NUMBER = 1;
  private com.google.protobuf.LazyStringList message_;
  /**
   * <code>repeated string message = 1;</code>
   * @return A list containing the message.
   */
  public com.google.protobuf.ProtocolStringList
      getMessageList() {
    return message_;
  }
  /**
   * <code>repeated string message = 1;</code>
   * @return The count of message.
   */
  public int getMessageCount() {
    return message_.size();
  }
  /**
   * <code>repeated string message = 1;</code>
   * @param index The index of the element to return.
   * @return The message at the given index.
   */
  public java.lang.String getMessage(int index) {
    return message_.get(index);
  }
  /**
   * <code>repeated string message = 1;</code>
   * @param index The index of the value to return.
   * @return The bytes of the message at the given index.
   */
  public com.google.protobuf.ByteString
      getMessageBytes(int index) {
    return message_.getByteString(index);
  }

  private byte memoizedIsInitialized = -1;
  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    for (int i = 0; i < message_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, message_.getRaw(i));
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < message_.size(); i++) {
        dataSize += computeStringSizeNoTag(message_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getMessageList().size();
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
     return true;
    }
    if (!(obj instanceof io.confluent.examples.clients.proto.GoodStringMulti)) {
      return super.equals(obj);
    }
    io.confluent.examples.clients.proto.GoodStringMulti other = (io.confluent.examples.clients.proto.GoodStringMulti) obj;

    if (!getMessageList()
        .equals(other.getMessageList())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    if (getMessageCount() > 0) {
      hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
      hash = (53 * hash) + getMessageList().hashCode();
    }
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static io.confluent.examples.clients.proto.GoodStringMulti parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.confluent.examples.clients.proto.GoodStringMulti parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.confluent.examples.clients.proto.GoodStringMulti parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.confluent.examples.clients.proto.GoodStringMulti parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.confluent.examples.clients.proto.GoodStringMulti parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.confluent.examples.clients.proto.GoodStringMulti parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.confluent.examples.clients.proto.GoodStringMulti parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.confluent.examples.clients.proto.GoodStringMulti parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.confluent.examples.clients.proto.GoodStringMulti parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static io.confluent.examples.clients.proto.GoodStringMulti parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static io.confluent.examples.clients.proto.GoodStringMulti parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static io.confluent.examples.clients.proto.GoodStringMulti parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.confluent.examples.clients.proto.GoodStringMulti prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code io.confluent.examples.clients.proto.GoodStringMulti}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:io.confluent.examples.clients.proto.GoodStringMulti)
      io.confluent.examples.clients.proto.GoodStringMultiOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.confluent.examples.clients.proto.Good.internal_static_io_confluent_examples_clients_proto_GoodStringMulti_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.confluent.examples.clients.proto.Good.internal_static_io_confluent_examples_clients_proto_GoodStringMulti_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.confluent.examples.clients.proto.GoodStringMulti.class, io.confluent.examples.clients.proto.GoodStringMulti.Builder.class);
    }

    // Construct using io.confluent.examples.clients.proto.GoodStringMulti.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3
              .alwaysUseFieldBuilders) {
      }
    }
    @java.lang.Override
    public Builder clear() {
      super.clear();
      message_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.confluent.examples.clients.proto.Good.internal_static_io_confluent_examples_clients_proto_GoodStringMulti_descriptor;
    }

    @java.lang.Override
    public io.confluent.examples.clients.proto.GoodStringMulti getDefaultInstanceForType() {
      return io.confluent.examples.clients.proto.GoodStringMulti.getDefaultInstance();
    }

    @java.lang.Override
    public io.confluent.examples.clients.proto.GoodStringMulti build() {
      io.confluent.examples.clients.proto.GoodStringMulti result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public io.confluent.examples.clients.proto.GoodStringMulti buildPartial() {
      io.confluent.examples.clients.proto.GoodStringMulti result = new io.confluent.examples.clients.proto.GoodStringMulti(this);
      int from_bitField0_ = bitField0_;
      if (((bitField0_ & 0x00000001) != 0)) {
        message_ = message_.getUnmodifiableView();
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.message_ = message_;
      onBuilt();
      return result;
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }
    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.setField(field, value);
    }
    @java.lang.Override
    public Builder clearField(
        com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }
    @java.lang.Override
    public Builder clearOneof(
        com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }
    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }
    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field,
        java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }
    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.confluent.examples.clients.proto.GoodStringMulti) {
        return mergeFrom((io.confluent.examples.clients.proto.GoodStringMulti)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.confluent.examples.clients.proto.GoodStringMulti other) {
      if (other == io.confluent.examples.clients.proto.GoodStringMulti.getDefaultInstance()) return this;
      if (!other.message_.isEmpty()) {
        if (message_.isEmpty()) {
          message_ = other.message_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureMessageIsMutable();
          message_.addAll(other.message_);
        }
        onChanged();
      }
      this.mergeUnknownFields(other.unknownFields);
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      io.confluent.examples.clients.proto.GoodStringMulti parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.confluent.examples.clients.proto.GoodStringMulti) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }
    private int bitField0_;

    private com.google.protobuf.LazyStringList message_ = com.google.protobuf.LazyStringArrayList.EMPTY;
    private void ensureMessageIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        message_ = new com.google.protobuf.LazyStringArrayList(message_);
        bitField0_ |= 0x00000001;
       }
    }
    /**
     * <code>repeated string message = 1;</code>
     * @return A list containing the message.
     */
    public com.google.protobuf.ProtocolStringList
        getMessageList() {
      return message_.getUnmodifiableView();
    }
    /**
     * <code>repeated string message = 1;</code>
     * @return The count of message.
     */
    public int getMessageCount() {
      return message_.size();
    }
    /**
     * <code>repeated string message = 1;</code>
     * @param index The index of the element to return.
     * @return The message at the given index.
     */
    public java.lang.String getMessage(int index) {
      return message_.get(index);
    }
    /**
     * <code>repeated string message = 1;</code>
     * @param index The index of the value to return.
     * @return The bytes of the message at the given index.
     */
    public com.google.protobuf.ByteString
        getMessageBytes(int index) {
      return message_.getByteString(index);
    }
    /**
     * <code>repeated string message = 1;</code>
     * @param index The index to set the value at.
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(
        int index, java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMessageIsMutable();
      message_.set(index, value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string message = 1;</code>
     * @param value The message to add.
     * @return This builder for chaining.
     */
    public Builder addMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  ensureMessageIsMutable();
      message_.add(value);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string message = 1;</code>
     * @param values The message to add.
     * @return This builder for chaining.
     */
    public Builder addAllMessage(
        java.lang.Iterable<java.lang.String> values) {
      ensureMessageIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(
          values, message_);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string message = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = com.google.protobuf.LazyStringArrayList.EMPTY;
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>repeated string message = 1;</code>
     * @param value The bytes of the message to add.
     * @return This builder for chaining.
     */
    public Builder addMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      ensureMessageIsMutable();
      message_.add(value);
      onChanged();
      return this;
    }
    @java.lang.Override
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }


    // @@protoc_insertion_point(builder_scope:io.confluent.examples.clients.proto.GoodStringMulti)
  }

  // @@protoc_insertion_point(class_scope:io.confluent.examples.clients.proto.GoodStringMulti)
  private static final io.confluent.examples.clients.proto.GoodStringMulti DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.confluent.examples.clients.proto.GoodStringMulti();
  }

  public static io.confluent.examples.clients.proto.GoodStringMulti getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GoodStringMulti>
      PARSER = new com.google.protobuf.AbstractParser<GoodStringMulti>() {
    @java.lang.Override
    public GoodStringMulti parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new GoodStringMulti(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<GoodStringMulti> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GoodStringMulti> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public io.confluent.examples.clients.proto.GoodStringMulti getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

