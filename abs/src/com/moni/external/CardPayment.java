package com.moni.external;

import com.moni.internal.Payment;

public class CardPayment implements Payment {
    @Override
    public void process() {
        System.out.println("Processing Card Payment");
    }
}
