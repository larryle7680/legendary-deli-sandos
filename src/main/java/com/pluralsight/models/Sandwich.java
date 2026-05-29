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
    private ArrayList<Sauce> sauces = new ArrayList<>();

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

    //Make a method to display all the toppings for confirmation
    public void displayTopping(){
        for(Topping topping : toppings){
            System.out.println(topping.getName() + " $" + topping.getPrice());
        }
    }

    //Make a method to display all sauces for confirmation
    public void displaySauce(){
        for(Sauce sauce : sauces){
            System.out.println(sauce.getName() + " $" + sauce.getPrice());
        }
    }

    //Takes in an object of sauces, then use this method to add to the current sandwich
    public void addSauce(Sauce sauce){
        sauces.add(sauce);
    }

    //Takes in an Object of toppings then use this method to add to current sandwich
    public void addTopping(Topping topping){
        toppings.add(topping);
    }

    public boolean isToasted() {
        return isToasted;
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

    //Get getters to print it out of the confirmation list


    public ArrayList<Topping> getToppings() {
        return toppings;
    }


    public ArrayList<Meat> getMeats() {
        return meats;
    }


    public ArrayList<Cheese> getCheeses() {
        return cheeses;
    }


    public ArrayList<Sauce> getSauces() {
        return sauces;
    }

    @Override
    public String getName(){
        //Using a String Builder to append things together
        StringBuilder sandwichInfo = new StringBuilder();

        sandwichInfo.append(size)
                .append("\" ")
                .append(breadType)
                .append(" Sandwich");

        //Loop through the meat and append everything inside the meat ArrayList
        for(Meat meat : meats){
            sandwichInfo.append("\n - ").append(meat.getName()).append(" Price: ").append(meat.getPrice());
        }
        //Loop through the Cheese and append everything inside the cheese ArrayList
        for(Cheese cheese : cheeses){
            sandwichInfo.append("\n- ").append(cheese.getName()).append(" Price: ").append(cheese.getPrice());
        }
        //Loop through the Toppings and append everything inside the Topping ArrayList
        for(Topping topping : toppings){
            sandwichInfo.append("\n- ").append(topping.getName()).append(" Price: ").append(topping.getPrice());
        }
        //Loop through the Sauces and append everything inside the sauces ArrayList
        for(Sauce sauce : sauces) {
            sandwichInfo.append("\n- ").append(sauce.getName()).append(" Price: ").append(sauce.getPrice());
        }
        //Add everything together
        return sandwichInfo.toString();
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