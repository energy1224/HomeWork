package com.iakovenko.coursework.coursework01;

public class Holder {

    private String name;
    private  String surname;
    private int yearOfBirth;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    @Override
    public String toString() {
        return "Holder{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", yearOfBirth=" + yearOfBirth +
                '}';
    }

    public Holder(String name, String surname, int yearOfBirth) {
        this.name = name;
        this.surname = surname;
        this.yearOfBirth = yearOfBirth;




    }
}
