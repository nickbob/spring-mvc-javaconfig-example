package ru.nickbob.model;

public class User {
    private String Fname;
    private String Sname;

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getSname() {
        return Sname;
    }

    public void setSname(String sname) {
        Sname = sname;
    }

    public User(String fname, String sname) {
        Fname = fname;
        Sname = sname;
    }

    public User() {}
}