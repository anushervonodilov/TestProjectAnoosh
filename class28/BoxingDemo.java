package com.class28;

import java.util.ArrayList;

public class BoxingDemo {
    public static void main(String[] args) {

        Integer integer = new Integer(10);
        int number = integer; // it's auto-unboxing
        int number2 = integer.intValue(); // unboxing

        double d = 12.3; // primitive
        Double wrapperD = new Double(d); // boxing (wrapper type)
        Double wrapperP = d; // autoBoxing

        Float f = 12f;
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(12.0);

        double fg = 12f;


    }
}
