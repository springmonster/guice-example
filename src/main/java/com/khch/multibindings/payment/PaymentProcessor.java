package com.khch.multibindings.payment;

import com.khch.factory.Payment;

public interface PaymentProcessor {
    void processPayment(Payment payment);
}
