package com.Xworkz.Exception.InbuildException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class UncheckedExample {

    static void createUncheckedEvent(int val) {

        // ONLY ONE SCENARIO: ArithmeticException (divide by zero)
        int result = 100 / val;
        System.out.println("Result: " + result);
    }

    public static void main(String[] args) {

        // SINGLE CATCH BLOCK
        try {
            createUncheckedEvent(2);
        }
        catch (Exception e) {
            System.out.println("Single catch block: " + e.getMessage());
        }

        // MULTIPLE CATCH BLOCK
        try {
            createUncheckedEvent(0);
        }
        catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        }

        // MULTI-CATCH BLOCK
        try {
            createUncheckedEvent(0);
        }
        catch (ArithmeticException | NullPointerException e) {
            System.out.println("Multi-catch: " + e.getClass());
        }
    }
}
