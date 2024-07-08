package org.example.spring.AnnotationObjects;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext applicationContext = new
                AnnotationConfigApplicationContext("org.example.spring.AnnotationObjects");

        NotificationService notificationService = (NotificationService) applicationContext.getBean("notificationService");

        notificationService.sendSms("sms notification sent");
        notificationService.sendEmail("email notification sent");
    }
}
