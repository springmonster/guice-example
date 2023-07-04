package com.khch.requests;

import com.khch.services.DrawShape;
import jakarta.inject.Inject;
import jakarta.inject.Named;

public class SquareRequest {

    @Inject
    @Named("Square")
    DrawShape drawSquare;


    @Inject
    @Named("Circle")
    DrawShape drawCircle;

//    @Inject
//    public SquareRequest(DrawShape drawShape) {
//        this.drawShape = drawShape;
//    }

    public void makeRequest() {
        drawSquare.draw();
        drawCircle.draw();
    }

    public DrawShape getDrawShape() {
        return drawSquare;
    }
}
