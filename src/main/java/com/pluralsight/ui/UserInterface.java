package com.pluralsight.ui;

//Import the topping class from another package
import com.pluralsight.models.Meat;
import com.pluralsight.models.Topping;
import com.pluralsight.models.Bread;
import com.pluralsight.models.ToppingManager;

import java.util.ArrayList;
import java.util.Scanner;
public class UserInterface {
    //Import Scanner for storing users answer
    static Scanner theScanner = new Scanner(System.in);


    //addTopping method
    public void addTopping() {

        boolean isRunning = false;
        while (!isRunning) {
            System.out.println("""
                    |===============================================|
                    |                                               |
                    |██████ ▄▄▄  ▄▄▄▄  ▄▄▄▄  ▄▄ ▄▄  ▄▄  ▄▄▄▄  ▄▄▄▄\s |
                    |  ██  ██▀██ ██▄█▀ ██▄█▀ ██ ███▄██ ██ ▄▄ ███▄▄\s |
                    |  ██  ▀███▀ ██    ██    ██ ██ ▀██ ▀███▀ ▄▄██▀\s |
                    |===============================================|
                    |1.              List All Toppings              |
                    |-----------------------------------------------|
                    |2.              Add Toppings                   |
                    |-----------------------------------------------|
                    |3.              Remove Toppings                |
                    |-----------------------------------------------|
                    |4.                  Back                       |
                    |===============================================|
                    """);
            //Store users choice to navigate through the menu
            int usersChoice = theScanner.nextInt();

            switch (usersChoice) {
                case 1:
                    displayToppings();
                    break;
            }
        }
    }

    public void displayToppings() {
        ToppingManager tManager = new ToppingManager();
        boolean isRunning = false;
        while(!isRunning) {
            System.out.println("""
                    
                    |=====================================================================|
                    | ▄████▄ ▄▄    ▄▄      ██████ ▄▄▄  ▄▄▄▄  ▄▄▄▄  ▄▄ ▄▄  ▄▄  ▄▄▄▄  ▄▄▄▄\s |
                    | ██▄▄██ ██    ██        ██  ██▀██ ██▄█▀ ██▄█▀ ██ ███▄██ ██ ▄▄ ███▄▄\s |
                    | ██  ██ ██▄▄▄ ██▄▄▄     ██  ▀███▀ ██    ██    ██ ██ ▀██ ▀███▀ ▄▄██▀\s |
                    |=====================================================================|
                    """);

            //Loop through the ArrayList to display all the toppings
            //Adding a counter to list all the display results
            int counter = 1;
            for (Topping topping : tManager.getToppings()) {
                System.out.println(counter + ": " +
                        topping.getToppingName() + ": " + topping.getToppingPrice());

                counter++;
            }
            System.out.println();
            System.out.print("Please choose a number to add to your order: ");
            System.out.println();
            int usersChoice = theScanner.nextInt();

            switch(usersChoice){
                case 1:

            }
        }



    }


    //Menu sign
    public void displayUI() {
        System.out.print("""
                ===================================================================================================================================
                      ___           ___                         ___           ___           ___           ___    \s
                     /__/\\         /  /\\                       /  /\\         /  /\\         /__/\\         /  /\\   \s
                    _\\_ \\:\\       /  /:/_                     /  /:/        /  /::\\       |  |::\\       /  /:/_  \s
                   /__/\\ \\:\\     /  /:/ /\\    ___     ___    /  /:/        /  /:/\\:\\      |  |:|:\\     /  /:/ /\\ \s
                  _\\_ \\:\\ \\:\\   /  /:/ /:/_  /__/\\   /  /\\  /  /:/  ___   /  /:/  \\:\\   __|__|:|\\:\\   /  /:/ /:/_\s
                 /__/\\ \\:\\ \\:\\ /__/:/ /:/ /\\ \\  \\:\\ /  /:/ /__/:/  /  /\\ /__/:/ \\__\\:\\ /__/::::| \\:\\ /__/:/ /:/ /\\
                 \\  \\:\\ \\:\\/:/ \\  \\:\\/:/ /:/  \\  \\:\\  /:/  \\  \\:\\ /  /:/ \\  \\:\\ /  /:/ \\  \\:\\~~\\__\\/ \\  \\:\\/:/ /:/
                  \\  \\:\\ \\::/   \\  \\::/ /:/    \\  \\:\\/:/    \\  \\:\\  /:/   \\  \\:\\  /:/   \\  \\:\\        \\  \\::/ /:/\s
                   \\  \\:\\/:/     \\  \\:\\/:/      \\  \\::/      \\  \\:\\/:/     \\  \\:\\/:/     \\  \\:\\        \\  \\:\\/:/ \s
                    \\  \\::/       \\  \\::/        \\__\\/        \\  \\::/       \\  \\::/       \\  \\:\\        \\  \\::/  \s
                     \\__\\/         \\__\\/                       \\__\\/         \\__\\/         \\__\\/         \\__\\/   \s
                ----------------------------------------------------------------------------------------------------------------------------------     
                
                ░██                                                            ░██                                  \s
                ░██                                                            ░██                                  \s
                ░██          ░███████   ░████████  ░███████  ░████████   ░████████  ░██████   ░██░████ ░██    ░██   \s
                ░██         ░██    ░██ ░██    ░██ ░██    ░██ ░██    ░██ ░██    ░██       ░██  ░███     ░██    ░██   \s
                ░██         ░█████████ ░██    ░██ ░█████████ ░██    ░██ ░██    ░██  ░███████  ░██      ░██    ░██   \s
                ░██         ░██        ░██   ░███ ░██        ░██    ░██ ░██   ░███ ░██   ░██  ░██      ░██   ░███   \s
                ░██████████  ░███████   ░█████░██  ░███████  ░██    ░██  ░█████░██  ░█████░██ ░██       ░█████░██   \s
                                              ░██                                                             ░██   \s
                                        ░███████                                                        ░███████    \s
                ------------------------------------------------------------------------------------------------------------------------------------
                
                  ░██████                                ░██                      \s
                 ░██   ░██                               ░██                      \s
                ░██          ░██████   ░████████   ░████████  ░███████   ░███████ \s
                 ░████████        ░██  ░██    ░██ ░██    ░██ ░██    ░██ ░██       \s
                        ░██  ░███████  ░██    ░██ ░██    ░██ ░██    ░██  ░███████ \s
                 ░██   ░██  ░██   ░██  ░██    ░██ ░██   ░███ ░██    ░██        ░██\s
                  ░██████    ░█████░██ ░██    ░██  ░█████░██  ░███████   ░███████ \s
                
                
                -------------------------------------------------------------------------------------------------------------------------------------
                
                """);

        boolean isRunning = false;
        //Creating a while loop to get users choice
        while (!isRunning) {
            System.out.println("""
                    
                    1. New Order
                    2. Exit
                    
                    """);
            System.out.print("Your Option: ");
            //Store their choice in a variable
            int usersChoice = theScanner.nextInt();

            switch (usersChoice) {

                case 1:
                    newOrder();
                    break;

                case 2:
                    displayUI();
                    break;
            }


        }
    }

