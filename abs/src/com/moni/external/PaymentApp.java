package com.moni.external;

import com.moni.internal.Payment;

public class PaymentApp {
    private Payment payment;

    public PaymentApp(Payment payment) {
        this.payment = payment;
    }

    public void doPayment() {
        if (this.payment != null) {
            System.out.println("Initiating payment in PaymentApp");
            this.payment.process();
        } else {
            System.err.println("Payment is null");
        }
    }
}
