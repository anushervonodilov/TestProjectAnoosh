package com.D2ArrayExercises;

public class Task088 {

    String breed;
    String name;
    String color;

    void huskyBark() {
        System.out.println("Husky can bark");
    }

    void bulldodBark() {
        System.out.println("Bulldog can bark");
    }

    void labradorBark() {
        System.out.println("Labrador can bark");
    }

    void huskyRun() {
        System.out.println("Husky can run");
    }

    void bulldogRun() {
        System.out.println("Bulldog can run");
    }

    void labradorRun() {
        System.out.println("Labrador can run");
    }

    void huskyPlay() {
        System.out.println("Husky can play");
    }

    void bulldogPlay() {
        System.out.println("Bulldog can play");
    }

    void labradorPlay() {
        System.out.println("Labrador can play");
    }


    public static void main(String[] args) {

        Task088 husky = new Task088();
        husky.huskyBark();
        husky.huskyRun();
        husky.huskyPlay();

        Task088 bulldog = new Task088();
        bulldog.bulldodBark();
        bulldog.bulldogRun();
        bulldog.bulldogPlay();

        Task088 labrador = new Task088();
        labrador.labradorBark();
        labrador.labradorRun();
        labrador.labradorPlay();


    }
}
