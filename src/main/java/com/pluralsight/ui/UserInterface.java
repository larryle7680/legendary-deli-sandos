package com.pluralsight.ui;

//Import the topping class from another package
import com.pluralsight.models.*;

import java.util.Scanner;
public class UserInterface {
    //Import Scanner for storing users answer
    static Scanner theScanner = new Scanner(System.in);
    Sandwich sandwich;


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
                    |                   Please A Choose a Bread                 |
                    |===========================================================|
                    |1.                         White                           |
                    |-----------------------------------------------------------|
                    |2.                         Wheat                           |
                    |-----------------------------------------------------------|
                    |3.                       Gluten-Free                       |
                    |-----------------------------------------------------------|
                    |4.                        Lettuce                          |
                    |-----------------------------------------------------------|
                    |5.                         Back                            |
                    |===========================================================|
                    """);
            System.out.print("Your Option: ");
            int breadChoice = theScanner.nextInt();

            //Use a switch Statement to help navigate through the menu
            String breadType = "";
            switch (breadChoice) {
                case 1:
                    breadType = "White";
                    break;
                case 2:
                    breadType = "Wheat";
                    break;
                case 3:
                    breadType = "GlutenFree";
                    break;
                case 4:
                    breadType = "Lettuce";
                    break;
                case 5:
                    newOrder();
                    break;
            }

            System.out.println("""
                    
                    |===========================================================|
                    | ███  ██ ▄▄▄▄▄ ▄▄   ▄▄   ▄█████  ▄▄▄  ▄▄  ▄▄ ▄▄▄▄   ▄▄▄ \s  |
                    | ██ ▀▄██ ██▄▄  ██ ▄ ██   ▀▀▀▄▄▄ ██▀██ ███▄██ ██▀██ ██▀██\s  |
                    | ██   ██ ██▄▄▄  ▀█▀█▀    █████▀ ██▀██ ██ ▀██ ████▀ ▀███▀\s  |
                    |===========================================================|
                    |                   Please A Choose a Size                  |
                    |===========================================================|
                    |1.                           4"                            |
                    |-----------------------------------------------------------|
                    |2.                           8"                            |
                    |-----------------------------------------------------------|
                    |3.                           12"                           |
                    |-----------------------------------------------------------|
                    |4.                          Home                           |
                    |===========================================================|
                    """);
            //store the users input
            System.out.print("Your Option: ");
            int sizeChoice = theScanner.nextInt();
            //Creating an empty variable, so it could be modified using the switch case
            int size = 0;
            switch (sizeChoice) {
                case 1:
                    size = 4;
                    break;
                case 2:
                    size = 8;
                    break;
                case 3:
                    size = 12;
                    break;
                case 4:
                    newOrder();
                    break;
            }

            System.out.println("""
                    
                    |===========================================================|
                    | ███  ██ ▄▄▄▄▄ ▄▄   ▄▄   ▄█████  ▄▄▄  ▄▄  ▄▄ ▄▄▄▄   ▄▄▄ \s  |
                    | ██ ▀▄██ ██▄▄  ██ ▄ ██   ▀▀▀▄▄▄ ██▀██ ███▄██ ██▀██ ██▀██\s  |
                    | ██   ██ ██▄▄▄  ▀█▀█▀    █████▀ ██▀██ ██ ▀██ ████▀ ▀███▀\s  |
                    |===========================================================|
                    |                   Would you like it Toasted?              |
                    |===========================================================|
                    |1.                            Yes                          |
                    |-----------------------------------------------------------|
                    |2.                            No                           |
                    |-----------------------------------------------------------|
                    |3.                            Home                         |
                    |-----------------------------------------------------------|
                    |===========================================================|
                    """);
            //store the users input
            System.out.print("Your Option: ");
            int toastedChoice = theScanner.nextInt();

            //Created an empty boolean variable to help with menu flow
            boolean isToasted = false;

            //Add a switch statement to help navigate through the menu
            switch (toastedChoice) {
                case 1:
                    isToasted = true;
                    break;
                case 2:
                    isToasted = false;
                    break;
                case 3:
                    newOrder();
                    break;
            }

            System.out.println("""
                    
