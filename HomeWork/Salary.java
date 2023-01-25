package HomeWork;

import java.util.Scanner;

public class Salary {
    public static void main(String[] args) {

        int bonus1 = 5000;
        int bonus2 = 3000;

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter how many years you have worked");
        int yearsWorked = input.nextInt();
        System.out.println("Please enter your annual salary");
        int salary = input.nextInt();

        if(yearsWorked >= 5){
            System.out.println("You are eligible for the bonus");

            if(salary > 50000){
                System.out.println("Your bonus will be " + bonus1);
            }else{
                System.out.println("Your bonus will be " + bonus2);
            }

        }else{
            System.out.println("You are not eligible for the bonus");
        }



    }
}
