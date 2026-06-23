package com.Xworkz.Exception.InbuildException;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
public class CheckedExample {
    static void createCheckedEvent()
            throws ClassNotFoundException, IOException {

        // Checked Exception 1
        Class.forName("com.google.project");

        // Checked Exception 2
        FileReader fr = new FileReader(new File("/notExist.txt"));

        int value = fr.read();
        System.out.println("Value: " + value);
    }

    public static void main(String[] args) {

        // SINGLE CATCH BLOCK
        try {
            createCheckedEvent();
        }
        catch (Exception exception) {
            System.out.println("Single catch: " + exception.getMessage());
        }

        // MULTIPLE CATCH BLOCK
        try {
            createCheckedEvent();
        }
        catch (ClassNotFoundException exception) {
            System.out.println("ClassNotFoundException caught: "
                    + exception.getMessage());
        }
        catch (IOException exception) {
            System.out.println("IOException caught: "
                    + exception.getMessage());
        }

        // MULTI-CATCH BLOCK
        try {
            createCheckedEvent();
        }
        catch (ClassNotFoundException | IOException e) {
            System.out.println("Multi-catch: " + e.getMessage());
        }
    }
}
