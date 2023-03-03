package com.class30;

import java.util.HashMap;

public class MapsDemo3 {
    public static void main(String[] args) {

        HashMap<Integer, String> building = new HashMap<>();
        building.put(1, "Google");
        building.put(2, "Syntax");
        building.put(3, "Apple");
        building.put(4, "IBM");
        building.put(5, "Samsung");
        building.put(6, "McDonald's");
        building.put(7, "Samsung");

        System.out.println(building.size());

        building.replace(4, "Shell");
        System.out.println(building);

        building.remove(7);
        System.out.println(building);

    }
}
