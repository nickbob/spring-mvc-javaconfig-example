package ru.nickbob.model;

public class User {
    private String FirstName;
    private String SecondName;

    public String getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        FirstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public User(String firstName, String secondName) {
        FirstName = firstName;
        SecondName = secondName;
    }

    public User() {}
}