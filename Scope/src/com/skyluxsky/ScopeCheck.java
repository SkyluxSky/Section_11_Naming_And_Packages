package com.skyluxsky;

public class ScopeCheck {
    //Field - Member Variables
    public int publicVar = 0;
    private int privateVar = 1;

    //Constructor
    public ScopeCheck() {
        //Prints member values
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + privateVar);
    }

    public int getPrivateVar() {
        //this keyword always calls the member variables
        return this.privateVar;
    }

    public void timesTwo(){
        //privateVar is local to the method in scope
        //New variable in most local scope is the one that is used.
        int privateVar = 2;
        for (int i = 0; i < 10; i++){
            System.out.println(i + " times two is " + (i * privateVar));
        }

        //System.out.println("Value of i is now " + i);
        //Cannot find variable i, only in for loop.
    }

    //Inner Class - Scope
    public class InnerClass {
        public int privateVar = 3;

        public InnerClass() {
            System.out.println("InnerClass created, privateVar is " + privateVar);
        }

        public void timesTwo(){
            //privateVar is local to the method in scope
            //New variable in most local scope is the one that is used.
            //In this case privateVar = the member of this class

            //Cals times two method from outer class.
            ScopeCheck.this.timesTwo();
            System.out.println("***************************************");
            for (int i = 0; i < 10; i++){
                //Prints two times 1
                System.out.println(i + " times two is " + (i * ScopeCheck.this.privateVar));
            }

            //System.out.println("Value of i is now " + i);
            //Cannot find variable i, only in for loop.
        }
    }
}
