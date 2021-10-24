package com.company;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    // Not doing a GUI because it is too much...
    public static void main(String[] args) throws FileNotFoundException {
        // Show the user the database of flights.
        JSONParser jsonParser = new JSONParser();

        FileReader reader = new FileReader(".\\jsonfiles\\Ticket_Info.json");
         jsonParser.parse(reader);

        Object obj = jsonParser.parse(reader);

        JSONObject
        // The user can choose from the selection which one they want to purchase.
            // Destination, time, price variables must be accounted.

    }
}
