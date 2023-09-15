package com.lamdas_stream.oopway;

public class PersonObject implements Comparable<PersonObject> {
        private String firstName;
        private String lastName;
        private int Age;

        public PersonObject(String firstName, String lastName, int age) {
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



    @Override
    public int compareTo(PersonObject personObject) {
        return this.firstName.compareTo(personObject.firstName);
    }
}


