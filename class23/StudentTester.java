package com.class23;

public class StudentTester {
    public static void main(String[] args) {

        Student[] array = {new SyntaxStudent(), new CollegeStudent(), new SchoolStudent()};

        for (Student student : array) {
            student.sleep();
            student.talk();
            student.eat();
        }

    }
}
