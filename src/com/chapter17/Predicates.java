package com.chapter17;

import java.util.function.Predicate;

public class Predicates {
    public static void main(String[] args) {

        Predicate<String> predicate = (word)-> word.equals("a");
        System.out.println(predicate.test("a"));
    Predicate<String> predicate1 = (word)->{
        if(word.equals("a"))return true;
        else if(word.equals("b")) return  true;
        else return  false;
    };

        System.out.println(predicate1.test("b"));
    }
}
