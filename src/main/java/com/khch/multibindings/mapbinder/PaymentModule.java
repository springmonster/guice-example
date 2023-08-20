package com.khch.multibindings.mapbinder;

import com.google.inject.AbstractModule;
import com.google.inject.multibindings.MapBinder;
import com.khch.multibindings.payment.CreditCardProcessor;
import com.khch.multibindings.payment.PayPalProcessor;
import com.khch.multibindings.payment.PaymentProcessor;

public class PaymentModule extends AbstractModule {
    @Override
    protected void configure() {
        MapBinder<PaymentMethod, PaymentProcessor> paymentBinder = MapBinder.newMapBinder(binder(), PaymentMethod.class, PaymentProcessor.class);
        paymentBinder.addBinding(PaymentMethod.CREDIT_CARD).to(CreditCardProcessor.class);
        paymentBinder.addBinding(PaymentMethod.PAYPAL).to(PayPalProcessor.class);
    }
}
