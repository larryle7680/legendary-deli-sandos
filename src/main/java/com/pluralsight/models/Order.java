package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class Order {

    //Constructor
    public Order(){

    }

    //Creating a list of MenuItems to hold the orders in
    private List<IMenuItem> items = new ArrayList<>();

    //To get all the items that are stored inside items
    public List<IMenuItem> getItems() {
        return items;
    }

    //Adding sandwich to the item list
    public void addSandwich(Sandwich sandwich){
        items.add(sandwich);
    }

    //Adding Drink to the item list
    public void addDrink(Drink drink){
        items.add(drink);
    }

    //Adding sandwich to the item list
    public void addChips(Chip chips){
        items.add(chips);
    }

    //Add everything together for the get total
    public double getTotal(){
        //Start stream to loop through the items, then .map it to double
        //Use method reference getPrice through the interface
        //.sum to add it all together
        double total = items.stream()
                .mapToDouble(IMenuItem::getPrice)
                .sum();
        return total;
    }


}