    public void newOrder() {
        boolean isRunning = false;
        //Prompt user the menu and store their answer to use to navigate
        while (!isRunning) {
            System.out.println("""
                     | =========================================================|
                     |                                                          |
                     |  ███  ██ ▄▄▄▄▄ ▄▄   ▄▄   ▄████▄ ▄▄▄▄  ▄▄▄▄  ▄▄▄▄▄ ▄▄▄▄ \s |
                     |  ██ ▀▄██ ██▄▄  ██ ▄ ██   ██  ██ ██▄█▄ ██▀██ ██▄▄  ██▄█▄\s |
                     |  ██   ██ ██▄▄▄  ▀█▀█▀    ▀████▀ ██ ██ ████▀ ██▄▄▄ ██ ██\s |
                     |                                                          |
                     |==========================================================|
                     |                Please Choose an Option:                  |
                     |==========================================================|
                     |   1.                    Create Sandwich                  |
                     |----------------------------------------------------------|
                     |   2.                    Add Drink                        |
                     |----------------------------------------------------------|
                     |   3.                    Add Chips                        |
                     |----------------------------------------------------------|
                     |   4.                    Check Out                        |
                     |----------------------------------------------------------|
                     |   5.                    Cancel Order                     |
                     |----------------------------------------------------------|
                    
                    """);
            System.out.print("Your Option:");
            System.out.println();
            //Storing their answer to use
            int usersChoice = theScanner.nextInt();

            switch (usersChoice) {
                case 1:
                    addSandwich();
                    break;
                case 2:
                    //addDrink()
                    break;
                case 3:
                    //addChips()
                    break;
                case 4:
                    //checkOut()
                    break;
                case 5:
                    displayUI();
                    break;
            }


        }
    }

    public void addSandwich() {
        boolean isRunning = false;
        while (!isRunning) {
            System.out.println("""
                    
                    |===========================================================|
                    | ███  ██ ▄▄▄▄▄ ▄▄   ▄▄   ▄█████  ▄▄▄  ▄▄  ▄▄ ▄▄▄▄   ▄▄▄ \s  |
                    | ██ ▀▄██ ██▄▄  ██ ▄ ██   ▀▀▀▄▄▄ ██▀██ ███▄██ ██▀██ ██▀██\s  |
                    | ██   ██ ██▄▄▄  ▀█▀█▀    █████▀ ██▀██ ██ ▀██ ████▀ ▀███▀\s  |
                    |===========================================================|
                    |                   Please Choose an Option:                |
                    |===========================================================|
                    |1.                       Add Bread                         |
                    |-----------------------------------------------------------|
                    |2.                       Add Meat                          |
                    |-----------------------------------------------------------|
                    |3.                       Add Toppings                      |
                    |-----------------------------------------------------------|
                    |4.                       Add Sauce                         |
                    |-----------------------------------------------------------|
                    |5.                         Back                            |
                    |===========================================================|
                    """);
            System.out.print("Your Option: ");
            int usersChoice = theScanner.nextInt();

            //Use a switch Statement to help navigate through the menu
            switch (usersChoice) {
                case 1:
                    // addBread();
                    break;
                case 2:
                    //addMeat();
                    break;
                case 3:
                    addTopping();
                    break;
                case 4:
                    //addSauce();
                    break;
                case 5:
                    newOrder();
                    break;
            }
        }
    }
}

