package com.zipcodewilmington.scientific_calculator;

import com.zipcodewilmington.scientificcalculator.Console;
import com.zipcodewilmington.scientificcalculator.MainApplication;

import static junit.framework.TestCase.assertEquals;
/**
 * Created by Yingjie Yang 2022.
 */
public class TestMainApplication {
    public void testAddition(){
        MainApplication m1 = new MainApplication();
        double num1=10;
        double num2=2;
        double actual = Console.addition(num1, num2);
        assertEquals(12, actual);
    }

    public void testSubstraction(){
        MainApplication m1 = new MainApplication();
        double num1=10;
        double num2=2;
        double actual = Console.substraction(num1, num2);
        assertEquals(8, actual);
    }
    public void testMutiplication(){
        MainApplication m1 = new MainApplication();
        double num1=10;
        double num2=2;
        double actual = Console.mutiplication(num1, num2);
        assertEquals(20, actual);
    }
    public void testSubtraction(){
        MainApplication m1 = new MainApplication();
        double num1=10;
        double num2=2;
        double actual = Console.division(num1, num2);
        assertEquals(5, actual);
    }

}
