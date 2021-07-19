package com.skyluxsky;

//Final is used to define constants
//We can define a final field when we create it or when we initiate a constructor

public class Main {

    public static void main(String[] args) {
        //Each instance of the class will store its own id value
        SomeClass one = new SomeClass("one");
        SomeClass two = new SomeClass("two");
        SomeClass three = new SomeClass("three");

        //Instance Value is unique per class call/initialization
        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        //one.instanceNumber = 4; //Error member is final so it cannot be changed
        //Fields that are declared constants are often static final and not just final
        //This allows the value stored to be available when the program is first run.

        System.out.println(Math.PI);//Example of Static Constant

        //Math m = new Math();//Error Math Class has a Private Constructor
        //Math class cannot have a subclass because it is final.

        //When a class is marked final, it cannot have a subclass.


        //Example of why you would want to utilize final when creating some classes.
        int passwordEntry = 674312;
        Password password = new Password(passwordEntry);
        password.storePassword();
        password.letMeIn(passwordEntry);
        password.letMeIn(182793);
        password.letMeIn(0);

    }
}
