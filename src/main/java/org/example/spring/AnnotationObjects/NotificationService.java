package org.example.spring.AnnotationObjects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class NotificationService {
    EmailGateway emailGateway;
    SmsGateway smsGateway;

    @Autowired
    public NotificationService(EmailGateway emailGateway, SmsGateway smsGateway) {
        this.emailGateway = emailGateway;
        this.smsGateway = smsGateway;
    }

    public void sendEmail(String msg){
        emailGateway.sendMessage(msg);
    }

    public void sendSms(String msg){
        smsGateway.sendMessage(msg);
    }
}
