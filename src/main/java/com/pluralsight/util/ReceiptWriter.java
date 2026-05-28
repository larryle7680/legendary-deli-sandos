package com.pluralsight.util;

import com.pluralsight.models.IMenuItem;
import com.pluralsight.models.Order;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ReceiptWriter {

    private String SAVEAS = "src/main/resources/receipts";

    public ReceiptWriter(){

        File saveAs = new File(SAVEAS);
    }

    public void saveReceipt(Order order) {


        String receiptsAs = SAVEAS + "/"+ order.receiptName();
        try (BufferedWriter bufWriter = new BufferedWriter( new FileWriter(receiptsAs))){


            //Header of Receipts
            bufWriter.write(order.toString());


            bufWriter.close();

        } catch (IOException e) {
            System.out.println("Could not WRITE to file");
            throw new RuntimeException(e);
        }


    }
}
