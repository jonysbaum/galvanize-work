package com.galvanize;

public class Main {
    static int year = 2018;
    static String color = "blue";
    static double miles = 0.0;
    static int age = 5;


    public static void main(String[] args) {
        setMiles(15);
        System.out.println(miles);
        drive(15.0);
        System.out.println(miles);
    }

    static int getYear() {
        return year;
    }

    static String getColor() {
        return color;
    }

    static double getMiles() {
        return miles;
    }

    static void addOneYear() {
        age += 1;
    }

    static void addOneMile() {
        miles = miles + 1.0;
    }

    static void resetMiles() {
        miles = 0.0;
    }
static void paint(String newColor){
        color = newColor;
}
static void setYear(int newYear){
        year = newYear;
}

static void setMiles(double newMiles){
        miles = newMiles;
}
static void drive(double milesDriven){
    for (int i = 1; i <= milesDriven; i++) {
        addOneMile();
    }
}
}

