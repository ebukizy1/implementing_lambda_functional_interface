package com.lamdas_stream.oopway;

import java.util.Arrays;
import java.util.List;

public class PersonMain {
    public static void main(String[] args) {

        List<PersonObject> persons = Arrays.asList(
                new PersonObject("emma", "ciro", 18),
                new PersonObject("dele", "moshudo", 32),
                new PersonObject("torin", "kebi", 62),
                new PersonObject("ade", "mike", 43),
                new PersonObject("moses", "retner", 27),
                new PersonObject("yemi", "cina", 27),
                new PersonObject("mairaim", "cikira", 27)
        );


        PersonableImp personableImp = new PersonableImp();
        personableImp.sortByLastName(persons);
        personableImp.displayAllPerson(persons);
        List<PersonObject> personsList = personableImp.displayLastNameWithC(persons);
        System.out.println(personsList);



    }

}
