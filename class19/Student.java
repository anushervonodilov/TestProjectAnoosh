package com.class19;

public class Student {

    String name;
    String address;

    Student(String name, String address) {
        this.name = name;
        this.address = address;
    }

    void displayInfo() {
        System.out.println("The name is " + name + " and the address is " + address);
    }

    public static void main(String[] args) {

        Student student = new Student("Alex", "123");
        student.displayInfo();

    }

}
