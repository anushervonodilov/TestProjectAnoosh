package com.class24;

public abstract class Phone {

    abstract void displayPictures();
    abstract void unlockPhone();
    abstract void sendText();

}

class IPhone extends Phone {
    @Override
    void displayPictures() {
        System.out.println("IPhone can display pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Unlock your phone with face ID");
    }

    @Override
    void sendText() {
        System.out.println("Send text with iMessage");
    }
}

class Samsung extends Phone {
    @Override
    void displayPictures() {
        System.out.println("See pics in Samsung");
    }

    @Override
    void unlockPhone() {
        System.out.println("Unlock phone with fingerprints");
    }

    @Override
    void sendText() {
        System.out.println("Send text with WhatsApp");
    }
}