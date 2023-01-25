package Exercises;

import java.util.Scanner;

public class BirthMonth {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth month");
        String birthMonth = input.next();

        if (birthMonth.equalsIgnoreCase("June") || birthMonth.equalsIgnoreCase("July")
                || birthMonth.equalsIgnoreCase("August")) {
            System.out.println("You were born in Summer");
        } else if (birthMonth.equalsIgnoreCase("September") || birthMonth.equalsIgnoreCase("October")
                || birthMonth.equalsIgnoreCase("November")) {
            System.out.println("You were born in Fall ");
        } else if (birthMonth.equalsIgnoreCase("December") || birthMonth.equalsIgnoreCase("January")
                || birthMonth.equalsIgnoreCase("February")) {
            System.out.println("You were born in Winter");
        } else if (birthMonth.equalsIgnoreCase("March") || birthMonth.equalsIgnoreCase("April")
        || birthMonth.equalsIgnoreCase("May")) {
            System.out.println("You were born in Spring");
        }


    }
}
