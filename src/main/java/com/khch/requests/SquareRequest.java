package com.khch.requests;

import com.khch.services.DrawShape;
import jakarta.inject.Inject;

public class SquareRequest {

    @Inject
    DrawShape drawShape;

//    @Inject
//    public SquareRequest(DrawShape drawShape) {
//        this.drawShape = drawShape;
//    }

    public void makeRequest() {
        drawShape.draw();
    }

    public DrawShape getDrawShape() {
        return drawShape;
    }
}
