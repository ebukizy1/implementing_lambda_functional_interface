package com.lambda_functional_interfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.function.ObjIntConsumer;

public class PersonMainObjInt {

    public static void main(String[] args) {
        List<Persons> personsList = new ArrayList<>();
        personsList.add(new Persons("c-touch", 20));
        personsList.add(new Persons("AKT", 20));
        personsList.add(new Persons("Wire", 20));
        personsList.add(new Persons("bulb lampholder", 20));
        personsList.add(new Persons("a-c ", 20));
        personsList.add(new Persons("pop", 20));
        personsList.add(new Persons("light", 20));

        int quantity = 10;

        ObjIntConsumer<Persons> personsObjIntConsumer = (persons ,quantities)->{
            int currentStockQuantity = persons.getStockQuantity();
            persons.setStockQuantity(currentStockQuantity + quantities);
        };

        personsList.forEach(persons -> personsObjIntConsumer.accept(persons, quantity));
        personsList.forEach(persons -> System.out.println("stock quantity for each person " + persons.getStockQuantity()));

    }




}
