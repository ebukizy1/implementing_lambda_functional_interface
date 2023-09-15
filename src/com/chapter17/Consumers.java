package com.chapter17;

import java.util.Map;
import java.util.Set;
import java.util.function.BiConsumer;

public class Consumers {
    public static void main(String[] args) {
        Map<String, Integer> map = Map.of(
                "segun", 20,
                "retnar", 60
        );

        map.forEach(  (firstNumber, secondNumber)->
                System.out.println(firstNumber + secondNumber));
    }
}
