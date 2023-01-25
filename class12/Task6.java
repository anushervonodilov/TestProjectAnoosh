package com.class12;

public class Task6 {
    public static void main(String[] args) {

        String[][] countries = {{"USA", "Canada", "Mexico"},
                {"Brazil", "Peru", "Argentina", "Columbia"},
                {"Germany", "France", "Italy", "Poland", "Spain"},
                {"Lesotho", "Namibia", "Botswana", "Swaziland"},
        };

        int counter = 0;

        for (String[] country : countries) {
            for (String s : country) {
                System.out.print(s + " ");
                counter++;
            }
            System.out.println();
        }
        System.out.println("Total countries " + counter);


    }
}
