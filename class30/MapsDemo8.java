package com.class30;

import java.util.*;

public class MapsDemo8 {
    public static void main(String[] args) {

        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Russia", "Moscow");
        countries.put("Tajikistan", "Dushanbe");

        var entrySet = countries.entrySet();
        for (var entry : entrySet) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }

        var iterator = countries.entrySet().iterator();

        while (iterator.hasNext()) {
            var entry = iterator.next();
            System.out.println(entry.getKey() + " " + entry.getValue());
        }


    }
}
