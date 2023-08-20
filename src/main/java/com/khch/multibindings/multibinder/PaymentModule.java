package com.khch.multibindings.multibinder;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.Multibinder;
import com.khch.multibindings.payment.CreditCardProcessor;
import com.khch.multibindings.payment.PayPalProcessor;
import com.khch.multibindings.payment.PaymentProcessor;

public class PaymentModule extends AbstractModule {
    @Override
    protected void configure() {
        Multibinder<PaymentProcessor> paymentBinder = Multibinder.newSetBinder(binder(), PaymentProcessor.class);
        paymentBinder.addBinding().to(CreditCardProcessor.class);
        paymentBinder.addBinding().to(PayPalProcessor.class);
    }
}
