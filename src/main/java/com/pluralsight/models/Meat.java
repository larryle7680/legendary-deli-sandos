package com.pluralsight.models;
import com.pluralsight.ui.UserInterface;

public class Meat {
    //Attributes
    private String meatName;
    private double meatPrice;

    //Constructor
    public Meat(String meatName, double meatPrice) {
        this.meatName = meatName;
        this.meatPrice = meatPrice;
    }

    //Setters/Getters
    public String getMeatName() {
        return meatName;
    }

    public void setMeatName(String meatName) {
        this.meatName = meatName;
    }

    public double getMeatPrice() {
        return meatPrice;
    }

    public void setMeatPrice(double meatPrice) {
        this.meatPrice = meatPrice;
    }
}
