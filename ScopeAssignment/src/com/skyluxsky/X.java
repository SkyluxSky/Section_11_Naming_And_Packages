package com.skyluxsky;

import java.util.Scanner;

public class X {
    private int x;

    public X(Scanner x) {
        System.out.println("Please Enter a Number: ");
        this.x = x.nextInt();
    }

    //Prints times table
    public void timesTable(){
        for (int i = 1; i < 13; i++){
            System.out.println(i + " times " + this.x + " equals " + (i * this.x));
        }
    }
}
