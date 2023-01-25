package Exercises;

import java.util.Scanner;

public class Bonus {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("How long have you been working?");
        int years = input.nextInt();
        System.out.println("What's your salary?");
        double salary = input.nextDouble();

        double Bonus = salary * 0.05;

        if(years > 5) {
            System.out.println("You are qualified to recieve 5% bonus, which is " + Bonus);
        } else {
            System.out.println("You are not qualified to recieve a bonus");
        }



    }
}
