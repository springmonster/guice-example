package com.khch.factory;

import com.google.inject.Inject;
import com.google.inject.Injector;

import java.util.Map;

public class PaymentFactory {

    @Inject
    Injector injector;

    Map<Class, Class<? extends Payment>> map =
            Map.of(
                    AliPay.class, AliPay.class,
                    WeChatPay.class, WeChatPay.class
            );

    public Payment createPayment(Class clazz) {
        return injector.getInstance(map.get(clazz));
    }
}
