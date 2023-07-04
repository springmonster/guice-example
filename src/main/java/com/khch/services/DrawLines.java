package com.khch.services;

import com.google.inject.Inject;
import com.khch.annotations.ColorValue;
import com.khch.annotations.EdgeValue;

public class DrawLines implements DrawShape {

    @Inject
    public DrawLines(
            @ColorValue String color,
            @EdgeValue Integer edge) {
        System.out.println("DrawLines color = " + color + " edge = " + edge);
    }

    @Override
    public void draw() {
        System.out.println("Draw Lines");
    }
}
