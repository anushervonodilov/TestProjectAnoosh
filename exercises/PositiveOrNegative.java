package Exercises;

import java.util.Scanner;

public class PositiveOrNegative {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int num = input.nextInt();

        if(num > 0) {
            System.out.println("It's a positive number");
        } else if (num < 0) {
            System.out.println("It's a negative number");
        } else {
            System.out.println("It's 0");
        }



    }
}
