package com.class30;

import java.util.LinkedHashSet;
import java.util.Set;

public class EntryDemo {
    public static void main(String[] args) {

        Set<Entry> entrySet=new LinkedHashSet<>();

        entrySet.add(new Entry(1,"Nezir"));
        entrySet.add(new Entry(2,"Shah"));
        entrySet.add(new Entry(3,"Tami"));
        entrySet.add(new Entry(4,"Aisha"));

        entrySet.removeIf(x -> x.getKey() > 2 && x.getValue().contains("i"));
        System.out.println(entrySet);


    }
}
