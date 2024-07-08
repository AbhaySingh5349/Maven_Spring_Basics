package org.example.spring.AnnotationObjects;

import org.springframework.stereotype.Component;

@Component
public class EmailGateway {
    public void sendMessage(String msg){
        System.out.println("email msg: " + msg);
    }
}
