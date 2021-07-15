// Create a suitably named package containing a class called Series
// with the following static methods:
// nSum(int n) returns the sum of all numbers from 0 to n. The first 10 numbers are:
// 0, 1, 3, 6, 10, 15, 21, 28, 36, 45, 55.
//
// factorial(int n) returns the product of all numbers from 1 to n
//      i.e. 1 * 2 * 3 * 4 ... * (n - 1) * n.
// The first 10 factorials are:
// 0, 1, 2, 6, 24, 120, 720, 5040, 40320, 362880, 3628800.
//
// fibonacci(n) returns the nth Fibonacci number. These are defined as:
// f(0) = 0
// f(1) = 1
// f(n) = f(n-1) + f(n-2)
// (so f(2) is also 1. The first 10 fibonacci numbers are:
// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55.
//
// When you have tested your functions, delete the Main class and
// produce a jar file.
//
// Create a new project and add your Series library, then test the
// three methods in the main() method of your new project.

package com.skyluxsky.mylibrary;

public class Series {

    //Method returns the sum of all numbers from 0 to n... (n is an integer of size n (passed as user input))
    public static long nSum(int n){
        return (n * (n + 1))/2; //Function returns the sum of a number from 0 to n (<3 Discrete Math)
    }

    //Takes the product of all numbers from 1 to n (or the numbers factorial (!n))
    public static long factorial(int n){
        // Factorial of !0 = 1
        if (n == 0){
            return 1;
        }

        long factorialValue = 1;
        for (int i = 1; i <= n ; i++){
            factorialValue *= i; // factor = factor * i;
        }

        return factorialValue;
    }

    //Take fibonacci sequence
    //f(0) = 0
    //f(1) = 1
    //f(n) = f(n-1) +f (n-2)
    public static long fibonacci(int n){
        //f(0) and f(1)
        if (n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        }

        //f(n)
        long nMinus1 = 1;//Initial values
        long nMinus2 = 0;//Initial values
        long fib = 0;
        for (int i = 1; i < n; i++){
            fib = (nMinus2 + nMinus1);
            nMinus2 = nMinus1;//Increments
            nMinus1 = fib;
        }

        return fib;
    }

}
