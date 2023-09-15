package com.chapter17;

import java.util.function.Supplier;

public class SupplierExample {
    public static void main(String[] args) {


        Supplier<Integer> supplier =()->{
          int number = 10;
          int firstNumber = 20;
          int total = 0;
          return  total = number + firstNumber;
        };

        System.out.println(supplier.get());
    }
}
