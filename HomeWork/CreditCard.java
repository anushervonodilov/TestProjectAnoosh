package HomeWork;

import java.util.Scanner;

public class CreditCard {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Do you have a credit card?");
        String answer = input.nextLine();

        if (answer.equals("Yes")) {
            System.out.println("What is the balance of your credit card?");
            int balance = input.nextInt();

            if (balance > 1000) {
                System.out.println("Pay it off immediately");
            } else {
                System.out.println("You can spend more");
            }
        }else{
            System.out.println("We would like to offer you a credit card");
        }

    }
}
