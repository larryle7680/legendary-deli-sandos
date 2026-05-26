package com.pluralsight.models;

import java.util.ArrayList;

public class Sandwich implements IMenuItem{

    //Attributes
    private int size;
    private String breadType;
    private boolean isToasted;
    private double basePrice;

    //Created an empty ArrayList to hold my ingredients
    private ArrayList<Topping> toppings = new ArrayList<>();
    private ArrayList<Meat> meats = new ArrayList<>();
    private ArrayList<Cheese> cheeses = new ArrayList<>();

    //Constructor

    public Sandwich(String breadType, int size, boolean isToasted) {
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

    //Make a method to display all the toppings
    public void displayTopping(){
        for(Topping topping : toppings){
            System.out.println(topping.getName() + " $" + topping.getPrice());
        }
    }

    //Takes in an Object of toppings then use this method to add to current sandwich
    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    public void addMeat(String meat, boolean extraMeat) {
        //Starting price and it'll change depending on size
        double price = 0.00;

        //Depending on the usersChoice in the UI it'll add the Meat and Price into the ArrayList
        switch (this.size) {
            case 4:
                price = 1.00;
                if(extraMeat) price += 0.50;
                break;
            case 8:
                price = 2.00;
                if(extraMeat) price += 1.00;
                break;
            case 12:
                price = 3.00;
                if (extraMeat) price += 1.50;
                break;
        }
        //If any of these conditions are true, then it'll add to the list of Meat
        meats.add(new Meat(meat, price));

    }

    //AddCheese Method
    public void addCheese(String cheese, boolean extraCheese) {
        //Starting price and it'll change depending on size
        double price = 0.00;

        //Depending on the usersChoice in the UI it'll add the Meat and Price into the ArrayList
        switch (this.size) {
            case 4:
                price = 1.00;
                if(extraCheese) price += 0.30;
                break;
            case 8:
                price = 2.00;
                if(extraCheese) price += 0.60;
                break;
            case 12:
                price = 3.00;
                if(extraCheese) price += 0.90;
                break;
        }
        cheeses.add(new Cheese(cheese,price));

    }

    @Override
    public String getName() {
        return "Size: \n" + size + "Bread: \n" + breadType;
    }

    @Override
    public double getPrice() {
        double total = basePrice;
        //Loop through the ingredients that got placed inside the ArrayList
        //And get its price to add to the total
        for(Meat meat: meats){
            total += meat.getPrice();
        }

        for(Cheese cheese : cheeses){
            total += cheese.getPrice();
        }

        for(Topping topping: toppings){
            total += topping.getPrice();
        }

        return total;
    }
}