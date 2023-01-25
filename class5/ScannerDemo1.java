package class5;

import java.util.Scanner;

public class ScannerDemo1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

//        System.out.println("Please enter your age");
//        int age = input.nextInt();
//        System.out.println("You are " + age + " years old");
//
//        System.out.println("Please enter your weight");
//        double weight = input.nextDouble();
//        System.out.println("Your weight is " + weight + " Kgs");
//
//        System.out.println("Are you hungry?");
//        boolean hungry = input.nextBoolean();
//        System.out.println("Hungry " + hungry);

//        System.out.println("Please enter your gender");
//        char gender = input.next().charAt(0);
//        System.out.println("Your gender is " + gender);

        System.out.println("Pleas enter your name");
        String name = input.next();
        System.out.println("Your name is " + name);

        input.nextLine();
        System.out.println("Please enter your full name");
        String fullName = input.nextLine();
        System.out.println("Your full name is " + fullName);

        input.close();


    }
}
