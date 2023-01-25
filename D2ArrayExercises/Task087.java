package com.D2ArrayExercises;

public class Task087 {

    String carColor;
    int carYear;
    String carMake;
    String carColor1;
    int carYear1;
    String carMake1;


    public static void main(String[] args) {

        Task087 car1 = new Task087();
        car1.carColor = "White";
        car1.carYear = 2018;
        car1.carMake = "Toyota";

        Task087 car2 = new Task087();
        car2.carYear = 2019;
        car2.carMake = "BMW";
        car2.carColor = "Black";


        System.out.println("Car color is " + car2.carColor + " and car year is " + car2.carYear +
                " car model is " + car2.carMake);

        System.out.println("Car color is " + car1.carColor + " and car year is " + car1.carYear +
                " car model is " + car1.carMake);






    }
}
