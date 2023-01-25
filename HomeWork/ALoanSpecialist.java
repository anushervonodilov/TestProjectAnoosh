package HomeWork;

import java.util.Scanner;

public class ALoanSpecialist {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the amount of loan needed");
        int amount = input.nextInt();

        if(amount <= 200000){
            System.out.println("Your loan application is approved");
        }else{
            System.out.println("Your loan application is denied");
        }



    }
}
