package com.pluralsight.models;

import java.util.ArrayList;
import java.util.List;

public class Order {
    //Attributes of order
    private String orderName;
    private int orderNumber;

    //Constructor
    public Order(String orderName, int orderNumber){
        this.orderName = orderName;
        this.orderNumber = orderNumber;
    }

    //Creating a list of MenuItems to hold the orders in
    private List<IMenuItem> items = new ArrayList<>();



}
