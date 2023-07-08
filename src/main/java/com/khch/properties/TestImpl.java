package com.khch.properties;

import com.google.inject.Inject;
import jakarta.inject.Named;

public class TestImpl implements Test {

    @Inject
    @Named("name1")
    private String name1;

    @Inject
    @Named("name2")
    private String name2;

    @Inject
    @Named("name3")
    private String name3;


    @Override
    public String getValues() {
        return name1 + " " + name2 + " " + name3;
    }
}
