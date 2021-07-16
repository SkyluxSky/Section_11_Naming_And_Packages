package com.skyluxsky;

//Scope - Refers to the visibility of a class, member, or variable.
//Java works from the innermost scope block to the outermost scope block to look for a
//variable with the requested name.

public class Main {

    public static void main(String[] args) {
        String varFour = "This is private to main()";

        ScopeCheck scopeInstance = new ScopeCheck();
        System.out.println("scopeInstance varOne is " + scopeInstance.getVarOne());
        scopeInstance.useInner(); //Method calls inner class...

        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        System.out.println("varThree is not accessible here " + innerClass.getVarThree());//varThree is private need getter

        //In scope variable for main method.
        System.out.println(varFour); //privateVar from Main()

        scopeInstance.timesTwo();//Prints local variable times two
        System.out.println("*******************************************");

        //Calls inner class
        ScopeCheck.InnerClass innerClassCall = scopeInstance.new InnerClass();
        innerClassCall.timesTwo();



    }
}
