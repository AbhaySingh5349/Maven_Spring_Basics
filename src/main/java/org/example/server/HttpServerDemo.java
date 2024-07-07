package org.example.server;

import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;

public class HttpServerDemo {
    public static void main(String[] args) throws IOException {
        HttpServer httpServer = HttpServer.create(new InetSocketAddress("localhost", 9091), 0);

        httpServer.setExecutor(Executors.newFixedThreadPool(4));

        httpServer.createContext("/hello", new HelloHandler()); // http://localhost:9091/hello
        httpServer.start();
    }
}
