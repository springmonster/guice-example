package com.khch.record;

import com.google.inject.Inject;
import com.google.inject.Singleton;

@Singleton
public class PersonService {

    private final PersonRecord personRecord;

    @Inject
    public PersonService(PersonRecord personRecord) {
        this.personRecord = personRecord;
    }

    public void print() {
        System.out.println(personRecord.name());
        System.out.println(personRecord.age());
    }
}
