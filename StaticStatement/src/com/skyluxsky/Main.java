package com.skyluxsky;

//Static Field is known as a class variable.
//Static methods and fields belong to the class, not to instances of the class.

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
        //Both Instances have an Instance Number of 1 when methods are not static

        //All instances of a static method is stored in memory. This allows
        //for the program to understand that it has multiple instances of the same class running.

        //A static method takes account of a variable stored in memory

        //Static methods only require a full class call. It does not need to call the instance.

	    StaticTest firstInstance = new StaticTest("1st Instance");
        System.out.println(firstInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        StaticTest secondInstance = new StaticTest("2nd Instance");
        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        //All .getNumInstance method calls return the correct value because the member variable is static.
        StaticTest thirdInstance = new StaticTest("3rd Instance");
        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());


        //Static methods cannot call from non static fields or methods, because they do not
        //exist when the method is called.
        int answer = multiply(6);
        System.out.println("The answer is " + answer);
        System.out.println("Multiplier is " + multiplier);
    }

    public static int multiply(int number){
        return number * multiplier;
    }
}
