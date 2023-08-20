
package com.khch.assisted;// Module
import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

public class AppModule extends AbstractModule {
    @Override
    protected void configure() {
        install(new FactoryModuleBuilder()
                .build(ClassWithAssistedInjectionFactory.class));
    }
}
