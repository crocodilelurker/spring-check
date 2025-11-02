package com.crocodilelurker.store;

public class Stripe implements PaymentService{

    @Override
    public void display() {
        System.out.println("Stripe Payment Initiated");
    }
}
