package com.pluralsight.models;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private String name;
    private LocalDateTime orderTime;
    //Creating a list of MenuItems to hold the orders in
    private List<IMenuItem> items;
    private int orderNumber;


    //Constructor
    public Order(String name, int orderNumber){

        this.name = name;
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

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString(){

        StringBuilder receiptLayout = new StringBuilder();

        receiptLayout.append("============\n");
        receiptLayout.append("Legendary Receipt\n");
        receiptLayout.append("============\n");

        receiptLayout.append("Order Name: ")
                .append(getName())
                .append("\n");

        receiptLayout.append("Order Number: ")
                .append(getOrderNumber())
                .append("\n");

        receiptLayout.append("\nItems:\n");

        for(int i = 0; i < items.size(); i++){

            IMenuItem item = items.get(i);

            receiptLayout.append(i + 1)
                    .append(". ")
                    .append(item.getName())
                    .append(", $")
                    .append(String.format("%.2f", item.getPrice()))
                    .append("\n");
        }

        receiptLayout.append("\nTotal: $")
                .append(String.format("%.2f", getTotal()));

        return receiptLayout.toString();
    }
}
