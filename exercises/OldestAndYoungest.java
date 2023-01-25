package Exercises;

import java.util.Scanner;

public class OldestAndYoungest {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first age");
        int age1 = input.nextInt();
        System.out.println("Enter the second age");
        int age2 = input.nextInt();
        System.out.println("Enter the third age");
        int age3 = input.nextInt();

        if(age1 > age2 && age1 > age3){
            System.out.println("Oldest age is " + age1);
        } else if (age2 > age1 && age2 > age3){
            System.out.println("Oldest age is " + age2);
        } else if (age3 > age1 && age3 > age2) {
            System.out.println("Oldest age is " + age3);
        }


    }
}
