package com.khch.record;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.name.Names;

import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        Injector injector = Guice.createInjector(new AbstractModule() {
            @Override
            protected void configure() {
                try {
                    bind(PersonService.class).toConstructor(PersonService.class.getConstructor(PersonRecord.class));
                    Properties properties = new Properties();
                    properties.load(getClass().getResourceAsStream("/app.properties"));
                    Names.bindProperties(binder(), properties);
                } catch (NoSuchMethodException | IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });


        PersonService personService = injector.getInstance(PersonService.class);

        personService.print();
    }
}
