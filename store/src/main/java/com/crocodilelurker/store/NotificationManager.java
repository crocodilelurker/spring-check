package com.crocodilelurker.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class NotificationManager {
    private final NotificationService notificationService;

    @Autowired
    public NotificationManager(@Qualifier("email") NotificationService notificationService)
    {
        this.notificationService= notificationService;
    }
    public void send(String message)
    {
        notificationService.send(message);
    }


}
