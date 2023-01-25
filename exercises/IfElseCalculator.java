package Exercises;

import java.util.Scanner;

public class IfElseCalculator {
    public static void main(String[] args) {

        System.out.println("Enter num1 op num2 (5 * 7): ");

        Scanner input = new Scanner(System.in);

        int num1 = input.nextInt();
        char op = input.next().charAt(0);
        int num2 = input.nextInt();

        if (op == '+') {
            System.out.println(num1 + num2);
        } else if (op == '-') {
            System.out.println(num1 - num2);
        } else if (op == '*') {
            System.out.println(num1 * num2);
        } else if (op == '/') {
            System.out.println(num1 / num2);
        } else {
            System.out.println("Invalid operator");
        }


    }
}
