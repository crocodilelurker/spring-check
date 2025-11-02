package com.crocodilelurker.store;

import org.springframework.core.annotation.Order;

public class OrderService {

    //Setter Way
    private PaymentService paymentService;
//    public OrderService(PaymentService paymentService)
//    {
//        this.paymentService= paymentService;
//    }
    public void placeOrder()
    {
        paymentService.display();
        //loosely coupled to PaymentService.
    }
    public void setPaymentService (PaymentService paymentService)
    {
        this.paymentService = paymentService;
    }
}
