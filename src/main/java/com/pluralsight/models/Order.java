package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    //Attributes of order
    private String orderName;
    private int orderNumber;

    //Constructor
    public Order(String orderName, int orderNumber){
        this.orderName = orderName;
        this.orderNumber = orderNumber;
    }

    //Creating a list of MenuItems to hold the orders in
    private List<IMenuItem> items = new ArrayList<>();

    //Adding sandwich to the item list
    public void addSandwich(Sandwich sandwich){
        items.add(sandwich);
    }

    //Adding Drink to the item list
    public void addDrink(Drink drink){
        items.add(drink);
    }

    //Adding sandwich to the item list
    public void addChips(Chips chips){
        items.add(chips);
    }

    //Add everything together for the get total
    public void getTotal(){
        double total = items.stream()
                .mapToInt(item)
    }

}
