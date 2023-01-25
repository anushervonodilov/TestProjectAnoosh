package Exercises;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your quiz score");
        double quizScore = input.nextDouble();

        System.out.println("Enter your mid-term score");
        double midtermScore = input.nextDouble();

        System.out.println("Enter your final score");
        double finalScore = input.nextDouble();

        double averageScore = (quizScore + midtermScore + finalScore) / 3;

        if (averageScore >= 90) {
            System.out.println("You got an A");
        } else if (averageScore >= 70 && averageScore < 90) {
            System.out.println("You got a B");
        } else if (averageScore >= 50 && averageScore < 70) {
            System.out.println("You got a C");
        } else if (averageScore < 50) {
            System.out.println("You got an F");
        }




    }
}
