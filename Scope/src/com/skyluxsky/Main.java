package com.skyluxsky;

//Scope - Refers to the visibility of a class, member, or variable.
//Java works from the innermost scope block to the outermost scope block to look for a
//variable with the requested name.

public class Main {

    public static void main(String[] args) {
        String privateVar = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance privateVar is " + scopeInstance.getPrivateVar());

        //In scope variable for main method.
        System.out.println(privateVar); //privateVar from Main()

        scopeInstance.timesTwo();//Prints local variable times two
        System.out.println("*******************************************");

        //Calls inner class
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();


    }
}
