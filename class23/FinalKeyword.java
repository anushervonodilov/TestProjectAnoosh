package com.class23;

public class FinalKeyword {

    final double gravity = 9.8;
    final double PI = 3.14;
    final double lightSpeed = 299792458;

    final void tryChangingGravity() {
//        gravity = 1.6;
    }

}

class Child extends FinalKeyword {

//    @Override
//    void tryChangingGravity() {
//
//    }

}
