package com.class16;

import com.class15HomeWork.Task6;

public class Task3 {

    void isPalindrome(String inputStr) {

        StringBuilder stringBuilder = new StringBuilder(inputStr);
        stringBuilder.reverse();
        String reversedStr = stringBuilder.toString();

        if (inputStr.equals(reversedStr)) {
            System.out.println(inputStr + " is palindrome");
        } else {
            System.out.println(inputStr + " Not palindrome");
        }
    }

    public static void main(String[] args) {

        Task3 tk3 = new Task3();
        tk3.isPalindrome("Kaya");

    }
}
