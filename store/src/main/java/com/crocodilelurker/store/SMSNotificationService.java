package com.crocodilelurker.store;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component("sms")
@Primary
public class SMSNotificationService implements NotificationService {
    @Override

    public void send(String message) {
        System.out.println(message +  " sent via SMS");
    }
}
