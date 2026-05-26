package com.pluralsight.models;

public class Drink implements IMenuItem{
    //Attributes
    private String drinkName;
    private String drinkSize;
    private double drinkPrice;

    //Constructor
    public Drink(String drinkName, String drinkSize) {
        this.drinkName = drinkName;
        this.drinkSize = drinkSize;

        //Start drink price at 0 and changes depending on the size
        double drinkPrice = 0;

        //Logic for the drink pricing
        if(drinkSize.equalsIgnoreCase("Small")){
            this.drinkPrice = 2.00;
        }else if(drinkSize.equalsIgnoreCase("Medium")){
            this.drinkPrice = 2.50;
        }else if(drinkSize.equalsIgnoreCase("Large")){
            this.drinkPrice = 3.00;
        }
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
