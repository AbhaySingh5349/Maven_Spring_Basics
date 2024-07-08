package org.example.spring.AnnotationObjects;

import org.springframework.stereotype.Component;

@Component
public class SmsGateway {
    public void sendMessage(String msg){
        System.out.println("sms msg: " + msg);
    }
}
