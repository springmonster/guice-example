package com.khch.properties;

import com.google.inject.Guice;
import com.google.inject.Injector;

public class PropertiesMain {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new PropertiesModule());
        Test instance = injector.getInstance(Test.class);

        System.out.println(instance.getValues());
    }
}
