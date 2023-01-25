package com.D2ArrayExercises;

public class Task079 {
    public static void main(String[] args) {

        double[][] nums = {{4.5, 10.0, 12.4, 20.0}, {40.7, 90.1, 30.7, 20.1}};

        for (int i = 0; i < nums.length; i ++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] * 2 + " ");
            }
            System.out.println();
        }




    }
}
