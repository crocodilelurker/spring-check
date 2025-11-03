package com.crocodilelurker.store;


import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service("paypal")
@Primary
public class Paypal implements PaymentService{
    @Override
    public void display()
    {
        System.out.println("Paypal Service Initiated");
    }
}
