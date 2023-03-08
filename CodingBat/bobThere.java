package com.CodingBat;

public class bobThere {
    public static void main(String[] args) {

        String str = "bob";

        for (int i = 0; i < str.length() - 2; i++) {
            if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
                System.out.println(true);
            } else {
                System.out.println(false);
            }

        }

    }
}
