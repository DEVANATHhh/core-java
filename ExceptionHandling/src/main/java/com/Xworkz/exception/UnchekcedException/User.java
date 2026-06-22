package com.Xworkz.exception.UnchekcedException;

public class User {

    String name;

    public User(String name) {
        this.name = name;
    }

    public int nameSize() {

        int length = 0;

        try {
            length = name.length();

            if (length < 3) {
                System.out.println("name is too short");
            }
        }

        catch (NullPointerException e) {
            System.out.println("name should not be null");
            throw new NullPointerException();
        }

        return length;
    }
    }

