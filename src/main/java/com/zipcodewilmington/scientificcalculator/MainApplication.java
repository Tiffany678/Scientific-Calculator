package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by Yingjie Yang 2022
 */
public class MainApplication {
    public static void main(String[] args) {
        char operator;
        double num1, num2, result;
        Scanner in = new Scanner(System.in);


        Console.println("Welcome to my calculator!");
        System.out.println("Enter your operator you want to calculator: (+, -, *,/) ");

        operator = in.next().charAt(0);

        System.out.println("Enter your first number: ");
        num1 = in.nextDouble();
        System.out.println("Enter your second number: ");
        num2 = in.nextDouble();

        switch(operator){
            case '+': result=Console.addition(num1, num2); System.out.println("Your answer is "+result); break;
            case '-': result=Console.substraction(num1, num2); System.out.println("Your answer is "+result); break;
            case '*': result=Console.mutiplication(num1, num2); System.out.println("Your answer is "+result); break;
            case '/': result=Console.division(num1, num2); System.out.println("Your answer is "+result); break;
        }
    }
}
