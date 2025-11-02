package com.crocodilelurker.store;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.annotation.Order;

@SpringBootApplication
public class StoreApplication {

	public static void main(String[] args) {

		var paymentService = new Paypal();
		//SpringApplication.run(StoreApplication.class, args);
		var orderService = new OrderService(paymentService);
		orderService.placeOrder();
	}
}
