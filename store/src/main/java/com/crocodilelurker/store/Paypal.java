package com.crocodilelurker.store;

public class Paypal implements PaymentService{
    @Override
    public void display()
    {
        System.out.println("Paypal Service Initiated");
    }
}
