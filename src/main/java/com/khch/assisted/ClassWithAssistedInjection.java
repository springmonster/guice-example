package com.khch.assisted;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

public class ClassWithAssistedInjection {
    final private int number;
    final private ClassA classA;

    @Inject
    public ClassWithAssistedInjection(
            @Assisted int number,
            ClassA classA) {
        this.number = number;
        this.classA = classA;
    }

    public String mixedMessage() {
        String msg = this.classA.msg();
        return "Number from command line " + this.number + " " + msg;
    }
}
