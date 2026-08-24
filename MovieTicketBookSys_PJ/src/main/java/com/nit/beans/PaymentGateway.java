package com.nit.beans;

import org.springframework.stereotype.Component;

@Component
public class PaymentGateway {

    public void makePayment() {
        System.out.println("Payment Completed");
    }
}