package io.apicode.model;

// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProfileList.proto

public final class ProfileListProto {
  private ProfileListProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface ProfileListOrBuilder extends
      // @@protoc_insertion_point(interface_extends:ProfileList)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>repeated .Profile Profile = 1;</code>
     */
    java.util.List<ProfileProto.Profile> 
        getProfileList();
    /**
     * <code>repeated .Profile Profile = 1;</code>
     */
    ProfileProto.Profile getProfile(int index);
    /**
     * <code>repeated .Profile Profile = 1;</code>
     */
    int getProfileCount();
    /**
     * <code>repeated .Profile Profile = 1;</code>
     */
    java.util.List<? extends ProfileProto.ProfileOrBuilder> 
        getProfileOrBuilderList();
    /**
     * <code>repeated .Profile Profile = 1;</code>
     */
    ProfileProto.ProfileOrBuilder getProfileOrBuilder(
        int index);
  }
  /**
   * Protobuf type {@code ProfileList}
   */
  public  static final class ProfileList extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:ProfileList)
      ProfileListOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use ProfileList.newBuilder() to construct.
    private ProfileList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private ProfileList() {
      profile_ = java.util.Collections.emptyList();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private ProfileList(
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
              if (!((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
                profile_ = new java.util.ArrayList<ProfileProto.Profile>();
                mutable_bitField0_ |= 0x00000001;
              }
              profile_.add(
                  input.readMessage(ProfileProto.Profile.parser(), extensionRegistry));
              break;
            }
            default: {
              if (!parseUnknownFieldProto3(
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
        if (((mutable_bitField0_ & 0x00000001) == 0x00000001)) {
          profile_ = java.util.Collections.unmodifiableList(profile_);
        }
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return ProfileListProto.internal_static_ProfileList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return ProfileListProto.internal_static_ProfileList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              ProfileListProto.ProfileList.class, ProfileListProto.ProfileList.Builder.class);
    }

    public static final int PROFILE_FIELD_NUMBER = 1;
    private java.util.List<ProfileProto.Profile> profile_;
    /**
     * <code>repeated .Profile Profile = 1;</code>
     */
    public java.util.List<ProfileProto.Profile> getProfileList() {
      return profile_;
    }
    /**
     * <code>repeated .Profile Profile = 1;</code>
     */
    public java.util.List<? extends ProfileProto.ProfileOrBuilder> 
        getProfileOrBuilderList() {
      return profile_;
    }
    /**
     * <code>repeated .Profile Profile = 1;</code>
     */
    public int getProfileCount() {
      return profile_.size();
    }
    /**
     * <code>repeated .Profile Profile = 1;</code>
     */
    public ProfileProto.Profile getProfile(int index) {
      return profile_.get(index);
    }
    /**
     * <code>repeated .Profile Profile = 1;</code>
     */
    public ProfileProto.ProfileOrBuilder getProfileOrBuilder(
        int index) {
      return profile_.get(index);
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
      for (int i = 0; i < profile_.size(); i++) {
        output.writeMessage(1, profile_.get(i));
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      for (int i = 0; i < profile_.size(); i++) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, profile_.get(i));
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
      if (!(obj instanceof ProfileListProto.ProfileList)) {
        return super.equals(obj);
      }
      ProfileListProto.ProfileList other = (ProfileListProto.ProfileList) obj;

      boolean result = true;
      result = result && getProfileList()
          .equals(other.getProfileList());
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (getProfileCount() > 0) {
        hash = (37 * hash) + PROFILE_FIELD_NUMBER;
        hash = (53 * hash) + getProfileList().hashCode();
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static ProfileListProto.ProfileList parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProfileListProto.ProfileList parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProfileListProto.ProfileList parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProfileListProto.ProfileList parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProfileListProto.ProfileList parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static ProfileListProto.ProfileList parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static ProfileListProto.ProfileList parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ProfileListProto.ProfileList parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static ProfileListProto.ProfileList parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static ProfileListProto.ProfileList parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static ProfileListProto.ProfileList parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static ProfileListProto.ProfileList parseFrom(
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
    public static Builder newBuilder(ProfileListProto.ProfileList prototype) {
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
     * Protobuf type {@code ProfileList}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:ProfileList)
        ProfileListProto.ProfileListOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return ProfileListProto.internal_static_ProfileList_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return ProfileListProto.internal_static_ProfileList_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                ProfileListProto.ProfileList.class, ProfileListProto.ProfileList.Builder.class);
      }

      // Construct using ProfileListProto.ProfileList.newBuilder()
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
          getProfileFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        if (profileBuilder_ == null) {
          profile_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          profileBuilder_.clear();
        }
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return ProfileListProto.internal_static_ProfileList_descriptor;
      }

      @java.lang.Override
      public ProfileListProto.ProfileList getDefaultInstanceForType() {
        return ProfileListProto.ProfileList.getDefaultInstance();
      }

      @java.lang.Override
      public ProfileListProto.ProfileList build() {
        ProfileListProto.ProfileList result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public ProfileListProto.ProfileList buildPartial() {
        ProfileListProto.ProfileList result = new ProfileListProto.ProfileList(this);
        int from_bitField0_ = bitField0_;
        if (profileBuilder_ == null) {
          if (((bitField0_ & 0x00000001) == 0x00000001)) {
            profile_ = java.util.Collections.unmodifiableList(profile_);
            bitField0_ = (bitField0_ & ~0x00000001);
          }
          result.profile_ = profile_;
        } else {
          result.profile_ = profileBuilder_.build();
        }
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof ProfileListProto.ProfileList) {
          return mergeFrom((ProfileListProto.ProfileList)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(ProfileListProto.ProfileList other) {
        if (other == ProfileListProto.ProfileList.getDefaultInstance()) return this;
        if (profileBuilder_ == null) {
          if (!other.profile_.isEmpty()) {
            if (profile_.isEmpty()) {
              profile_ = other.profile_;
              bitField0_ = (bitField0_ & ~0x00000001);
            } else {
              ensureProfileIsMutable();
              profile_.addAll(other.profile_);
            }
            onChanged();
          }
        } else {
          if (!other.profile_.isEmpty()) {
            if (profileBuilder_.isEmpty()) {
              profileBuilder_.dispose();
              profileBuilder_ = null;
              profile_ = other.profile_;
              bitField0_ = (bitField0_ & ~0x00000001);
              profileBuilder_ = 
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders ?
                   getProfileFieldBuilder() : null;
            } else {
              profileBuilder_.addAllMessages(other.profile_);
            }
          }
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
        ProfileListProto.ProfileList parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (ProfileListProto.ProfileList) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.util.List<ProfileProto.Profile> profile_ =
        java.util.Collections.emptyList();
      private void ensureProfileIsMutable() {
        if (!((bitField0_ & 0x00000001) == 0x00000001)) {
          profile_ = new java.util.ArrayList<ProfileProto.Profile>(profile_);
          bitField0_ |= 0x00000001;
         }
      }

      private com.google.protobuf.RepeatedFieldBuilderV3<
          ProfileProto.Profile, ProfileProto.Profile.Builder, ProfileProto.ProfileOrBuilder> profileBuilder_;

      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public java.util.List<ProfileProto.Profile> getProfileList() {
        if (profileBuilder_ == null) {
          return java.util.Collections.unmodifiableList(profile_);
        } else {
          return profileBuilder_.getMessageList();
        }
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public int getProfileCount() {
        if (profileBuilder_ == null) {
          return profile_.size();
        } else {
          return profileBuilder_.getCount();
        }
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public ProfileProto.Profile getProfile(int index) {
        if (profileBuilder_ == null) {
          return profile_.get(index);
        } else {
          return profileBuilder_.getMessage(index);
        }
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public Builder setProfile(
          int index, ProfileProto.Profile value) {
        if (profileBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProfileIsMutable();
          profile_.set(index, value);
          onChanged();
        } else {
          profileBuilder_.setMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public Builder setProfile(
          int index, ProfileProto.Profile.Builder builderForValue) {
        if (profileBuilder_ == null) {
          ensureProfileIsMutable();
          profile_.set(index, builderForValue.build());
          onChanged();
        } else {
          profileBuilder_.setMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public Builder addProfile(ProfileProto.Profile value) {
        if (profileBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProfileIsMutable();
          profile_.add(value);
          onChanged();
        } else {
          profileBuilder_.addMessage(value);
        }
        return this;
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public Builder addProfile(
          int index, ProfileProto.Profile value) {
        if (profileBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          ensureProfileIsMutable();
          profile_.add(index, value);
          onChanged();
        } else {
          profileBuilder_.addMessage(index, value);
        }
        return this;
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public Builder addProfile(
          ProfileProto.Profile.Builder builderForValue) {
        if (profileBuilder_ == null) {
          ensureProfileIsMutable();
          profile_.add(builderForValue.build());
          onChanged();
        } else {
          profileBuilder_.addMessage(builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public Builder addProfile(
          int index, ProfileProto.Profile.Builder builderForValue) {
        if (profileBuilder_ == null) {
          ensureProfileIsMutable();
          profile_.add(index, builderForValue.build());
          onChanged();
        } else {
          profileBuilder_.addMessage(index, builderForValue.build());
        }
        return this;
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public Builder addAllProfile(
          java.lang.Iterable<? extends ProfileProto.Profile> values) {
        if (profileBuilder_ == null) {
          ensureProfileIsMutable();
          com.google.protobuf.AbstractMessageLite.Builder.addAll(
              values, profile_);
          onChanged();
        } else {
          profileBuilder_.addAllMessages(values);
        }
        return this;
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public Builder clearProfile() {
        if (profileBuilder_ == null) {
          profile_ = java.util.Collections.emptyList();
          bitField0_ = (bitField0_ & ~0x00000001);
          onChanged();
        } else {
          profileBuilder_.clear();
        }
        return this;
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public Builder removeProfile(int index) {
        if (profileBuilder_ == null) {
          ensureProfileIsMutable();
          profile_.remove(index);
          onChanged();
        } else {
          profileBuilder_.remove(index);
        }
        return this;
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public ProfileProto.Profile.Builder getProfileBuilder(
          int index) {
        return getProfileFieldBuilder().getBuilder(index);
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public ProfileProto.ProfileOrBuilder getProfileOrBuilder(
          int index) {
        if (profileBuilder_ == null) {
          return profile_.get(index);  } else {
          return profileBuilder_.getMessageOrBuilder(index);
        }
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public java.util.List<? extends ProfileProto.ProfileOrBuilder> 
           getProfileOrBuilderList() {
        if (profileBuilder_ != null) {
          return profileBuilder_.getMessageOrBuilderList();
        } else {
          return java.util.Collections.unmodifiableList(profile_);
        }
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public ProfileProto.Profile.Builder addProfileBuilder() {
        return getProfileFieldBuilder().addBuilder(
            ProfileProto.Profile.getDefaultInstance());
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public ProfileProto.Profile.Builder addProfileBuilder(
          int index) {
        return getProfileFieldBuilder().addBuilder(
            index, ProfileProto.Profile.getDefaultInstance());
      }
      /**
       * <code>repeated .Profile Profile = 1;</code>
       */
      public java.util.List<ProfileProto.Profile.Builder> 
           getProfileBuilderList() {
        return getProfileFieldBuilder().getBuilderList();
      }
      private com.google.protobuf.RepeatedFieldBuilderV3<
          ProfileProto.Profile, ProfileProto.Profile.Builder, ProfileProto.ProfileOrBuilder> 
          getProfileFieldBuilder() {
        if (profileBuilder_ == null) {
          profileBuilder_ = new com.google.protobuf.RepeatedFieldBuilderV3<
              ProfileProto.Profile, ProfileProto.Profile.Builder, ProfileProto.ProfileOrBuilder>(
                  profile_,
                  ((bitField0_ & 0x00000001) == 0x00000001),
                  getParentForChildren(),
                  isClean());
          profile_ = null;
        }
        return profileBuilder_;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFieldsProto3(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:ProfileList)
    }

    // @@protoc_insertion_point(class_scope:ProfileList)
    private static final ProfileListProto.ProfileList DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ProfileListProto.ProfileList();
    }

    public static ProfileListProto.ProfileList getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<ProfileList>
        PARSER = new com.google.protobuf.AbstractParser<ProfileList>() {
      @java.lang.Override
      public ProfileList parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new ProfileList(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<ProfileList> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<ProfileList> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public ProfileListProto.ProfileList getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_ProfileList_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_ProfileList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021ProfileList.proto\032\rProfile.proto\"(\n\013Pr" +
      "ofileList\022\031\n\007Profile\030\001 \003(\0132\010.ProfileB\022B\020" +
      "ProfileListProtob\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          ProfileProto.getDescriptor(),
        }, assigner);
    internal_static_ProfileList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_ProfileList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_ProfileList_descriptor,
        new java.lang.String[] { "Profile", });
    ProfileProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
