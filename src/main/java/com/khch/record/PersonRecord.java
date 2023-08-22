package com.khch.record;

import com.google.inject.Inject;
import com.google.inject.name.Named;

public record PersonRecord(
        String name,
        int age
) {
    @Inject
    public PersonRecord(@Named("name") final String name, @Named("age") final int age) {
        this.name = name;
        this.age = age;
    }
}
