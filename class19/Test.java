package com.class19;

public class Test {
    public static void main(String[] args) {

        BankAccount ba = new BankAccount();
        ba.accountNumber = 651948165;
        ba.money = 65161;
        ba.deposit();

        System.out.println(ba.accountNumber);
        System.out.println(ba.money);

        System.out.println("-- Creating an object of Checking account --");

        Checking check = new Checking();
        check.accountNumber = 5169844;
        check.money = 891894;

        check.interest = 0;

        check.deposit();
        check.transfer();

        System.out.println("-- Creating an object of Savings account --");

        Savings save = new Savings();
        save.accountNumber = 494987456894l;
        save.money = 5641;
        save.profit = 200;

        save.deposit();
        save.takeProfit();

        SuperSavings sv = new SuperSavings();

        sv.accountNumber = 874158161;
        sv.profit = 100;

        sv.superSaving();
        sv.deposit();
        sv.takeProfit();


    }
}
