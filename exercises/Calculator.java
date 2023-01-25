package Exercises;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the first number");
        double num1 = input.nextDouble();

        System.out.println("Enter an operator. +, -, *, /");
        char operator = input.next().charAt(0);

        System.out.println("Enter the second number");
        double num2 = input.nextDouble();

        switch(operator){

            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:


        }


    }
}
