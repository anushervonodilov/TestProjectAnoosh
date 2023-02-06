package com.class20;

public class UserClass {

    String name;
    int mobileNumber;

    UserClass(String name, int mobileNumber) {
        this.name = name;
        this.mobileNumber = mobileNumber;
    }

}

class UserInfo extends UserClass {

    String userAddress;

    UserInfo(String name, int mobileNumber, String userAddress) {
        super(name, mobileNumber);
        this.userAddress = userAddress;
    }

    void userDetails() {
        System.out.println("Name is " + name + " mobile number is " + mobileNumber
                + " address is " + userAddress);
    }

    public static void main(String[] args) {

        UserInfo ui = new UserInfo("Anush", 123456789, "123 Main St");
        ui.userDetails();

    }

}
