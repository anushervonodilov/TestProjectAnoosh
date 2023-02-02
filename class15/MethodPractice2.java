package com.class15;

public class MethodPractice2 {

    String reverseStr(String input) {
        String newStr = "";
        for (int i = input.length() - 1; i >= 0; i--) {
            newStr += input.charAt(i);
        }
        return newStr;
    }

}
