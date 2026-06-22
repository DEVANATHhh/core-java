package com.example.flyhigh.flightSearch.dto;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
public class FlightSearchDto {

    private String fromCity;
    private String toCity;
    private LocalDate journeyDate;
    private int passengers;
}