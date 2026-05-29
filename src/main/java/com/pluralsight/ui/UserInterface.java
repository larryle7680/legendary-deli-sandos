package com.pluralsight.ui;

//Import the topping class from another package
import com.pluralsight.models.*;
import com.pluralsight.util.ReceiptWriter;

import java.util.Scanner;
public class UserInterface {
    //Import Scanner for storing users answer
    static Scanner theScanner = new Scanner(System.in);
    //Creating a variable, so I can store things from different methods
    private Sandwich currentSandwich;
    private Order currentOrder;


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
        System.out.print("Name for the Order?: ");
        String orderName = theScanner.nextLine();
        //Generates a random number for the order number 1-1000
        int orderNumber = (int)(Math.random() * 1000) + 1;

        //Create a new order
        currentOrder = new Order(orderName, orderNumber);

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
                    return;
                default:
                    System.out.println("Invalid Choice,\n Try Again!");

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
                     |   4.                    Add Toppings                     |
                     |----------------------------------------------------------|
                     |   5.                    Check Out                        |
                     |----------------------------------------------------------|
                     |   6.                    Cancel Order                     |
                     |==========================================================|
                    
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
                    addDrink();
                    break;
                case 3:
                    addChips();
                    break;
                case 4:
                    promptTopping();
                    break;
                case 5:
                    checkOut();
                    break;
                case 6:
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
                    |4.                        Lettuce Wrap                     |
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
                  return;
            }
            System.out.println();

            if(breadType.equalsIgnoreCase("Lettuce")){
                System.out.println(breadType + "Wrap added!");
            }else{
                System.out.println(breadType + " bread added!");
            }
            System.out.println();

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
                    return;
                default:
                    System.out.println("Invalid Input");
                    break;

            }
                System.out.println();
            System.out.println(size + " inch added!");
            System.out.println();

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
                    System.out.println("Toasted!");
                    System.out.println();
                    break;
                case 2:
                    isToasted = false;
                    System.out.println("Not Toasted!");
                    System.out.println();
                    break;
                case 3:
                    newOrder();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

            System.out.println();


            currentSandwich = new Sandwich(breadType, size, isToasted);

            System.out.println("=== Sandwich Confirmation===");
            System.out.println();
            System.out.println("Is this the correct Bread type, Size, and Toasted? (Y/N)");
            System.out.println(currentSandwich.getName());

           //Eat the line
            theScanner.nextLine();

            String usersChoice = theScanner.nextLine();

            if(usersChoice.equalsIgnoreCase("Y")){
                currentOrder.addSandwich(currentSandwich);
                return;
            }else{
                addSandwich();
            }



        }
    }





    public void promptTopping(){
        boolean isRunning = false;
        while(!isRunning){
            System.out.println("""
                    
                   |===============================================================|
                   | ▄████▄ ▄▄▄▄  ▄▄▄▄    ██████ ▄▄▄  ▄▄▄▄  ▄▄▄▄  ▄▄ ▄▄  ▄▄  ▄▄▄▄\s |
                   | ██▄▄██ ██▀██ ██▀██     ██  ██▀██ ██▄█▀ ██▄█▀ ██ ███▄██ ██ ▄▄\s |
                   | ██  ██ ████▀ ████▀     ██  ▀███▀ ██    ██    ██ ██ ▀██ ▀███▀\s |
                   |===============================================================|
                   |                           Choose an Option                    |
                   |---------------------------------------------------------------|
                   |1.                            Add Meat                         |
                   |---------------------------------------------------------------|
                   |2.                            Add Cheese                       |
                   |---------------------------------------------------------------|
                   |3.                          Add Regular Toppings               |
                   |---------------------------------------------------------------|
                   |4.                             Add Sauce                       |
                   |---------------------------------------------------------------|
                   |5.                              Back                           |
                   |===============================================================|
                    """);
            System.out.print("Your Option: ");
            int usersChoice = theScanner.nextInt();

            switch(usersChoice){
                case 1:
                    addMeat();
                    break;
                case 2:
                    addCheese();
                    break;
                case 3:
                    addTopping();
                    break;
                case 4:
                    addSauce();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }
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
                    drinkName = "Fanta";
                    break;
                case 4:
                    drinkName = "Jaritos";
                    break;
                case 5:
                    drinkName = "Hi-C Orange";
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

            System.out.println();
            System.out.println(drinkName + " added!");

            System.out.println("""
                    
                    |====================================================|
                    | ▄████▄ ▄▄▄▄  ▄▄▄▄    ████▄  ▄▄▄▄  ▄▄ ▄▄  ▄▄ ▄▄ ▄▄\s |
                    | ██▄▄██ ██▀██ ██▀██   ██  ██ ██▄█▄ ██ ███▄██ ██▄█▀\s |
                    | ██  ██ ████▀ ████▀   ████▀  ██ ██ ██ ██ ▀██ ██ ██\s |
                    |====================================================|
                    |                     Choose a Size                  |
                    |----------------------------------------------------|
                    |1.                      Small                       |
                    |----------------------------------------------------|
                    |2.                      Medium                      |
                    |----------------------------------------------------|
                    |3.                      Large                       |
                    |----------------------------------------------------|
                    |4.                       Home                       |
                    |====================================================| 
                    """);
            System.out.print("Your Option: ");
            int drinkSizeChoice = theScanner.nextInt();
            String drinkSize = "";

            //Switch statement to navigate through the choices
            switch(drinkSizeChoice){
                case 1:
                    drinkSize = "Small";
                    break;

                case 2:
                    drinkSize = "Medium";
                    break;

                case 3:
                    drinkSize = "Large";
                    break;

                case 4:
                    return;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

            System.out.println();
            System.out.println("Size: " + drinkSize + " added!");

            Drink drink = new Drink(drinkName,drinkSize);
            currentOrder.addDrink(drink);
            return;
        }

    }

    public void addChips(){
        boolean isRunning = false;
       //While the menu is running prompt this to the user
        while (!isRunning){

            System.out.println("""
                    
                   |==================================================| 
                   | ▄████▄ ▄▄▄▄  ▄▄▄▄    ▄█████ ▄▄ ▄▄ ▄▄ ▄▄▄▄   ▄▄▄▄\s|
                   | ██▄▄██ ██▀██ ██▀██   ██     ██▄██ ██ ██▄█▀ ███▄▄\s|
                   | ██  ██ ████▀ ████▀   ▀█████ ██ ██ ██ ██    ▄▄██▀\s|
                   |==================================================|
                   |1.                  Kettle Jalapeno               |
                   |--------------------------------------------------|
                   |2.                      BBQ                       |
                   |--------------------------------------------------|
                   |3.                Ruffles' Hot BBQ                |
                   |--------------------------------------------------|
                   |4.                     Funyuns                    |
                   |--------------------------------------------------|
                   |5.                   Hot Fries                    |
                   |--------------------------------------------------|
                   |6.                     Home                       |
                   |==================================================| 
                    
                    """);
            System.out.println("Your option:");
            //Store the choice inside a variable to navigate through the menu
            int chipChoice = theScanner.nextInt();
            //Create an empty variable to later modify using the menu
            String chipName = "";
            //Using a switch statement to navigate through the menu.
            switch(chipChoice){
                case 1:
                    chipName = "Kettle Jalapeno";
                    break;
                case 2:
                    chipName = "BBQ";
                    break;
                case 3:
                    chipName = "Ruffles' Hot BBQ";
                    break;
                case 4:
                    chipName = "Funyuns";
                    break;
                case 5:
                    chipName = "Hot Fries";
                    break;
                case 6:
                    return;
                default:
                    System.out.println("Invalid Choice");
                    return;
            }

            System.out.println();
            System.out.println(chipName + " added!");
            //Instantiate the Chip class, and pass through the users input
            Chip chip = new Chip(chipName,12.00);
            currentOrder.addChips(chip);
            return;

        }
    }

    public void addMeat(){
        //Make sure to create a sandwich before it crashes
        if(currentSandwich == null){
            System.out.println("Please create a sandwich first.");
            return;
        }

        boolean isRunning = false;
        while(!isRunning){
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
                    return;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

            System.out.println();
            System.out.println(meatName + " added!");

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
                    System.out.println("Extra Meat Added!");
                    break;
                case 2:
                    extraMeat = false;
                    break;
                case 3:
                    newOrder();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            }

            //Use the addMeat method to add all the meat
            currentSandwich.addMeat(meatName, extraMeat);
            return;
        }
    }

    public void addCheese(){
    //Null check to prevent it from crashing.
        if(currentSandwich == null){
            System.out.println("Please create a sandwich first.");
            return;
        }

        boolean isRunning = false;
        while(!isRunning){
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
            System.out.println();
            System.out.println(cheeseName + " added!");

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
                    System.out.println();
                    System.out.println("Extra Cheese is Added!");
                    break;
                case 2:
                    extraCheese = false;
                    break;
                case 3:
                    newOrder();
            }

            //Use the addCheese method to add all the Cheese
            currentSandwich.addCheese(cheeseName, extraCheese);
            //Break the loop
            return;

        }

    }

    public void addTopping(){

        //Null check to prevent it from crashing.
        if(currentSandwich == null){
            System.out.println("Please create a sandwich first.");
            return;
        }

        boolean isRunning = false;
        while(!isRunning){
            System.out.println("""
                    
                   |===============================================================| 
                   | ▄████▄ ▄▄▄▄  ▄▄▄▄    ██████ ▄▄▄  ▄▄▄▄  ▄▄▄▄  ▄▄ ▄▄  ▄▄  ▄▄▄▄\s |
                   | ██▄▄██ ██▀██ ██▀██     ██  ██▀██ ██▄█▀ ██▄█▀ ██ ███▄██ ██ ▄▄\s |
                   | ██  ██ ████▀ ████▀     ██  ▀███▀ ██    ██    ██ ██ ▀██ ▀███▀\s |
                   |===============================================================|
                   |                       Add Regular Topping                     |
                   |---------------------------------------------------------------|
                   |1.                          Lettuce                            |
                   |---------------------------------------------------------------|
                   |2.                          Peppers                            |
                   |---------------------------------------------------------------|
                   |3.                           Onions                            |
                   |---------------------------------------------------------------|
                   |4.                           Tomato                            |
                   |---------------------------------------------------------------|
                   |5.                           Jalapeno                          |
                   |---------------------------------------------------------------|
                   |6.                          Cucumbers                          |
                   |---------------------------------------------------------------|
                   |7.                           Pickles                           |
                   |---------------------------------------------------------------|
                   |8.                             Back                            |
                   |===============================================================|      
                    """);
             int usersChoice = theScanner.nextInt();
             String toppingName = "";

             switch(usersChoice){
                 case 1:
                     toppingName = "Lettuce";
                     break;
                 case 2:
                     toppingName = "Peppers";
                     break;
                 case 3:
                     toppingName = "Onions";
                     break;
                 case 4:
                     toppingName = "Tomato";
                     break;
                 case 5:
                     toppingName = "Jalapeno";
                     break;
                 case 6:
                     toppingName = "Cucumbers";
                     break;
                 case 7:
                     toppingName = "Pickles";
                     break;
                 case 8:
                     addSandwich();
                     break;
                 default:
                     System.out.println("Invalid Choice");
                     return;
             }

            Topping topping = new Topping(toppingName, 0.00);
            currentSandwich.addTopping(topping);

            System.out.println(toppingName + " added!");

            System.out.println();
            System.out.println("""
                    |======================|
                    |     Add Another?     |
                    |======================|
                    |1.      Yes           |
                    |----------------------|
                    |2.       No           |
                    |======================|
                    """);

            int addChoice = theScanner.nextInt();

            //Edge Case to help the flow of the APP
            if(addChoice < 1 || addChoice > 2){
                System.out.println("Invalid Choice, Try Again!");
                return;
            }

            //Press 2 to end loop/ if they press 1 it should go back to the while loop
            if(addChoice == 2){
                System.out.println("""
                    |======================|
                    | Topping Confirmation |
                    |======================|
                    """);

                currentSandwich.displayTopping();
                return;
            }




        }
    }

    public void addSauce(){

        //Null check to prevent it from crashing.
        if(currentSandwich == null){
            System.out.println("Please create a sandwich first.");
            return;
        }


        boolean isRunning = false;
        while(!isRunning){
            System.out.println("""
                    
                   |===============================================================| 
                   | ▄████▄ ▄▄▄▄  ▄▄▄▄    ██████ ▄▄▄  ▄▄▄▄  ▄▄▄▄  ▄▄ ▄▄  ▄▄  ▄▄▄▄\s |
                   | ██▄▄██ ██▀██ ██▀██     ██  ██▀██ ██▄█▀ ██▄█▀ ██ ███▄██ ██ ▄▄\s |
                   | ██  ██ ████▀ ████▀     ██  ▀███▀ ██    ██    ██ ██ ▀██ ▀███▀\s |
                   |===============================================================|
                   |                          Add Sauce?                           |
                   |---------------------------------------------------------------|
                   |1.                           Mayo                              |
                   |---------------------------------------------------------------|
                   |2.                          Mustard                            |
                   |---------------------------------------------------------------|
                   |3.                          Ketchup                            |
                   |---------------------------------------------------------------|
                   |4.                          Ranch                              |
                   |---------------------------------------------------------------|
                   |5.                          Honey Butter                       |
                   |---------------------------------------------------------------|
                   |6.                            Back                             |
                   |===============================================================|                                    
                    """);
            int usersChoice = theScanner.nextInt();
            String sauceName = "";

            switch(usersChoice){
                case 1:
                    sauceName = "Mayo";
                    break;
                case 2:
                    sauceName = "Mustard";
                    break;
                case 3:
                    sauceName = "Ketchup";
                    break;
                case 4:
                    sauceName = "Ranch";
                    break;
                case 5:
                    sauceName = "Honey Butter";
                    break;
                case 6:
                    addSandwich();
                    break;
                default:
                    System.out.println("Invalid Choice");
                    return;
            }

            //Create the Sauce
            //Add it to the currentSandwich
            Sauce sauce = new Sauce(sauceName, 0.00);
            currentSandwich.addSauce(sauce);

            System.out.println(sauceName + " added!");

            System.out.println();
            System.out.println("""
                    |======================|
                    |     Add Another?     |
                    |======================|
                    |1.      Yes           |
                    |----------------------|
                    |2.       No           |
                    |======================|
                    """);

            int addChoice = theScanner.nextInt();

            if(addChoice < 1 || addChoice > 2){
                System.out.println("Invalid Choice, Try Again!");
                return;
            }

            //Press 2 to end loop/ if they press 1 it should go back to the while loop
            if(addChoice == 2){
                System.out.println("""
                    |======================|
                    |  Sauce Confirmation  |
                    |======================|
                    """);

                currentSandwich.displaySauce();
                return;
            }




        }
    }

    public void checkOut(){

        theScanner.nextLine();
        ReceiptWriter receiptWriter = new ReceiptWriter();
            System.out.println("""
                   \s
                   |===========================================================================|
                   |                                                                       ▄▄\s |
                   | ▄█████ ▄▄ ▄▄ ▄▄▄▄▄  ▄▄▄▄ ▄▄ ▄▄ ▄▄ ▄▄  ▄▄  ▄▄▄▄   ▄████▄ ▄▄ ▄▄ ▄▄▄▄▄▄  ██\s |
                   | ██     ██▄██ ██▄▄  ██▀▀▀ ██▄█▀ ██ ███▄██ ██ ▄▄   ██  ██ ██ ██   ██    ██\s |
                   | ▀█████ ██ ██ ██▄▄▄ ▀████ ██ ██ ██ ██ ▀██ ▀███▀   ▀████▀ ▀███▀   ██    ▄▄\s |
                   |===========================================================================|\s
               \s""");


            System.out.printf("""
                   \s
                   |=================================================|\s
                   | ▄█████ ▄▄ ▄▄ ▄▄   ▄▄ ▄▄   ▄▄  ▄▄▄  ▄▄▄▄  ▄▄ ▄▄\s |
                   | ▀▀▀▄▄▄ ██ ██ ██▀▄▀██ ██▀▄▀██ ██▀██ ██▄█▄ ▀███▀\s |
                   | █████▀ ▀███▀ ██   ██ ██   ██ ██▀██ ██ ██   █  \s |
                   |=================================================|
                   |Name: %s                                        \s
                   |-------------------------------------------------
                   |Order Number: %d                                \s
                   |-------------------------------------------------
                   \s""", currentOrder.getOrderName(), currentOrder.getOrderNumber());

            //Loop through all the Items that were stored inside the item ArrayList
        //Loop through all the items inside currentSandwich for confirmation
            for(IMenuItem item: currentOrder.getItems()){
                System.out.println(item.getName() + " - $" + item.getPrice());
            }

        System.out.println("Meats: ");
            for(Meat meat : currentSandwich.getMeats()){
                System.out.println("-" + meat.getName() +  " " + meat.getPrice());
            }
            System.out.println();

        System.out.println("Cheese: ");
            for(Cheese cheese : currentSandwich.getCheeses()){
                System.out.println("-" + cheese.getName() + " " + cheese.getPrice());

            }
            System.out.println();
        System.out.println("Topping: ");
            for(Topping topping : currentSandwich.getToppings()){
                System.out.println("-" + topping.getName() + " " + topping.getPrice());

            }
            System.out.println();

        System.out.println("Sauces");
            for(Sauce sauce : currentSandwich.getSauces()){
                System.out.println("-" + sauce.getName() + " " + sauce.getPrice());

            }

        System.out.println("Beverage");
            for(IMenuItem drink : currentOrder.getItems()){
                System.out.println("-" + drink.getName() + " " + drink.getPrice());
            }
            System.out.println();



            System.out.println();
            System.out.printf("Total: $%.2f" , currentOrder.getTotal());
            System.out.println();
            System.out.println("Confirm? Y/N");
            System.out.println();
            System.out.print("Your option: ");
            String userInput = theScanner.nextLine();


            if(userInput.equalsIgnoreCase("Y")){
                receiptWriter.saveReceipt(currentOrder);
                System.out.println("Order Save!");
            }else if(userInput.equalsIgnoreCase("N")){
                System.out.println("Canceling Order");
                newOrder();
            }




    }

}

