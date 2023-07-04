package com.khch.requests;

import com.khch.annotations.StarValue;
import com.khch.annotations.TriangleValue;
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

    @Inject
    @TriangleValue
    DrawShape drawTriangle;

    @Inject
    @StarValue
    DrawShape drawStar;

    public void makeRequest() {
        drawSquare.draw();
        drawCircle.draw();
        drawTriangle.draw();
        drawStar.draw();
    }

    public DrawShape getDrawShape() {
        return drawSquare;
    }
}
