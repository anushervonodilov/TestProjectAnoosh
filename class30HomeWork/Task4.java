package com.class30HomeWork;

import java.util.Collection;
import java.util.LinkedHashSet;

public class Task4 {
    public static void main(String[] args) {

        Collection<String> strings = new LinkedHashSet<>();
        strings.add("Alex");
        strings.add("John");
        strings.add("Neytiri");
        strings.add("William");
        strings.add("Kyry");
        strings.add("Jake");

        for (String string : strings) {
            System.out.print(string + " ");
        }

    }
}
