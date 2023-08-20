package com.khch.multibindings.mapbinder;

import com.google.inject.Inject;
import com.khch.factory.Payment;
import com.khch.multibindings.mapbinder.PaymentMethod;
import com.khch.multibindings.payment.PaymentProcessor;

import java.util.Map;

public class PaymentService {
    private final Map<PaymentMethod, PaymentProcessor> processors;

    @Inject
    public PaymentService(Map<PaymentMethod, PaymentProcessor> processors) {
        this.processors = processors;
    }

    public void processPayment(Payment payment, PaymentMethod method) {
        PaymentProcessor processor = processors.get(method);
        if (processor != null) {
            processor.processPayment(payment);
        } else {
            throw new IllegalArgumentException("Unsupported payment method: " + method);
        }
    }
}
