package com.khch.factory;

public class AliPay implements Payment {
    @Override
    public String pay() {
        return "AliPay";
    }
}
