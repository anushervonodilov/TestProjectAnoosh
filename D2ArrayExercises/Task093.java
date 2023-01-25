package com.D2ArrayExercises;

public class Task093 {
    public static void main(String[] args) {

        String str = "abracadabra alakazam";
        String target1 = "dab";
        String target2 = "ABRA";

        int c = str.indexOf('c');
        System.out.println(c);
        int space = str.indexOf(" ");
        System.out.println(space);
        int t1 = str.indexOf(target1);
        System.out.println(t1);
        int t2 = str.indexOf(target2);
        System.out.println(t2);




    }
}
