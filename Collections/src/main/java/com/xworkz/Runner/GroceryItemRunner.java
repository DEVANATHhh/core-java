package com.xworkz.Runner;


import com.xworkz.dto.GroceryItemDto;

import java.util.ArrayList;
import java.util.List;

public class GroceryItemRunner {
    public static void main(String[] args) {

        List<GroceryItemDto> groceryList = new ArrayList<>();
        List<GroceryItemDto> groceryList1 = new ArrayList<>();

        // add
        groceryList.add(new GroceryItemDto("Rice", 10, 550.0, "Grains"));
        groceryList.add(new GroceryItemDto("Sugar", 5, 250.0, "Essentials"));
        groceryList.add(new GroceryItemDto("Milk", 2, 60.0, "Dairy"));
        groceryList.add(new GroceryItemDto("Bread", 3, 45.0, "Bakery"));

        groceryList1.add(new GroceryItemDto("Salt", 1, 20.0, "Essentials"));
        groceryList1.add(new GroceryItemDto("Rice", 10, 550.0, "Grains"));
        groceryList1.add(new GroceryItemDto("Sugar", 5, 250.0, "Essentials"));
        groceryList1.add(new GroceryItemDto("Milk", 2, 60.0, "Dairy"));

        // addAll
        groceryList1.addAll(groceryList);
        groceryList.addAll(groceryList1);

        System.out.println("groceryList1: " + groceryList1);
        System.out.println("Size of groceryList1: " + groceryList1.size());

        // contains
        boolean check = groceryList1.contains(groceryList.get(0));
        System.out.println("First item in groceryList exists in groceryList1: " + check);

        // containsAll
        boolean check1 = groceryList.containsAll(groceryList1);
        System.out.println("All elements of groceryList1 are in groceryList: " + check1);

        // remove
        System.out.println("Before remove size of groceryList: " + groceryList.size());
        groceryList.remove(groceryList.get(0));
        System.out.println("After remove size of groceryList: " + groceryList.size());

        // removeAll
        System.out.println("Before removeAll size of groceryList1: " + groceryList1.size());
        groceryList.removeAll(groceryList1);
        System.out.println("After removeAll size of groceryList: " + groceryList.size());

        // isEmpty
        System.out.println("Is groceryList empty: " + groceryList.isEmpty());
        System.out.println("Is groceryList1 empty: " + groceryList1.isEmpty());
    }
}

