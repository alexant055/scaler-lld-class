package com.scaler.classes.oops3.inheritance;

public class Student extends User {
    private String batchName;

    public Student(String name, String email, String batchName, String country) {
        super(name, email, country);
        this.batchName = batchName;
    }

}
