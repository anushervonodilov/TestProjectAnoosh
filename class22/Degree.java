package com.class22;

public class Degree {

    void getPrerequisite() {
        System.out.println("To get a Degree you need high school Diploma");
    }

}

class Bachelors extends Degree {

}

class Masters extends Degree {

    void getPrerequisite() {
        super.getPrerequisite();
    }
}

class DegreeTester {
    public static void main(String[] args) {

        Degree degree = new Degree();
        degree.getPrerequisite();
        Bachelors bachelors = new Bachelors();
        bachelors.getPrerequisite();
        Masters masters = new Masters();
        masters.getPrerequisite();

    }
}