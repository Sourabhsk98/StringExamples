package com.StringToIntExample;
import java.lang.*;
public class StringToInt {

        public static void main(String[] args) {
            // Example string
            String strNumber = "123abc";

            try {
                // Convert string to int
                int convertedNumber = Integer.parseInt(strNumber);

                // Print the result
                System.out.println("Converted int: " + convertedNumber);
            } catch (NumberFormatException e) {
                System.out.println("Error: The string is not a valid integer.");
            }
        }
}
