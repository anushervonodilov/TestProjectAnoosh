package Exercises;

import java.util.Scanner;

public class ShowGrade {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your grade");
        char grade = input.next().charAt(0);

        switch (grade) {

            case 'A':
                System.out.println("Exellent");
                break;
            case 'B':
                System.out.println("Good");
                break;
            case 'C':
                System.out.println("Average");
                break;
            case 'D':
                System.out.println("Bad");
                break;
            default:
                System.out.println("Not Acceptable");


        }


    }
}
