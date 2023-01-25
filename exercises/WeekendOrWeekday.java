package Exercises;

import java.util.Scanner;

public class WeekendOrWeekday {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find out if it's a weekend or a weekday");
        int number = input.nextInt();

        if (number >= 1 && number <= 5) {
            System.out.println("It is a weekday");
        } else if (number == 6 || number == 7) {
            System.out.println("It is a weekend");
        } else {
            System.out.println("Invalid day");
        }


    }
}
