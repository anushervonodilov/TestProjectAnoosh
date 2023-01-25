package Exercises;

import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your score below: ");
        int score = input.nextInt();

        if(score > 80){
            System.out.println("You got an A");
        } else if (score >= 60 && score <= 80){
            System.out.println("You got a B");
        }



    }
}
