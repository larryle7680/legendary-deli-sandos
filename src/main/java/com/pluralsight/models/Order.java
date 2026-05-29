package com.pluralsight.models;

import java.io.StringWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String orderName;
    private LocalDateTime orderTime;
    //Creating a list of MenuItems to hold the orders in
    private List<IMenuItem> items;
    private int orderNumber;


    //Constructor
    public Order(String orderName, int orderNumber){

        this.orderName = orderName;
        this.orderTime = LocalDateTime.now();
        this.items  = new ArrayList<>();
        this.orderNumber = orderNumber;
    }

    //To get all the items that are stored inside items
    public List<IMenuItem> getItems() {
        return items;
    }

    //Adding sandwich to the item list
    public void addSandwich(Sandwich sandwich){
        items.add(sandwich);
    }

    //Adding Drink to the item list
    public void addDrink(Drink drink){
        items.add(drink);
    }

    //Adding sandwich to the item list
    public void addChips(Chip chips){
        items.add(chips);
    }

    //Add everything together for the get total
     public double getTotal(){
        //Start stream to loop through the items, then .map it to double
        //Use method reference getPrice through the interface
        //.sum to add it all together
        double total = items.stream()
                .mapToDouble(IMenuItem::getPrice)
                .sum();
        return total;
        }
        public String receiptName(){


        //Using a dateTimeFormatter to format to the correct date.
        DateTimeFormatter timeStamp = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");

        //Creating the FileName, so it can generate the timeStamp on the fileName
//        String fileName = timeStamp + "-" + order.getOrderNumber() +".txt";

        return orderTime.format(timeStamp);
        }

        public String getFormattedOrderTime(){
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy HH:mm:ss");

        return orderTime.format(formatter);
        }

        public int getOrderNumber() {
        return orderNumber;
        }


        public String getOrderName() {
        return this.orderName;
        }

    @Override
    public String toString() {

        StringBuilder receipt = new StringBuilder();
        //Header
        receipt.append("=====================\n");
        receipt.append("Legendary Receipt\n");
        receipt.append("=====================\n");
        //Order Name
        receipt.append("Order Name: ")
                .append(getOrderName())
                .append("\n");
        //Order Number
        receipt.append("Order Number: ")
                .append(getOrderNumber())
                .append("\n");

        receipt.append("=====================\n\n");
    //Loop through items to getName and getPrices to display to the user
        for (IMenuItem item : items) {
            //using instanceof because the sandwich class is inside IMenuItem ArrayList to access
            //The ingredients that is stored into the sandwich class
            if (item instanceof Sandwich sandwich) {

                receipt.append("Sandwich - $")
                        .append(String.format("%.2f", sandwich.getPrice()))
                        .append("\n")
                                .append("Toasted: ")
                                        .append(sandwich.isToasted());

                receipt.append(sandwich.getName()).append("\n");
                //getName and getPrice for meats
                receipt.append("  Meats:\n");
                for (Meat meat : sandwich.getMeats()) {
                    receipt.append("    - ")
                            .append(meat.getName())
                            .append(" $")
                            .append(String.format("%.2f", meat.getPrice()))
                            .append("\n");
                }
                //getName and getPrice for cheeses
                receipt.append("  Cheeses:\n");
                for (Cheese cheese : sandwich.getCheeses()) {
                    receipt.append("    - ")
                            .append(cheese.getName())
                            .append(" $")
                            .append(String.format("%.2f", cheese.getPrice()))
                            .append("\n");
                }
                //getName and getPrice for toppings
                receipt.append("  Toppings:\n");
                for (Topping topping : sandwich.getToppings()) {
                    receipt.append("    - ")
                            .append(topping.getName())
                            .append(" $")
                            .append(String.format("%.2f", topping.getPrice()))
                            .append("\n");
                }
                //getName and getPrice for sauce
                receipt.append("  Sauces:\n");
                for (Sauce sauce : sandwich.getSauces()) {
                    receipt.append("    - ")
                            .append(sauce.getName())
                            .append(" $")
                            .append(String.format("%.2f", sauce.getPrice()))
                            .append("\n");
                }

                receipt.append("\n");
            }
            //Use instance of to access Drink class from IMenuItem arrayList that holds my items
            else if (item instanceof Drink drink) {
                receipt.append("Drink: ")
                        .append(drink.getName())
                        .append(" $")
                        .append(String.format("%.2f", drink.getPrice()))
                        .append("\n");
            }
            //Use instance of to access chips from IMenuItem ArrayList that holds my items
            else if (item instanceof Chip chip) {
                receipt.append("Chips: ")
                        .append(chip.getName())
                        .append(" $")
                        .append(String.format("%.2f", chip.getPrice()))
                        .append("\n");
            }
        }
        //Print out total from everything
        receipt.append("\nTotal: $")
                .append(String.format("%.2f", getTotal()));

        return receipt.toString();
    }
}




