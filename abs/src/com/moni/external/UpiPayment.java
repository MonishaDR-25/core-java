package com.moni.external;

import com.moni.internal.Payment;

public class UpiPayment implements Payment {
    @Override
    public void process() {
        System.out.println("Processing UPI Payment");
    }
}
