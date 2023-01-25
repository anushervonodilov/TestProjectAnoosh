package Exercises;

import java.util.Scanner;

public class WorkDay {
    public static void main(String[] args) {

        boolean workDay = true;
        int day = 1;

        while (workDay) {
            if (day < 6) {
                System.out.println("I need a day off");
            } else {
                System.out.println("I do not need a day off any more");
                workDay = false;
            }
            day++;

        }


    }
}
