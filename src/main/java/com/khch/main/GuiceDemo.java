package com.khch.main;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.khch.module.AppModule;
import com.khch.requests.SquareRequest;

public class GuiceDemo {
    private static final String SQUARE_REQ = "square";

    public static void main(String[] args) {
        sendRequest(SQUARE_REQ);
    }

    private static void sendRequest(String request) {
        if (SQUARE_REQ.equals(request)) {
//            // 使用 Guice 的方式
//            // 1. 创建一个 Injector
//            Injector injector = Guice.createInjector(new AppModule());
//            // 2. 通过 Injector 获取到 DrawShape 的实例，DrawShape 绑定到了 DrawSquare
//            DrawShape drawShape = injector.getInstance(DrawShape.class);
//            // 3. 调用 SquareRequest 的 makeRequest 方法
//            SquareRequest squareRequest = new SquareRequest(drawShape);
//            squareRequest.makeRequest();

            // 使用 Guice 的方式
            // 1. 创建一个 Injector
            Injector injector = Guice.createInjector(new AppModule());
            // 2. 通过 Injector 获取到 SquareRequest 的实例，SquareRequest 依赖 DrawShape
            SquareRequest squareRequest = injector.getInstance(SquareRequest.class);
            // 3. 调用 SquareRequest 的 makeRequest 方法
            squareRequest.makeRequest();

            SquareRequest squareRequest1 = injector.getInstance(SquareRequest.class);
            squareRequest1.makeRequest();

            System.out.println(squareRequest == squareRequest1);
            System.out.println(squareRequest.getDrawShape() == squareRequest1.getDrawShape());
        }
    }
}
