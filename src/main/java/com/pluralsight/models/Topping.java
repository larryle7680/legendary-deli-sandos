package com.pluralsight.models;

public class Topping implements IMenuItem{
    //Attributes
    private String toppingName;
    private double toppingPrice;

    //Constructor
    public Topping(String toppingName, double toppingPrice) {
        this.toppingName = toppingName;
        this.toppingPrice = toppingPrice;
    }

    public void setToppingPrice(double toppingPrice) {
        this.toppingPrice = toppingPrice;
    }

    public void setToppingName(String toppingName) {
        this.toppingName = toppingName;
    }


    @Override
    public String getName() {
        return this.toppingName;
    }

    @Override
    public double getPrice() {
        return toppingPrice;
    }
}
