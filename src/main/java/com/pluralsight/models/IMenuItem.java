package com.pluralsight.models;

//Creating an interface to force all the menu item to have a name and price
public interface IMenuItem {

    //Creating methods to force the menu items to have these methods.
    String getName();
    double getPrice();
}
