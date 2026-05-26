package com.pluralsight.models;

public class Sauce implements IMenuItem{
    private String sauceName;
    private double saucePrice;

    //Constructor
    public Sauce(String sauceName, double saucePrice) {
        this.saucePrice = saucePrice;
        this.sauceName = sauceName;
    }


    @Override
    public String getName() {
        return this.sauceName;
    }

    @Override
    public double getPrice() {
        return saucePrice;
    }
}
