package Exercises;

import java.util.Scanner;

public class Country {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your country");
        String countryName = input.nextLine();

        switch (countryName) {
            case "Tajikistan":
                System.out.println("Tajik");
                break;
            case "Russia":
                System.out.println("Russian");
                break;
            case "Iran":
                System.out.println("Farsi");
                break;
            case "USA":
                System.out.println("English");
                break;
            case "Mexico":
                System.out.println("Spanish");
                break;
            default:

        }





    }
}
