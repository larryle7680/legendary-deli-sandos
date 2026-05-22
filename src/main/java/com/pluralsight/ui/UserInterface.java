package com.pluralsight.ui;

//Import the topping class from another package
import com.pluralsight.models.Topping;
import com.pluralsight.models.Bread;

import java.util.ArrayList;
import java.util.Scanner;
public class UserInterface {
    //Import Scanner for storing users answer
    static Scanner theScanner = new Scanner(System.in);

    //Making a new ArrayList for Toppings
    ArrayList<Topping> toppings = new ArrayList<>();
    ArrayList<Bread> breads = new ArrayList<>();

    //bread method to instantiate all type of breads
    public void addBread(){
        breads.add(new Bread("White", 0.00));
        breads.add(new Bread("Wheat", 0.50));
        breads.add(new Bread("Gluten-Free", 1.00));
        breads.add(new Bread("Rye", .75));
    }

    //topping method to instantiate all type of toppings
    public void addTopping(){
        toppings.add(new Topping("Lettuce", 0.00));
        toppings.add(new Topping("Tomato", 0.00));
        toppings.add(new Topping("Onions", 0.00));
        toppings.add(new Topping("Ketchup", 0.00));
        toppings.add(new Topping("Mustard", 0.00));
        toppings.add(new Topping("Ranch", 0.50));
        toppings.add(new Topping("BBQ", 0.50));
        toppings.add(new Topping("Bacon", 2.00));
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

            switch(usersChoice){

                case 1:
                    newOrder();
                    break;

                case 2:
                    displayUI();
                    break;
            }


        }
    }

    public void newOrder(){
        boolean isRunning = false;
        //Prompt user the menu and store their answer to use to navigate
        while(!isRunning) {
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
                    |   1.                    Add Sandwich                     |
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

            switch(usersChoice){
                case 1:
                    //addSandwich()
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
}
