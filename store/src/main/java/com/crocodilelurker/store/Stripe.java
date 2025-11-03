package com.crocodilelurker.store;


import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service("stripe")
public class Stripe implements PaymentService{

    @Override
    public void display() {
        System.out.println("Stripe Payment Initiated");
    }
}
