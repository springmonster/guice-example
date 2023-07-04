package com.khch.module;

import com.google.inject.AbstractModule;
import com.google.inject.Scopes;
import com.khch.annotations.ColorValue;
import com.khch.annotations.EdgeValue;
import com.khch.requests.SquareRequest;
import com.khch.services.DrawShape;
import com.khch.services.DrawSquare;

public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        // DrawShape 是 DrawSquare 的接口，这里绑定的是接口
        bind(DrawShape.class).to(DrawSquare.class).in(Scopes.SINGLETON);
//        bind(SquareRequest.class).to(SquareSubRequest.class);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(10);
        bind(SquareRequest.class).in(Scopes.SINGLETON);
    }
}
