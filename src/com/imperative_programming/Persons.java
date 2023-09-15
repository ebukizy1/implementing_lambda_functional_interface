package com.imperative_programming;

public class Persons {
    private final String name;



    private final Gender gender;

    public Persons(String name, Gender gender) {
        this.name = name;
        this.gender = gender;
    }


    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                '}';
    }
}

