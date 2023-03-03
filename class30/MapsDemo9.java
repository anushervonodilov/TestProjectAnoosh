package com.class30;

import java.util.TreeMap;

public class MapsDemo9 {
    public static void main(String[] args) {

        TreeMap<String, String> countries = new TreeMap<>();
        countries.put("USA", "Washington DC");
        countries.put("Russia", "Moscow");
        countries.put("Tajikistan", "Dushanbe");

        var values = countries.values();
        for (var value : values) {
            System.out.println(value);
        }

        var iterator = countries.values().iterator();
        while (iterator.hasNext()) {
            var value = iterator.next();
            System.out.println(value);
        }

    }
}
