package com.class27;

public class Demo1 {
    public static void main(String[] args) {

        String name = "Alex";
        String name2 = "Paul";
        String name3 = "Jordan";


        String[] names = {"Hiral", "Nima", "Laura", "Nat"};
//        displayNames(names);
        display2(name, name2, name3);

    }

    public static void displayNames(String[] names) {
        for (String name : names) {
            System.out.println(name);
        }
    }

    public static void display2(String name, String name2, String name3) {
        System.out.println(name);
        System.out.println(name2);
        System.out.println(name3);
    }

}
