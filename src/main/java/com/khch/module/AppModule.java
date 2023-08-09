package com.khch.module;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.google.inject.Scopes;
import com.google.inject.name.Names;
import com.khch.annotations.ColorValue;
import com.khch.annotations.EdgeValue;
import com.khch.annotations.StarValue;
import com.khch.annotations.TriangleValue;
import com.khch.requests.SquareRequest;
import com.khch.services.*;

public class AppModule extends AbstractModule {

    @Override
    protected void configure() {
        // DrawShape 是 DrawSquare 的接口，这里绑定的是接口
        bind(DrawShape.class)
                .annotatedWith(Names.named("Square"))
                .to(DrawSquare.class)
                .in(Scopes.SINGLETON);

        bind(DrawShape.class)
                .annotatedWith(Names.named("Circle"))
                .to(DrawCircle.class)
                .in(Scopes.SINGLETON);

        bind(DrawShape.class)
                .annotatedWith(TriangleValue.class)
                .to(DrawTriangle.class)
                .in(Scopes.SINGLETON);

        bind(DrawShape.class)
                .annotatedWith(StarValue.class)
                .to(DrawStar.class)
                .in(Scopes.SINGLETON);

//        bind(SquareRequest.class).to(SquareSubRequest.class);
        bind(String.class).annotatedWith(ColorValue.class).toInstance("red");
        bind(Integer.class).annotatedWith(EdgeValue.class).toInstance(10);
        bind(SquareRequest.class).in(Scopes.SINGLETON);

//        bind(DrawShape.class)
//                .annotatedWith(Names.named("Lines"))
//                .to(DrawLines.class)
//                .in(Scopes.SINGLETON);
//
//        bind(DrawShape.class)
//                .annotatedWith(Names.named("Dots"))
//                .to(DrawDots.class)
//                .in(Scopes.SINGLETON);
    }

    @Provides
//    @Named("Lines")
    public DrawShape provideDrawLines() {
        return new DrawLines("red", 10);
    }

//    @Provides
////    @Named("Dots")
//    public DrawShape provideDrawDots() {
//        return new DrawDots("black", 20);
//    }
}
