package com.Xworkz.exception.UnchekcedException;

public class Runner {

    public static void main(String[] args) {

            User user = new User("jp");

            int length = user.nameSize();

            System.out.println("length of name is: " + length);
        }
    }

