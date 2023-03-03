package com.class30HomeWork;

import java.util.HashMap;
import java.util.Map;

public class Task3 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();
        map.put("Alex Jones", 125000);
        map.put("John Smith", 90000);
        map.put("Darcy Doe", 135000);

        String empName = "";
        int maxSalary = 0;

        for (var entry : map.entrySet()) {
            if (entry.getValue() > maxSalary) {
                empName = entry.getKey();
                maxSalary = entry.getValue();
            }
        }

        System.out.println(empName + "=$" + maxSalary);

    }
}
