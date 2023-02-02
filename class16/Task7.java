package com.class16;

public class Task7 {

    int sumArrayElements(int[] array) {

        int sum = 0;
        for (int nums : array) {
            sum += nums;
        }
        return sum;
    }

    public static void main(String[] args) {

        int[] arr = {10, 25, 35, 45};
        Task7 task7 = new Task7();
        System.out.println(task7.sumArrayElements(arr));

    }

}
