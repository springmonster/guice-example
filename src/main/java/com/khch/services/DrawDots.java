package com.khch.services;

import com.google.inject.Inject;
import com.khch.annotations.ColorValue;
import com.khch.annotations.EdgeValue;

public class DrawDots implements DrawShape {

    @Inject
    public DrawDots(
            @ColorValue String color,
            @EdgeValue Integer edge) {
        System.out.println("DrawDots color = " + color + " edge = " + edge);
    }

    @Override
    public void draw() {
        System.out.println("Draw dots");
    }
}
