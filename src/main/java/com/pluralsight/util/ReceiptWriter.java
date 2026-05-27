package com.pluralsight.util;

import com.pluralsight.models.IMenuItem;
import com.pluralsight.models.Order;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    public static void saveReceipt(Order order) {

        //Using LocalDate time to print the date of orders.
        LocalDateTime dateTime = LocalDateTime.now();

        //Using a dateTimeFormatter to format to the correct date.
        DateTimeFormatter timeStamp = DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss");

        //Creating the FileName, so it can generate the timeStamp on the fileName
        String fileName = timeStamp + "-" + order.getOrderNumber() +".txt";

        //Creating a fileWriter/BufferedWriter
        try {
            FileWriter fileWriter = new FileWriter("src/main/resources/receipts" + fileName + true);
            BufferedWriter bufWriter = new BufferedWriter(fileWriter);

            //Header of Receipts
            bufWriter.write("===Legendary Receipt===");
            bufWriter.newLine();

            //Loop through the Order List and print it to the csv file.
            for(IMenuItem item : order.getItems()){
                bufWriter.write("Order Name: " + order.getName());
                bufWriter.write(("Order Number: " + order.getOrderNumber()));
                bufWriter.write("Date: " + dateTime);
                bufWriter.newLine();
                bufWriter.write("Items:" + order.getItems());
                bufWriter.write("Total: $" +
                        String.format("%.2f", order.getTotal()));

                bufWriter.newLine();
            }

            bufWriter.close();

        } catch (IOException e) {
            System.out.println("Could not find file");
            throw new RuntimeException(e);
        }


    }
}
