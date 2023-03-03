package com.exercises;

public class ReverseAString {
    public static void main(String[] args) {

//        String str = "hello";
//        String rev = "";
//
//        for (int i = str.length() - 1; i >= 0; i--) {
//            rev += str.charAt(i);
//        }
//        System.out.println(rev);

        String str = "Hello";

        StringBuilder stringBuilder = new StringBuilder(str);
        System.out.println(stringBuilder.reverse());



    }
}
