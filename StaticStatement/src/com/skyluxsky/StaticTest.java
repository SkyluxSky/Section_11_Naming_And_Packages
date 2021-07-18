package com.skyluxsky;

public class StaticTest {
    private static int numInstances = 0; //When static previous value is stored into memory...
    private String name;

    public StaticTest(String name) {
        this.name = name;
        this.numInstances++; //Every time constructor is used, we increment numInstances
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
