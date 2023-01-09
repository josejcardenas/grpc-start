package org.example;
import io.grpc.BindableService;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.RecommendationsService;

public class RecommendationsServer {
    public static void main(String[] args) throws Exception{
        final int PORT = 50051;

        // Create a new server to listen in the PORT 9090
        Server server = ServerBuilder.forPort(PORT).addService((BindableService) new RecommendationsService()).build();

        // Start server
        server.start();

        // Server threads are running in the background
        System.out.println("Server started ...");
        // Don't exit the main thread. Wait until server is terminated.
        server.awaitTermination();
    }
}
