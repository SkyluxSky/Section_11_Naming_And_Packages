package com.skyluxsky;

//Challenge
//In the following interface declaration, what is the visibility of:
//
//1.the accessible interface
//2.the int variable SOME_CONSTANT
//3.MethodA
//4.MethodB and MethodC?

//Package-Private Interface
interface Accessible {
    int SOME_CONSTANT = 100;//All interface variables are public static (trick question)
    public void methodA();//Public Method
    void methodB();//All interface methods are public
    boolean methodC();//Public as well
}
