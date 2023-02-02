package com.class16;

public class Person {

    double bankBalance = 125000;
    String address = "Street 123";
    public String name = "Jon Snow";

    public static void main(String[] args) {

        Person person = new Person();
        System.out.println(person.bankBalance);
        System.out.println(person.address);
        System.out.println(person.name);

    }

}
