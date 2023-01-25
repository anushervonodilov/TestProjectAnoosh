package Exercises;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter a number between 1 and 10: ");
            number = input.nextInt();
        } while (number < 1 || number > 10);

        System.out.println(number + " is between 1 and 10");

    }
}
