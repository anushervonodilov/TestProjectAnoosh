package com.D2ArrayExercises;

public class Task081 {
    public static void main(String[] args) {

        int[] arr = {10, 20, 40, 70, 90};

        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);


    }
}
