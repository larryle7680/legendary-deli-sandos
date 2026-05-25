package com.pluralsight.models;

public class Drink implements IMenuItem{
    //Attributes
    private String drinkName;
    private int drinkPrice;

    //Constructor
    public Drink(String drinkName, int drinkPrice) {
        this.drinkName = drinkName;
        this.drinkPrice = drinkPrice;
    }

    @Override
    public String getName() {
        return drinkName;
    }

    @Override
    public double getPrice() {
        return drinkPrice;
    }
}
