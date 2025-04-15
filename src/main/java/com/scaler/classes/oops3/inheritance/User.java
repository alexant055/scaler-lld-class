package com.scaler.classes.oops3.inheritance;

public class User extends Person {

    private String email;

    public User() {
    }

    public User(String name, String email, String country) {
        super(name, country);
        this.email = email;
    }

}
