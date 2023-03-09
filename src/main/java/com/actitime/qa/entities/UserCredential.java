package com.actitime.qa.entities;

public class UserCredential {
    private String firstName;
    private String lastName;
    private  String password;

    public UserCredential(String firstName, String lastName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPassword() {
        return password;
    }
}