                    |===========================================================|
                    | ███  ██ ▄▄▄▄▄ ▄▄   ▄▄   ▄█████  ▄▄▄  ▄▄  ▄▄ ▄▄▄▄   ▄▄▄ \s  |
                    | ██ ▀▄██ ██▄▄  ██ ▄ ██   ▀▀▀▄▄▄ ██▀██ ███▄██ ██▀██ ██▀██\s  |
                    | ██   ██ ██▄▄▄  ▀█▀█▀    █████▀ ██▀██ ██ ▀██ ████▀ ▀███▀\s  |
                    |===========================================================|
                    |                       Choose your meat                    |
                    |===========================================================|
                    |1.                          Steak                          |
                    |-----------------------------------------------------------|
                    |2.                           Ham                           |
                    |-----------------------------------------------------------|
                    |3.                          Salami                         |
                    |-----------------------------------------------------------|
                    |4.                        Roast Beef                       |
                    |-----------------------------------------------------------|
                    |5.                         Chicken                         |
                    |-----------------------------------------------------------|
                    |6.                          Bacon                          |
                    |-----------------------------------------------------------|
                    |7.                          Home                           |
                    |===========================================================|
                    """);
            //store the users input

            int meatChoice = theScanner.nextInt();
            String meatName = "";

            switch (meatChoice) {
                case 1:
                    meatName = "Steak";
                    break;
                case 2:
                    meatName = "Ham";
                    break;
                case 3:
                    meatName = "Salami";
                    break;
                case 4:
                    meatName = "Roast Beef";
                    break;
                case 5:
                    meatName = "Chicken";
                    break;
                case 6:
                    meatName = "Bacon";
                    break;
                case 7:
                    newOrder();
                    break;
            }

            System.out.println("""
                    
                    |===========================================================|
                    | ███  ██ ▄▄▄▄▄ ▄▄   ▄▄   ▄█████  ▄▄▄  ▄▄  ▄▄ ▄▄▄▄   ▄▄▄ \s  |
                    | ██ ▀▄██ ██▄▄  ██ ▄ ██   ▀▀▀▄▄▄ ██▀██ ███▄██ ██▀██ ██▀██\s  |
                    | ██   ██ ██▄▄▄  ▀█▀█▀    █████▀ ██▀██ ██ ▀██ ████▀ ▀███▀\s  |
                    |===========================================================|
                    |                   Would you like Extra Meat?              |
                    |===========================================================|
                    |1.                            Yes                          |
                    |-----------------------------------------------------------|
                    |2.                            No                           |
                    |-----------------------------------------------------------|
                    |3.                            Home                         |
                    |-----------------------------------------------------------|
                    |===========================================================|
                    """);

            int extraMeatChoice = theScanner.nextInt();
            boolean extraMeat = false;

            switch (extraMeatChoice) {
                case 1:
                    extraMeat = true;
                    break;
                case 2:
                    extraMeat = false;
                    break;
                case 3:
                    newOrder();
                    break;
            }

            //Prompt users for cheese
            System.out.println("""
                    
                    |===========================================================|
                    | ███  ██ ▄▄▄▄▄ ▄▄   ▄▄   ▄█████  ▄▄▄  ▄▄  ▄▄ ▄▄▄▄   ▄▄▄ \s  |
                    | ██ ▀▄██ ██▄▄  ██ ▄ ██   ▀▀▀▄▄▄ ██▀██ ███▄██ ██▀██ ██▀██\s  |
                    | ██   ██ ██▄▄▄  ▀█▀█▀    █████▀ ██▀██ ██ ▀██ ████▀ ▀███▀\s  |
                    |===========================================================|
                    |                       Choose your Cheese                  |
                    |===========================================================|
                    |1.                          American                       |
                    |-----------------------------------------------------------|
                    |2.                          Provolone                      |
                    |-----------------------------------------------------------|
                    |3.                          Cheddar                        |
                    |-----------------------------------------------------------|
                    |4.                           Swiss                         |
                    |-----------------------------------------------------------|
                    |5.                           Home                          |
                    |===========================================================|
                    
