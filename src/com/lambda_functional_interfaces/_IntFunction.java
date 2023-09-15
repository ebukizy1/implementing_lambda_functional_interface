package com.lambda_functional_interfaces;

import java.util.function.IntFunction;

public class _IntFunction {
    public static void main(String[] args) {


        IntFunction<Integer> sumOfIntegers = (number) -> {
            int sum = 0;
            while (number > 0) {
                sum += number % 10;
                number /= 10;
            }
            return sum;
        };
        int value = sumOfIntegers.apply(4567);

        System.out.println(value);
    }


}
