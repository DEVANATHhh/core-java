package com.xworkz.map.dto;


import lombok.*;

import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookDto implements Serializable, Comparable<BookDto> {

    private String bookName;
    private Double price;

    @Override
    public boolean equals(Object obj) {

        if (!(obj instanceof BookDto))
            return false;

        BookDto dto = (BookDto) obj;

        return bookName.equals(dto.bookName) &&
                price.equals(dto.price);
    }

    @Override
    public int hashCode() {

        int result = Objects.hashCode(bookName);
        result = 31 * result + Objects.hashCode(price);

        return result;
    }

    @Override
    public int compareTo(BookDto o) {
        return this.bookName.compareTo(o.bookName);
    }
}
