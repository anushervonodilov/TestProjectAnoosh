package com.class24;

public abstract class Animal {

    abstract void speak();

}

class Dog extends Animal {

    @Override
    void speak() {
        System.out.println("Wuff wuff");
    }

}

class Cat extends Animal {

    @Override
    void speak() {
        System.out.println("Meow meow");
    }
}
