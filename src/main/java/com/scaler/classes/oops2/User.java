package com.scaler.classes.oops2;

public class User {
    String name;
    String email;

    public User(String name) {
        this.name = name;
    }

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "user name is " + name + " and email is " + email;
    }

}
