// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: org/dark/proto/demo.proto

package com.lw.proto;

public final class Demo {
  private Demo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FileBean_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FileBean_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_FileDeal_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_FileDeal_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\031org/dark/proto/demo.proto\"K\n\010FileBean\022" +
      "\014\n\004file\030\001 \001(\014\022\020\n\010fileName\030\002 \001(\t\022\013\n\003opt\030\006" +
      " \001(\005\022\022\n\nfileLength\030\017 \001(\014\"I\n\010FileDeal\022\020\n\010" +
      "dealType\030\001 \001(\014\022\022\n\ndealResult\030\005 \001(\t\022\027\n\004be" +
      "an\030\t \001(\0132\t.FileBeanB\020\n\014com.lw.protoP\001b\006p" +
      "roto3"
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
        }, assigner);
    internal_static_FileBean_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_FileBean_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FileBean_descriptor,
        new java.lang.String[] { "File", "FileName", "Opt", "FileLength", });
    internal_static_FileDeal_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_FileDeal_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_FileDeal_descriptor,
        new java.lang.String[] { "DealType", "DealResult", "Bean", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
