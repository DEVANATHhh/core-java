package com.Xworkz.exception.ChekcedException;
import java.io.File;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
public class ReadFile {
    File file;

    public ReadFile(File file) {
        this.file = file;
    }

    public void getFile() throws FileNotFoundException {

        try {
            FileReader fileReader = new FileReader(file);
            System.out.println("File found successfully");
        }

        catch (FileNotFoundException e) {
            throw new FileNotFoundException();
        }
    }

    }

