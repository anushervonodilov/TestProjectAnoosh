package com.CodingBat;

public class theEnd {
    public String theEnd(String str, boolean front) {

        String str1 = "Hello";
        boolean front1 = true;

        if (front == true) {
            return str.substring(0);
        } else {
            return str.substring(str.length() - 1);
        }

    }
}
