package com.chapter17;

public class BiPredicate {
    public static void main(String[] args) {

        java.util.function.BiPredicate<Integer, Integer> sum = (firstNumber, secondNumber)->{
            if(firstNumber > secondNumber) return true;
            else if (secondNumber > firstNumber)return  true ;
            else if (secondNumber == firstNumber) return false;
            else return false;

        };
        System.out.println(sum.test(34, 50));

    }
}
