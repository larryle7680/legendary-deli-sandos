package com.pluralsight.models;

import java.util.ArrayList;

public class IngredientsManager {
    //Created an empty ArrayList to hold my toppings
    private ArrayList<Topping> toppings = new ArrayList<>();

    //My constructor to add toppings into my ArrayList
    public IngredientsManager() {
        //Instantiate my toppings
        toppings.add(new Topping("Lettuce", 0.00));
        toppings.add(new Topping("Tomato", 0.00));
        toppings.add(new Topping("Onions", 0.00));
        toppings.add(new Topping("Peppers", 0.00));
        toppings.add(new Topping("Cucumbers", 0.00));
        toppings.add(new Topping("Pickles", 0.00));
    }
    public ArrayList<Topping> getToppings(){
        return toppings;
    }

}
