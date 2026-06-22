package com.Xworkz.exception.ChekcedException;
import java.io.File;
import java.io.FileNotFoundException;
public class Runner {
    public static void main(String[] args) {

        File file = new File("demo.txt");

        ReadFile readfile = new ReadFile(file);

        try {
            readfile.getFile();
            System.out.println("File found");
        }

        catch (FileNotFoundException e) {
            System.out.println("handled in runner: file not found");
            throw new RuntimeException(e);
        }
    }

}
