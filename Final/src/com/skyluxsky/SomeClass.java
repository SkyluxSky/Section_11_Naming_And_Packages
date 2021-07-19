package com.skyluxsky;

public class SomeClass {

    //Field
    private static int classCounter = 0;

    //Should be private public for example
    public final int instanceNumber;
    private final String name;


    //Constructor
    public SomeClass(String name){
        this.name = name;//Sets Name
        classCounter++;//Increments Static Member Field
        instanceNumber = classCounter;//instanceNumber records Static Field (Field is constant)
        System.out.println(name + "created, instance is " + instanceNumber);
    }

    //Methods
    public int getInstanceNumber() {
        return instanceNumber;
    }
}
