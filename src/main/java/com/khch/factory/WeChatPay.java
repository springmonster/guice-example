package com.khch.factory;

public class WeChatPay implements Payment {
    @Override
    public String pay() {
        return "WeChatPay";
    }
}
