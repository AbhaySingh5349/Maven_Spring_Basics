package org.example.server;

import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpHandler;

import java.io.IOException;
import java.io.OutputStream;

public class HelloHandler implements HttpHandler {
    @Override
    public void handle(HttpExchange exchange) throws IOException {
        String res = "I'm returned from HelloHandler by " + Thread.currentThread().getName();
        System.out.println("response: " + res);

        // exchange provides with req-res headers
        exchange.sendResponseHeaders(200, res.length());

        OutputStream os = exchange.getResponseBody();
        os.write(res.getBytes());
    }
}
