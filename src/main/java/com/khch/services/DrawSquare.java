package com.khch.services;

import com.google.inject.Inject;
import com.khch.annotations.ColorValue;
import com.khch.annotations.EdgeValue;

public class DrawSquare implements DrawShape {

    @Inject
    public DrawSquare(
            @ColorValue String color,
            @EdgeValue Integer edge) {
        System.out.println("DrawSquare color = " + color + " edge = " + edge);
    }

    @Override
    public void draw() {
        System.out.println("Draw Square");
    }
}
