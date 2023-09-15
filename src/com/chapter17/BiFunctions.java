package com.chapter17;

import java.util.function.BiFunction;
import java.util.function.BiPredicate;

public class BiFunctions {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> calculateExtractedDigit = (firstNumber, secondNumber)->{
            int sum= 0;
            int sum2 = 0;
            while (firstNumber > 0){
                sum += firstNumber % 10;
                firstNumber/=10;
            }
            while (secondNumber > 0){
                sum2 += secondNumber % 10;
                secondNumber/=10;
            }
            return sum + sum2;
        };

        System.out.println(calculateExtractedDigit.apply(456, 769));
    }
}
