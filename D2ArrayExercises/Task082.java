package com.D2ArrayExercises;

public class Task082 {
    public static void main(String[] args) {

        int[][] a = {
                {-5,-2,-3,7},
                {1,-5,-2, 2},
                {1,-2, 3,-4}
        };

        int sum = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                sum += a[i][j];
            }
        }

        System.out.println("The sum is " + sum);

        int sum1 = 0;

        for (int[] num : a) {
            for (int i : num) {
                sum1 += i;
            }
        }
        System.out.println(sum1);




    }
}
