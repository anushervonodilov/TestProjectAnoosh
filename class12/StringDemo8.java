package com.class12;

public class StringDemo8 {
    public static void main(String[] args) {

        String str = "Java is love";
        char c = str.charAt(0);
//        System.out.println(c);
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                counter++;
            }
        }
        System.out.println(counter);

    }
}
