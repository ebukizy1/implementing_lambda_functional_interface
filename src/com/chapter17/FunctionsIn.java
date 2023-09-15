package com.chapter17;

import java.util.function.Function;

public class FunctionsIn {
    public static void main(String[] args) {

        Function<Integer, Integer> sumOfDigit = (firstNumber)->{
            int sum = 0;
            while (firstNumber > 0){
                sum += firstNumber % 10;
                firstNumber/= 10;
            }
            return sum;
        };
        System.out.println(sumOfDigit.apply(345));
    }
}
