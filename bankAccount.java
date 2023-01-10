package com.galvanize;

public class bankAccount{
    static long balance;

    static void deposit(long cents){
        balance += cents;
    }
    static void withdraw(long cents){
        balance -= cents;
    }

    static long balance(){
        return balance;
    }

    static boolean isOverDrawn(){
        if (balance >= 0){
            return false;
        } else {
            return true;
        }
    }
}
