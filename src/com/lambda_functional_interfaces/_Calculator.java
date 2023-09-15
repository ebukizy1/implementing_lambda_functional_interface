package com.lambda_functional_interfaces;

import java.util.Scanner;
import java.util.function.DoubleBinaryOperator;

public class _Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter a decimal number");
        double firstNumber = scanner.nextDouble();

        System.out.println("enter a decimal number");
        double secondNumber = scanner.nextDouble();

        System.out.println("enter an operator (+, -, /, *");
        char operations = scanner.next().charAt(0);

        DoubleBinaryOperator operator = null;
        switch (operations){
            case '+':
                operator =(number1, number2) -> number1 + number2;
                break;
            case '*':
                operator=(number3, number4) -> number3 * number4;
                break;
            case '/':
                operator=(number5, number6) -> number5 / number6;
                break;
            case '-' :
                operator=(number7, number8)-> number7 - number8;
                break;
        }

        double calculatorAnswer = calculate(firstNumber, secondNumber, operator);
        System.out.println(calculatorAnswer);


    }
    public static double calculate(double firstNumber, double secondNumber, DoubleBinaryOperator operator){
     return  operator.applyAsDouble(firstNumber, secondNumber);
    }
}
