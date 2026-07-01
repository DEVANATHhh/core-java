package com.xworkz.Runner;


import com.xworkz.dto.GroceryItemDto;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.ListIterator;

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

        // add at specific index
        groceryList.add(0, new GroceryItemDto("Oil", 2, 300.0, "Essentials"));
        System.out.println("Size after add(index, element): " + groceryList.size());

        // addAll at specific index
        groceryList.addAll(1, groceryList1);
        System.out.println("Size after addAll(index, collection): " + groceryList.size());

        // get()
        System.out.println("Element at index 1: " + groceryList.get(1));

        // set()
        groceryList.set(2, new GroceryItemDto("Tea", 3, 180.0, "Beverages"));
        System.out.println("Element at index 2 after set(): " + groceryList.get(2));

        // indexOf()
        System.out.println(
                "Index of Tea: " +
                        groceryList.indexOf(new GroceryItemDto("Tea", 3, 180.0, "Beverages"))
        );

        // lastIndexOf()
        System.out.println(
                "Last Index of Tea: " +
                        groceryList.lastIndexOf(new GroceryItemDto("Tea", 3, 180.0, "Beverages"))
        );

        // listIterator()
        System.out.println("Elements from index 2:");
        ListIterator<GroceryItemDto> iterator = groceryList.listIterator(2);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        // subList()
        List<GroceryItemDto> subList = groceryList.subList(0, 2);
        System.out.println("Sub List: " + subList);

        // sort by price
        groceryList.sort(Comparator.comparingDouble(GroceryItemDto::getPrice));
        System.out.println("After sorting by price:");
        System.out.println(groceryList);
    }
}

