package com.crocodilelurker.store;


import org.springframework.stereotype.Component;

@Component
public interface NotificationService {
    public void send(String message);
}
