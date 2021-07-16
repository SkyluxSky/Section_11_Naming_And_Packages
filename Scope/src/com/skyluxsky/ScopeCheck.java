package com.skyluxsky;

public class ScopeCheck {
    //Field - Member Variables
    public int publicVar = 0;
    private int varOne = 1;

    //Constructor
    public ScopeCheck() {
        //Prints member values
        System.out.println("ScopeCheck created, publicVar = " + publicVar + ": privateVar = " + varOne);
    }

    public int getVarOne() {
        //this keyword always calls the member variables
        return this.varOne;
    }

    public void timesTwo(){
        //privateVar is local to the method in scope
        //New variable in most local scope is the one that is used.
        int varTwo = 2;
        for (int i = 0; i < 10; i++){
            System.out.println(i + " times two is " + (i * varTwo));
        }

        //System.out.println("Value of i is now " + i);
        //Cannot find variable i, only in for loop.
    }

    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: " + innerClass.varThree);
    }

    //Inner Class - Scope
    public class InnerClass {
        private int varThree = 3;

        public InnerClass() {
            System.out.println("InnerClass created, varOne is " + varOne + ": varThree is " + varThree);
        }

        public void timesTwo(){
            //privateVar is local to the method in scope
            //New variable in most local scope is the one that is used.
            //In this case privateVar = the member of this class

            //Cals times two method from outer class.
            ScopeCheck.this.timesTwo();
            System.out.println("varOne is still available here. " + varOne);
            System.out.println("***************************************");
            for (int i = 0; i < 10; i++){
                //Prints two times 1
                System.out.println(i + " times two is " + (i * varThree));
            }

            //System.out.println("Value of i is now " + i);
            //Cannot find variable i, only in for loop.
        }

        public int getVarThree() {
            return varThree;
        }
    }
}
