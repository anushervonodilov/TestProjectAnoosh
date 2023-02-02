package com.class15;

public class MethodPracticeTester {
    public static void main(String[] args) {

        MethodPractice mp = new MethodPractice();
        boolean isEven = mp.trueOrFalse(100);
        System.out.println(isEven);
        boolean isEven2 = mp.trueOrFalse(12);
        System.out.println(isEven2);
        boolean isEven3 = mp.trueOrFalse(20);
        System.out.println(isEven3);

    }
}
