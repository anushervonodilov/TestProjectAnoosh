package HomeWork;

import java.util.Scanner;

public class CityAndTemperature {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("What's your city?");
        String city = input.nextLine();
        System.out.println("What's the temperature?");
        int tempF = input.nextInt();

        double tempC = (tempF - 32) * 0.5556;
        int convertTempC = (int) tempC;
        System.out.println("The temperature in " + city + " is " + convertTempC + "C");




    }
}
