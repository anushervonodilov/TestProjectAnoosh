package com.class30;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo6 {
    public static void main(String[] args) {

        Map<Integer, String> studentsMap = new HashMap<>();
        studentsMap.put(1, "Nezir");
        studentsMap.put(2, "Shah");
        studentsMap.put(3, "Tami");
        studentsMap.put(4, "Aisha");

        Collection<String> values = studentsMap.values();
        System.out.println(values);

        values.removeIf(x -> x.contains("i"));
        values.removeIf(x -> x.length() > 2 && x.contains("i"));
        System.out.println(studentsMap);

    }
}
