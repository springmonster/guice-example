package com.khch.multibindings.multibinder;

import com.google.inject.Inject;
import com.khch.factory.Payment;
import com.khch.multibindings.payment.PaymentProcessor;

import java.util.Set;

public class PaymentService {
    private final Set<PaymentProcessor> processors;

    @Inject
    public PaymentService(Set<PaymentProcessor> processors) {
        this.processors = processors;
    }

    public void processPayment(Payment payment) {
        for (PaymentProcessor processor : processors) {
            processor.processPayment(payment);
        }
    }
}
