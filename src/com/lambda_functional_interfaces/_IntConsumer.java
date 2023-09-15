package com.lambda_functional_interfaces;

import java.util.function.IntConsumer;

public class _IntConsumer {

    public static void main(String[] args) {

        IntConsumer sumInteger = (number)-> {
            int square = number * number;
            int sum = number + number;
            System.out.println("the square is " + square);
            System.out.println("the sum is " + sum);
        };
        sumInteger.accept(50);





    }




}
