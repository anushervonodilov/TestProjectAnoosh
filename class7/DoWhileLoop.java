package class7;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int number = 0;

        do {
            System.out.println("Pleas enter a number");
            number = input.nextInt();
        } while (number !=5);

        int number2 = 0;

        while (number2 != 5) {
            System.out.println("Pleas enter a number");
            number2 = input.nextInt();
        }





    }
}
