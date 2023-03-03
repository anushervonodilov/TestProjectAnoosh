package com.class30HomeWork;

import java.util.Collection;
import java.util.LinkedList;

public class Task5 {
    public static void main(String[] args) {

        Collection<Integer> nums = new LinkedList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);
        nums.add(40);
        nums.add(50);

        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println("The sum if all numbers is " + sum);

    }
}
