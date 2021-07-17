package com.skyluxsky;

import java.util.ArrayList;

public class Account {
    //Field
    private String accountName;
    private int balance = 0;
    private ArrayList<Integer> transactions;

    //Constructor
    public Account(String accountName) {
        this.accountName = accountName;
        this.transactions = new ArrayList<Integer>();
    }

    //Methods
    public int getBalance() {
        return balance;
    }

    //Deposits Money
    public void deposit(int amount){
        if (amount > 0){
            transactions.add(amount);//Adds amount to arrayList
            this.balance += amount;
            System.out.println(amount + " deposited. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot deposit negative sums");
        }
    }

    //Withdraws Money
    public void withdraw(int amount){
        int withdrawal = -amount; //Sets amount as negative
        if (withdrawal < 0){
            transactions.add(withdrawal);//Adds withdrew amount to arrayList
            this.balance += withdrawal;
            System.out.println(amount + " withdrawn. Balance is now " + this.balance);
        } else {
            System.out.println("Cannot withdraw negative sums");
        }
    }

    //Sums up ArrayList
    public void calculateBalance(){
        this.balance = 0;
        //For Each Loop - The i represents the element inside of the array
        for (int i : this.transactions){
            this.balance += i;//Adds value in array list to balance
        }
        System.out.println("Calculated balance is " + this.balance);
    }
}
