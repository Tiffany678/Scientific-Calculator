package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by Yingjie Yang 2022
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Integer getIntegerInput(String prompt) {
        return null;
    }

    public static Double getDoubleInput(String prompt) {
        return null;
    }

    public static double addition(double number1,double number2){ return number1 + number2; }
    public static double substraction(double number1,double number2){ return number1 - number2; }
    public static double mutiplication(double number1,double number2){ return number1 * number2; }
    public static double division(double number1,double number2){ return number1 / number2; }
}
