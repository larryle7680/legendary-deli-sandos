package com.pluralsight.models;

public class Bread {
    //Attributes
    private String breadName;
    private double price;

    //Constructor
    public Bread(String breadName, double price) {
        this.price = price;
        this.breadName = breadName;
    }

    //Setters/Getters
    public String getBreadName() {
        return breadName;
    }

    public void setBreadName(String breadName) {
        this.breadName = breadName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
