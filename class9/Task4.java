package com.class9;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double total = 0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Please enter the item and its price");
            String itemName = input.nextLine();
            double itemPrice = input.nextDouble();

            total += itemPrice;
            System.out.println("This is the total amount that you have to pay " + total);
        }
        System.out.println("Please pay for the items");
        double amountPaid = input.nextDouble();

        if (amountPaid > total) {
            double change = amountPaid - total;
            System.out.println("Hey here is your change " + change);
        }
        System.out.println("Thank you for shopping!");



    }
}
