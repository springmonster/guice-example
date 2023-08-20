package com.examples.one;

import com.google.inject.ImplementedBy;

@ImplementedBy(EarlyBirdDiscount.class)
public interface Discountable {
    double getDiscount();
}
