package com.class17;

public class DogTester {
    public static void main(String[] args) {

        Dog GoodBoy = new Dog("Doug", "Good boy", 1, 10.5);
        GoodBoy.printInfo();
        Dog Labrador = new Dog("Sparky", "Labrador", 2, 4);
        Labrador.printInfo();
        Dog Pitt = new Dog("Kazanova", "Pitt", 5, 4.5);
        Pitt.printInfo();
        Dog Pittbull = new Dog("Bob", "Pittbull", 7, 10);
        Pittbull.printInfo();
        Dog GoldenRetriever = new Dog("Douglas", "Golden Retriever", 2, 5);
        GoldenRetriever.printInfo();

    }
}
