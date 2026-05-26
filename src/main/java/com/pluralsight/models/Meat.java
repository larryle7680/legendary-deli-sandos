package com.pluralsight.models;

public class Meat implements IMenuItem{
    //Attributes
    private String meatName;
    private double meatPrice;

    //Constructor
    public Meat(String meatName, double meatPrice) {
        this.meatName = meatName;
        this.meatPrice = meatPrice;
    }

    //Setters/Getters
    public void setMeatName(String meatName) {
        this.meatName = meatName;
    }


    public void setMeatPrice(double meatPrice) {
        this.meatPrice = meatPrice;
    }

    @Override
    public String getName() {
        return meatName;
    }

    @Override
    public double getPrice() {
        return meatPrice;
    }
}
