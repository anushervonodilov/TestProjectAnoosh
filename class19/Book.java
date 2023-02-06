package com.class19;

public class Book {

    int price;
    double weight;
    int year;

    Book(int price, double weight) {
        this.price = price;
        this.weight = weight;
    }

    Book(int price, double weight, int year) {
        this(price, weight);
        this.year = year;
    }

    void info() {
        System.out.println("Price is " + price + " weight is " + weight + " year is " + year);
    }

    public static void main(String[] args) {

        Book book = new Book(10, 4.5, 2020);
        book.info();

    }

}
