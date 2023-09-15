package com.lamdas_stream.lambdaexcerise;

public class Persons {

    private String firstName;
    private String lastName;
    private int Age;

    public Persons(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        Age = age;
    }


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    @Override
    public String toString() {
        return "PersonExcerices{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", Age=" + Age +
                '}';
    }

}