package com.khch.services;

import com.google.inject.Inject;
import com.khch.annotations.ColorValue;
import com.khch.annotations.EdgeValue;

public class DrawTriangle implements DrawShape {

    @Inject
    public DrawTriangle(
            @ColorValue String color,
            @EdgeValue Integer edge) {
        System.out.println("DrawTriangle color = " + color + " edge = " + edge);
    }

    @Override
    public void draw() {
        System.out.println("Draw Triangle");
    }
}
