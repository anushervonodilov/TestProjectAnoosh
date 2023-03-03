package com.class30;

import java.util.HashMap;
import java.util.Set;

public class MapsDemo4 {
    public static void main(String[] args) {

        HashMap<String, Double> makeup = new HashMap<>();
        makeup.put("Lipstick", 50.0);
        makeup.put("Foundation", 40.0);
        makeup.put("Mascara", 70.0);
        makeup.put("Eyeliner", 12.2);
        makeup.put("Blush", 12.2);

        Set<String> allKeys = makeup.keySet();
        System.out.println(allKeys);
//
//        for (String s : allKeys) {
//            System.out.println(s);
//        }

        allKeys.removeIf(keys -> keys.length() > 7);
        System.out.println(allKeys);
        System.out.println(makeup);


    }
}
