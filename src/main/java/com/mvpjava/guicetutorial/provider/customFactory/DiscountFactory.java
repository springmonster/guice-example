package com.mvpjava.guicetutorial.provider.customFactory;

import com.google.inject.ImplementedBy;

@ImplementedBy(CartDiscountFactory.class)
interface DiscountFactory {
    Discountable getDiscount(ShoppingCart cart);
}
