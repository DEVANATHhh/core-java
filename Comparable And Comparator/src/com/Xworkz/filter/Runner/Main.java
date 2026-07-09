package com.Xworkz.filter.Runner;


import com.Xworkz.filter.dto.BookDto;
import com.Xworkz.filter.dto.PlayerDto;
import com.Xworkz.filter.dto.SoftwareVersion;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        // Book Example

        BookDto b1 = new BookDto(101, "Java", 650);
        BookDto b2 = new BookDto(102, "Python", 500);
        BookDto b3 = new BookDto(103, "C", 300);

        List<BookDto> books = new ArrayList<>();

        books.add(b1);
        books.add(b2);
        books.add(b3);

        // Natural Order

        Collections.sort(books);
        System.out.println(books);

        // Sort by id

        Collections.sort(books,
                (book1, book2) ->
                        Integer.compare(book1.getId(), book2.getId()));

        System.out.println(books);

        // Streams

        books.stream()
                .sorted()
                .forEach(System.out::println);

        books.stream()
                .sorted((book1, book2) ->
                        Integer.compare(book1.getId(), book2.getId()))
                .forEach(System.out::println);

        //-----------------------------------------------------

        // Player Example

        PlayerDto p1 = new PlayerDto(10, "Virat", 90);
        PlayerDto p2 = new PlayerDto(18, "Dhoni", 95);
        PlayerDto p3 = new PlayerDto(7, "Dhoni", 95);
        PlayerDto p4 = new PlayerDto(5, "Rohit", 80);

        List<PlayerDto> players = new ArrayList<>();

        players.add(p1);
        players.add(p2);
        players.add(p3);
        players.add(p4);

        Collections.sort(players);

        System.out.println(players);

        //-----------------------------------------------------

        // Software Version Example

        SoftwareVersion v1 = new SoftwareVersion(1, 0, 1);
        SoftwareVersion v2 = new SoftwareVersion(2, 0, 0);
        SoftwareVersion v3 = new SoftwareVersion(1, 2, 3);
        SoftwareVersion v4 = new SoftwareVersion(1, 0, 5);

        List<SoftwareVersion> versions = new ArrayList<>();

        versions.add(v1);
        versions.add(v2);
        versions.add(v3);
        versions.add(v4);

        Collections.sort(versions);

        System.out.println(versions);

        // Sort only by major version

        Collections.sort(versions,
                (ver1, ver2) ->
                        Integer.compare(ver1.getMajor(), ver2.getMajor()));

        System.out.println(versions);

        //-----------------------------------------------------

        // Sort Book only by title

        Collections.sort(books,
                (book1, book2) ->
                        book1.getTitle().compareTo(book2.getTitle()));

        System.out.println(books);

        // Streams

        books.stream()
                .sorted((book1, book2) ->
                        book1.getTitle().compareTo(book2.getTitle()))
                .forEach(System.out::println);

        //-----------------------------------------------------

        // Reusable Comparator

        Comparator<BookDto> titleComparator =
                (book1, book2) ->
                        book1.getTitle().compareTo(book2.getTitle());

        Collections.sort(books, titleComparator);

        System.out.println(books);

        books.stream()
                .sorted(titleComparator)
                .forEach(System.out::println);

        //-----------------------------------------------------

        // Comparator Chaining

        Comparator<BookDto> chainComparator =
                Comparator.comparingInt(
                                (BookDto b) -> b.getTitle().length())
                        .thenComparing(titleComparator);

        Collections.sort(books, chainComparator);

        System.out.println(books);

        //-----------------------------------------------------

        // Reverse List

        Collections.reverse(books);

        System.out.println(books);

        //-----------------------------------------------------

        // Reverse Natural Order

        Comparator<BookDto> reverseComparator =
                Collections.reverseOrder();

        Collections.sort(books, reverseComparator);

        System.out.println(books);
    }
}