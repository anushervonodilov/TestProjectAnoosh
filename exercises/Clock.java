package com.exercises;

public class Clock {
    public static void main(String[] args) {

        // create a digital clock
        // You code should print time starting 00:00 and ending 23:59.

        for (int h1 = 0; h1 <= 2 ; h1++) {

            for (int h2 = 0; h2 <= 9; h2++) {

                if (h1 == 2 && h2 == 4) {
                    break;
                }
                for (int i = 0; i <= 59; i++) {

                    System.out.println(h1 + h2 + ":" + i);
                }
            }
        }

    }
}
