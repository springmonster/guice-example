package com.khch.assisted;// Main

import com.google.inject.Guice;
import com.google.inject.Injector;

import java.util.Random;

public class App {
    public static void main(String[] args) {
        int argNum = new Random().nextInt(100);
        Injector injector = Guice.createInjector(new AppModule());
        ClassWithAssistedInjectionFactory f = injector.getInstance(ClassWithAssistedInjectionFactory.class);
        ClassWithAssistedInjection ci = f.create(argNum);
        System.out.println(ci.mixedMessage());
    }
}