                    """);
            //store the users input

            int cheeseChoice = theScanner.nextInt();
            String cheeseName = "";

            switch (cheeseChoice) {
                case 1:
                    cheeseName = "American";
                    break;
                case 2:
                    cheeseName = "Provolone";
                    break;
                case 3:
                    cheeseName = "Cheddar";
                    break;
                case 4:
                    cheeseName = "Swiss";
                    break;
                case 5:
                    newOrder();
                    break;
            }

            System.out.println("""
                    
                    |===========================================================|
                    | ███  ██ ▄▄▄▄▄ ▄▄   ▄▄   ▄█████  ▄▄▄  ▄▄  ▄▄ ▄▄▄▄   ▄▄▄ \s  |
                    | ██ ▀▄██ ██▄▄  ██ ▄ ██   ▀▀▀▄▄▄ ██▀██ ███▄██ ██▀██ ██▀██\s  |
                    | ██   ██ ██▄▄▄  ▀█▀█▀    █████▀ ██▀██ ██ ▀██ ████▀ ▀███▀\s  |
                    |===========================================================|
                    |                   Would you like Extra Cheese?            |
                    |===========================================================|
                    |1.                            Yes                          |
                    |-----------------------------------------------------------|
                    |2.                            No                           |
                    |-----------------------------------------------------------|
                    |3.                            Home                         |
                    |-----------------------------------------------------------|
                    |===========================================================|
                    """);

            int extraCheeseChoice = theScanner.nextInt();
            boolean extraCheese = false;

            switch (extraCheeseChoice) {
                case 1:
                    extraCheese = true;
                    break;
                case 2:
                    extraCheese = false;
                    break;
                case 3:
                    newOrder();
            }

            //Create the sandwich
            Sandwich sandwich = (new Sandwich(breadType, size, isToasted));
            //Use the addMeat method to add all the meat
            sandwich.addMeat(meatName, extraMeat);
            //Use the addCheese method to add all the Cheese
            sandwich.addCheese(cheeseName, extraCheese);

            System.out.println("=== Sandwich Confirmation===");
            System.out.println();
            System.out.println("Sandwich: " + sandwich.getName());
            System.out.println("Price: " + sandwich.getPrice());


        }
    }

    public void addDrink() {
        boolean isRunning = false;
        while (!isRunning) {
            System.out.println("""
                    
                    |====================================================|
                    | ▄████▄ ▄▄▄▄  ▄▄▄▄    ████▄  ▄▄▄▄  ▄▄ ▄▄  ▄▄ ▄▄ ▄▄\s |
                    | ██▄▄██ ██▀██ ██▀██   ██  ██ ██▄█▄ ██ ███▄██ ██▄█▀\s |
                    | ██  ██ ████▀ ████▀   ████▀  ██ ██ ██ ██ ▀██ ██ ██\s |
                    |====================================================|
                    |1.                        Coke                      |
                    |----------------------------------------------------|
                    |2.                       Sprite                     |
                    |----------------------------------------------------|
                    |3.                       Fanta                      |
                    |----------------------------------------------------|
                    |4.                      Jaritos                     |
                    |----------------------------------------------------|
                    |5.                      Hi-C Orange                 |
                    |----------------------------------------------------|
                    |6.                       Home                       |
                    |====================================================|
                    """);
            System.out.print("Your Option: ");
            //Store their choice into a variable to navigate through the menu
            int drinkChoice = theScanner.nextInt();
            //Empty variable to modify it depending on what they choose
            String drinkName = "";

            //Switch statement to modify the empty variable
            switch (drinkChoice) {
                case 1:
                    drinkName = "Coke";
                    break;
                case 2:
                    drinkName = "Sprite";
                    break;
                case 3:
                    drinkName = "Jaritos";
                    break;
                case 4:
                    drinkName = "Hi-C Orange";
                    break;
                case 5:
                    newOrder();
                    break;
            }
        }

    }
}

