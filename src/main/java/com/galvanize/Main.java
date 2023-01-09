package com.galvanize;

import org.w3c.dom.ls.LSOutput;

public class Main {
    static String myString = "This is a String";
    public static void main(String[] args) {
        getMyString();
        getMyString();
    }
    public static void getMyString(){
        System.out.println(myString);
    }
}
