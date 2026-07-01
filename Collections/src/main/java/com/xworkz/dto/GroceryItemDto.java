package com.xworkz.dto;

import lombok.*;
@Getter
@ToString
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode

public class GroceryItemDto {
    private String itemName;
    private int quantity;
    private double price;
    private String category;
    }
