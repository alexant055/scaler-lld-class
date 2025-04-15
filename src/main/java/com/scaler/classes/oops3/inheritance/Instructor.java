package com.scaler.classes.oops3.inheritance;

public class Instructor extends User {
    int salary;

    public Instructor(String name, String email, int salary, String country) {
        super(name, email, country);
        this.salary = salary;
    }

}
