package com.pluralsight.models;

import java.util.ArrayList;

public class Sandwich {

    //Attributes
    private int size;
    private String topping;
    private String sauce;
    private String breadType;
    private boolean isToasted;
    private double basePrice;

    //Created an empty ArrayList to hold my ingredients
    private ArrayList<Topping> toppings = new ArrayList<>();
    private ArrayList<Meat> meats = new ArrayList<>();
    private ArrayList<Cheese> cheeses = new ArrayList<>();

    //Constructor

    public Sandwich(String breadType, int size, boolean isToasted, ArrayList<Topping> toppings, ArrayList<Meat> meats) {
        this.size = size;
        this.breadType = breadType;
        this.isToasted = isToasted;

        //Setting Base Price depending on Size
        if (this.size == 4) {
            this.basePrice = 5.50;
        } else if (this.size == 8) {
            this.basePrice = 7.00;
        } else if (this.size == 12) {
            this.basePrice = 8.50;
        }
    }


    public void addMeat(String meat, boolean extraMeat) {
        //Starting price and it'll change depending on size
        double price = 0.00;

        //Depending on the usersChoice in the UI it'll add the Meat and Price into the ArrayList
        switch (this.size) {
            case 4:
                price = 1.00;
                break;
            case 8:
                price = 2.00;
                break;
            case 12:
                price = 3.00;
                break;
        }
        //If they want extra meat it'll add on top of the price they chose
        if (extraMeat) {
            switch (this.size) {
                case 4:
                    price += .50;
                    break;
                case 8:
                    price += 1.00;
                    break;
                case 12:
                    price += 1.50;
                    break;

            }
            meats.add(new Meat(meat, price));

        }
    }

    //AddCheese Method
    public void addCheese(String cheese, boolean extraCheese) {
        //Starting price and it'll change depending on size
        double price = 0.00;

        //Depending on the usersChoice in the UI it'll add the Meat and Price into the ArrayList
        switch (this.size) {
            case 4:
                price = 1.00;
                break;
            case 8:
                price = 2.00;
                break;
            case 12:
                price = 3.00;
                break;
        }
        //If they want extra meat it'll add on top of the price they chose
        if (extraCheese) {
            switch (this.size) {
                case 4:
                    price += .50;
                    break;
                case 8:
                    price += 1.00;
                    break;
                case 12:
                    price += 1.50;
                    break;

            }
            cheeses.add(new Meat(cheese, price));

        }
    }
}