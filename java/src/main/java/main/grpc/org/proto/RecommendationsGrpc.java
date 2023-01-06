package org.proto;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.40.1)",
    comments = "Source: recommendations.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class RecommendationsGrpc {

  private RecommendationsGrpc() {}

  public static final String SERVICE_NAME = "org.proto.Recommendations";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<org.proto.RecommendationsOuterClass.RecommendationRequest,
      org.proto.RecommendationsOuterClass.RecommendationResponse> getRecommendMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "Recommend",
      requestType = org.proto.RecommendationsOuterClass.RecommendationRequest.class,
      responseType = org.proto.RecommendationsOuterClass.RecommendationResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<org.proto.RecommendationsOuterClass.RecommendationRequest,
      org.proto.RecommendationsOuterClass.RecommendationResponse> getRecommendMethod() {
    io.grpc.MethodDescriptor<org.proto.RecommendationsOuterClass.RecommendationRequest, org.proto.RecommendationsOuterClass.RecommendationResponse> getRecommendMethod;
    if ((getRecommendMethod = RecommendationsGrpc.getRecommendMethod) == null) {
      synchronized (RecommendationsGrpc.class) {
        if ((getRecommendMethod = RecommendationsGrpc.getRecommendMethod) == null) {
          RecommendationsGrpc.getRecommendMethod = getRecommendMethod =
              io.grpc.MethodDescriptor.<org.proto.RecommendationsOuterClass.RecommendationRequest, org.proto.RecommendationsOuterClass.RecommendationResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "Recommend"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.proto.RecommendationsOuterClass.RecommendationRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  org.proto.RecommendationsOuterClass.RecommendationResponse.getDefaultInstance()))
              .setSchemaDescriptor(new RecommendationsMethodDescriptorSupplier("Recommend"))
              .build();
        }
      }
    }
    return getRecommendMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RecommendationsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommendationsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommendationsStub>() {
        @java.lang.Override
        public RecommendationsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommendationsStub(channel, callOptions);
        }
      };
    return RecommendationsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RecommendationsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommendationsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommendationsBlockingStub>() {
        @java.lang.Override
        public RecommendationsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommendationsBlockingStub(channel, callOptions);
        }
      };
    return RecommendationsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RecommendationsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RecommendationsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RecommendationsFutureStub>() {
        @java.lang.Override
        public RecommendationsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RecommendationsFutureStub(channel, callOptions);
        }
      };
    return RecommendationsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RecommendationsImplBase implements io.grpc.BindableService {

    /**
     */
    public void recommend(org.proto.RecommendationsOuterClass.RecommendationRequest request,
        io.grpc.stub.StreamObserver<org.proto.RecommendationsOuterClass.RecommendationResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRecommendMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRecommendMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                org.proto.RecommendationsOuterClass.RecommendationRequest,
                org.proto.RecommendationsOuterClass.RecommendationResponse>(
                  this, METHODID_RECOMMEND)))
          .build();
    }
  }

  /**
   */
  public static final class RecommendationsStub extends io.grpc.stub.AbstractAsyncStub<RecommendationsStub> {
    private RecommendationsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommendationsStub(channel, callOptions);
    }

    /**
     */
    public void recommend(org.proto.RecommendationsOuterClass.RecommendationRequest request,
        io.grpc.stub.StreamObserver<org.proto.RecommendationsOuterClass.RecommendationResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRecommendMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RecommendationsBlockingStub extends io.grpc.stub.AbstractBlockingStub<RecommendationsBlockingStub> {
    private RecommendationsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommendationsBlockingStub(channel, callOptions);
    }

    /**
     */
    public org.proto.RecommendationsOuterClass.RecommendationResponse recommend(org.proto.RecommendationsOuterClass.RecommendationRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRecommendMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RecommendationsFutureStub extends io.grpc.stub.AbstractFutureStub<RecommendationsFutureStub> {
    private RecommendationsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RecommendationsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RecommendationsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<org.proto.RecommendationsOuterClass.RecommendationResponse> recommend(
        org.proto.RecommendationsOuterClass.RecommendationRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRecommendMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_RECOMMEND = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RecommendationsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RecommendationsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_RECOMMEND:
          serviceImpl.recommend((org.proto.RecommendationsOuterClass.RecommendationRequest) request,
              (io.grpc.stub.StreamObserver<org.proto.RecommendationsOuterClass.RecommendationResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RecommendationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RecommendationsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return org.proto.RecommendationsOuterClass.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Recommendations");
    }
  }

  private static final class RecommendationsFileDescriptorSupplier
      extends RecommendationsBaseDescriptorSupplier {
    RecommendationsFileDescriptorSupplier() {}
  }

  private static final class RecommendationsMethodDescriptorSupplier
      extends RecommendationsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RecommendationsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RecommendationsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RecommendationsFileDescriptorSupplier())
              .addMethod(getRecommendMethod())
              .build();
        }
      }
    }
    return result;
  }
}
