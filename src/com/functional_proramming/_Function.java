package com.functional_proramming;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {


        Function<Integer, Integer> additionOfNumbersFunction = number-> number + number;

        Function<Integer, Integer> substractionOfNumbersFunction = number-> number - 20;

        Function<Integer, Integer> multiplicationfNumbersFunction = number-> number * number;

        Function<Integer, Integer> addNUmberAndSubstractTheNumberAndMultiplyGivenOutPut = additionOfNumbersFunction
                .andThen(substractionOfNumbersFunction)
                .andThen(multiplicationfNumbersFunction);

      int value =  addNUmberAndSubstractTheNumberAndMultiplyGivenOutPut.apply(20);
        System.out.println(value);


        BiFunction<Integer, Integer, Integer> biFunctionOfNumbersFunction = (firstNumber, secondNumber)->(firstNumber ++) * secondNumber;
    }
}
