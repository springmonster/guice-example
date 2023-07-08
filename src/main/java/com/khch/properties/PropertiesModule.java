package com.khch.properties;

import com.google.inject.AbstractModule;
import com.google.inject.Singleton;
import com.google.inject.name.Names;

import java.io.IOException;
import java.util.Properties;

public class PropertiesModule extends AbstractModule {

    @Override
    protected void configure() {

        bind(Test.class).to(TestImpl.class).in(Singleton.class);

        Properties properties = new Properties();
        try {
            properties.load(getClass().getResourceAsStream("/app.properties"));
            Names.bindProperties(binder(), properties);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
