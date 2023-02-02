package com.class15;

public class Task {

    String createEmail(String firstName, String lastName, String emailType) {
        return firstName + lastName + "@" + emailType + ".com";
    }

    public static void main(String[] args) {

        Task task = new Task();
        String email = task.createEmail("Jon", "snow", "gmail");
        System.out.println(email);

    }

}
