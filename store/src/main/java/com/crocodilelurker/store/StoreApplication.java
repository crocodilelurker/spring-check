package com.crocodilelurker.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class StoreApplication {
	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(StoreApplication.class, args);
        context.getBean(OrderService.class).placeOrder();
		context.getBean(NotificationManager.class).send("Hello World");
	}
}
