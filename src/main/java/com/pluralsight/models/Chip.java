package com.pluralsight.models;

public class Chip implements IMenuItem{

    //Attributes
    private String chipName;
    private double chipPrice;

    //Constructor
    public Chip(String chipName) {
        this.chipName = chipName;
        this.chipPrice = 1.50;
    }

    @Override
    public String getName() {
        return this.chipName;
    }

    @Override
    public double getPrice() {
        return this.chipPrice;
    }
}
