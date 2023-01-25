package com.exercises;

import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();

        if (num1 > num2) {
            if (num1 > num3) {
                System.out.println(num1 + " is the greatest");
            }
        } if (num2 > num1) {
            if (num2 > num3) {
                System.out.println(num2 + " is the greatest");
            }
        } if (num3 > num1) {
            if (num3 > num2) {
                System.out.println(num3 + " is the greatest");
            }
        }


    }
}
