package com.xworkz.map.dto;
import lombok.*;
import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
public class AuthorDto implements Serializable, Comparable<AuthorDto> {

    private String authorName;
    private String country;

    @Override
    public int compareTo(AuthorDto o) {
        return this.authorName.compareTo(o.authorName);
    }
}