package com.khch.services;

import com.google.inject.Inject;
import com.khch.annotations.ColorValue;
import com.khch.annotations.EdgeValue;

public class DrawStar implements DrawShape {

    @Inject
    public DrawStar(
            @ColorValue String color,
            @EdgeValue Integer edge) {
        System.out.println("DrawStar color = " + color + " edge = " + edge);
    }

    @Override
    public void draw() {
        System.out.println("Draw Star");
    }
}
