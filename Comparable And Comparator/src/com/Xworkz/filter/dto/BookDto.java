package com.Xworkz.filter.dto;



public class BookDto implements Comparable<BookDto> {

    private int id;
    private String title;
    private double price;

    public BookDto(int id, String title, double price) {
        this.id = id;
        this.title = title;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public int compareTo(BookDto o) {

        int cmp = Integer.compare(this.title.length(), o.title.length());

        if (cmp != 0) {
            return cmp;
        }

        return this.title.compareTo(o.title);
    }

    @Override
    public String toString() {
        return "BookDto{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", price=" + price +
                '}';
    }
}