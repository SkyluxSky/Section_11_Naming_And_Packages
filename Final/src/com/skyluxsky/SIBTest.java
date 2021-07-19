package com.skyluxsky;

//You can put as many static initialization blocks in one class as you would like.

public class SIBTest {
    public static final String owner;

    //First SIB
    static {
        owner = "cam";
        System.out.println("SIBTest static initialization block called");
    }

    //Regular Constructor
    public SIBTest(){
        System.out.println("SIB constructor called");
    }

    //Second SIB
    static {
        System.out.println("2nd initialization block called");
    }

    public void someMethod(){
        System.out.println("someMethod() called");
    }

}
