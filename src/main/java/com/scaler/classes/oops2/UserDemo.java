package com.scaler.classes.oops2;

public class UserDemo {

    public static void main(String[] args) {
        User u1 = new User("aaaa");
        u1.email = "a@a.com";

        User u2 = new User("aaaa111", "a1@a.com");

        System.out.println(u1);
        System.out.println(u2);
    }
}
