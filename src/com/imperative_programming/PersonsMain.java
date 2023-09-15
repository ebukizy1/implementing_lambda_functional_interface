package com.imperative_programming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PersonsMain {

    public static void main(String[] args) {

        List<Persons> personsList = List.of(
                new Persons("emmanuel", Gender.MALE),
                new Persons("david", Gender.MALE),
                new Persons("segun", Gender.MALE),
                new Persons("retner", Gender.MALE),
                new Persons("loveth", Gender.FEMALE),
                new Persons("kemi", Gender.FEMALE),
                new Persons("amaka", Gender.FEMALE),
                new Persons("chineyere", Gender.FEMALE)
        );
        List<Persons> females = new ArrayList<>();
        for(Persons persons : personsList){
            if(Gender.FEMALE.equals(persons.getGender()))females.add(persons);
        }

    for(Persons female : females){
        System.out.println(female);
    }
        System.out.println("descriptive programming");
        Predicate<Persons> isPersonValid = persons -> Gender.FEMALE.equals(persons.getGender());
   List<Persons> female =   personsList.stream()
           .filter(isPersonValid)
           .toList();

    female.forEach(System.out::println);

    int [] array = {23, 56, 78, 98,22,44,56};

        int maximum = Arrays.stream(array)
                .max()
                .orElse(0);

        System.out.println(maximum);

}


}
