package com.class30HomeWork;

import java.util.HashMap;
import java.util.Map;

public class BestBuy {
    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();
        map.put(7664847, "Printer");
        map.put(7879885, "TV");
        map.put(7664845, "Radio");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
        }


    }
}
