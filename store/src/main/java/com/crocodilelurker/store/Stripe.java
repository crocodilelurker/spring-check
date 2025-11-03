package com.crocodilelurker.store;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("stripe")
public class Stripe implements PaymentService{

    @Value("${stripe.apiUrl}")
    private String apiUrl;
    @Override
    public void display() {
        System.out.println("Stripe Payment Initiated");
        System.out.println("API URL: " + apiUrl);
    }
}
