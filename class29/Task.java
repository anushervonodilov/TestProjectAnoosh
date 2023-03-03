package com.class29;

import java.util.TreeSet;

public class Task {
    public static void main(String[] args) {

        TreeSet<String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("Mexico");
        countries.add("Canada");

        System.out.println(countries);

        for (String c : countries) {
            System.out.println(c);
        }

    }
}
