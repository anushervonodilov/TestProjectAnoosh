package com.class23;

public class Student {

    void eat() {
        System.out.println("Students eat during the break");
    }

    void sleep() {
        System.out.println("Students sleep during the break");
    }

    void talk() {
        System.out.println("Students talk during the class");
    }

}

class SyntaxStudent extends Student {
    @Override
    void eat() {
        System.out.println("Syntax students also eat during the break");
    }

    @Override
    void sleep() {
        System.out.println("Syntax students also sleep during the break");
    }

    @Override
    void talk() {
        System.out.println("Syntax students also talk during the class");
    }
}

class CollegeStudent extends Student {
    @Override
    void eat() {
        System.out.println("College students do not eat during the break");
    }

    @Override
    void sleep() {
        System.out.println("College students do not sleep during the break");
    }

    @Override
    void talk() {
        System.out.println("College students do not talk during the class");
    }

}

class SchoolStudent extends Student {

}
