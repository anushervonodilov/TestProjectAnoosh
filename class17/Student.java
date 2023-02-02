package com.class17;

public class Student {

    String name;
    int age;
    double weight;
    String id;

    Student(String studentName, int studenrAge, double studentWeight, String studentId) {

        name = studentName;
        age = studenrAge;
        weight = studentWeight;
        id = studentId;

    }

    void printInfo() {
        System.out.println("Name " + name + " age " + age + " weight " +
                weight + " ID " + id);
    }


}
