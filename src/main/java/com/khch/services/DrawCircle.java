package com.khch.services;

import com.google.inject.Inject;
import com.khch.annotations.ColorValue;
import com.khch.annotations.EdgeValue;

public class DrawCircle implements DrawShape {

    @Inject
    public DrawCircle(
            @ColorValue String color,
            @EdgeValue Integer edge) {
        System.out.println("DrawCircle color = " + color + " edge = " + edge);
    }

    @Override
    public void draw() {
        System.out.println("Draw Circle");
    }
}
