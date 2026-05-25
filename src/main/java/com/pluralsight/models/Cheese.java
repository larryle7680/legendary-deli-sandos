package com.pluralsight.models;

public class Cheese implements IMenuItem{
    //Attributes
    private String cheeseName;
    private double cheesePrice;

    public Cheese(String name, double price) {
        this.cheeseName = name;
        this.cheesePrice = price;
    }

    @Override
    public String getName() {
        return this.cheeseName;
    }

    @Override
    public double getPrice() {
        return this.cheesePrice;
    }



}
