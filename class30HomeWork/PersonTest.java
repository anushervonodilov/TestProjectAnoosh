package com.class30HomeWork;

import java.util.TreeMap;

public class PersonTest {
    public static void main(String[] args) {

        TreeMap<Integer, Person> map = new TreeMap<>();
        map.put(123, new Person("Alex", "Costa", 20, 95000));
        map.put(456, new Person("Alexis", "Creek", 22, 97500));
        map.put(789, new Person("Alexandra", "Crokoff", 19, 110000));

        for (var entry : map.entrySet()) {
            System.out.println("User ID: " + entry.getKey());
            entry.getValue().print();
        }

    }
}
