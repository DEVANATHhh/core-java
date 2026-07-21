package com.xworkz.map.runner;
import com.xworkz.map.dto.AuthorDto;
import com.xworkz.map.dto.BookDto;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
public class Runner {


    public static void main(String[] args) {

            Map<BookDto, AuthorDto> books = new HashMap<>();

            System.out.println("---------------------put()---------------------");

            books.put(new BookDto("Java", 650.0),
                    new AuthorDto("James Gosling", "Canada"));

            books.put(new BookDto("Python", 550.0),
                    new AuthorDto("Guido van Rossum", "Netherlands"));

            books.put(new BookDto("C Programming", 450.0),
                    new AuthorDto("Dennis Ritchie", "USA"));

            books.put(new BookDto("Spring Boot", 700.0),
                    new AuthorDto("Craig Walls", "USA"));

            books.put(new BookDto("Hibernate", 600.0),
                    new AuthorDto("Gavin King", "Australia"));

            books.put(new BookDto("Hibernate", 600.0),
                    new AuthorDto("Gavin King", "Australia"));

            System.out.println("---------------------Entries---------------------");
            books.forEach((k, v) -> System.out.println(k + " " + v));

            System.out.println("---------------------keySet()---------------------");
            System.out.println(books.keySet());

            System.out.println("---------------------values()---------------------");
            System.out.println(books.values());

            System.out.println("---------------------entrySet()---------------------");
            System.out.println(books.entrySet());

            System.out.println("Size : " + books.size());

            System.out.println("---------------------containsKey()---------------------");
            System.out.println(books.containsKey(
                    new BookDto("Java", 650.0)));

            System.out.println("---------------------containsValue()---------------------");

            boolean valueCheck = books.containsValue(
                    new AuthorDto("James Gosling", "Canada"));

            if (valueCheck) {
                System.out.println("Value Present");
            } else {
                System.out.println("Value Not Present");
            }

            System.out.println("---------------------get()---------------------");

            System.out.println(books.get(
                    new BookDto("Python", 550.0)));

            System.out.println("---------------------equals()---------------------");

            Map<BookDto, AuthorDto> books2 = new TreeMap<>();

            books2.put(new BookDto("Java", 650.0),
                    new AuthorDto("James Gosling", "Canada"));

            books2.put(new BookDto("Python", 550.0),
                    new AuthorDto("Guido van Rossum", "Netherlands"));

            books2.put(new BookDto("C Programming", 450.0),
                    new AuthorDto("Dennis Ritchie", "USA"));

            books2.put(new BookDto("Spring Boot", 700.0),
                    new AuthorDto("Craig Walls", "USA"));

            books2.put(new BookDto("Hibernate", 600.0),
                    new AuthorDto("Gavin King", "Australia"));

            System.out.println("books equals books2 : " + books.equals(books2));

            System.out.println("---------------------getOrDefault()---------------------");

            AuthorDto author1 = books.getOrDefault(
                    new BookDto("Java", 650.0), null);

            System.out.println(author1);

            AuthorDto author2 = books.getOrDefault(
                    new BookDto("React", 500.0), null);

            System.out.println(author2);

            System.out.println("---------------------isEmpty()---------------------");

            System.out.println(books.isEmpty());

            System.out.println("---------------------hashCode()---------------------");

            System.out.println(books.hashCode());

            System.out.println("---------------------merge()---------------------");

            books.merge(
                    new BookDto("React", 500.0),
                    new AuthorDto("Jordan Walke", "USA"),
                    (oldValue, newValue) -> newValue);

            books.merge(
                    new BookDto("Java", 650.0),
                    new AuthorDto("Oracle", "USA"),
                    (oldValue, newValue) -> newValue);

            books.forEach((k, v) -> System.out.println(k + " " + v));

            System.out.println("---------------------putAll()---------------------");

            Map<BookDto, AuthorDto> newBooks = new HashMap<>();

            newBooks.put(
                    new BookDto("Kotlin", 620.0),
                    new AuthorDto("JetBrains", "Czech Republic"));

            newBooks.put(
                    new BookDto("Scala", 580.0),
                    new AuthorDto("Martin Odersky", "Switzerland"));

            books.putAll(newBooks);

            books.forEach((k, v) -> System.out.println(k + " " + v));

            System.out.println("---------------------replace()---------------------");

            books.replace(
                    new BookDto("Python", 550.0),
                    new AuthorDto("Python Software Foundation", "USA"));

            books.replace(
                    new BookDto("Spring Boot", 700.0),
                    new AuthorDto("Craig Walls", "USA"),
                    new AuthorDto("VMware", "USA"));

            books.forEach((k, v) -> System.out.println(k + " " + v));

            System.out.println("---------------------remove()---------------------");

            books.remove(new BookDto("Scala", 580.0));

            books.remove(
                    new BookDto("Kotlin", 620.0),
                    new AuthorDto("JetBrains", "Czech Republic"));

            books.forEach((k, v) -> System.out.println(k + " " + v));

            System.out.println("---------------------clear()---------------------");

            books.clear();

            System.out.println("Size after clear : " + books.size());
        }
    }



