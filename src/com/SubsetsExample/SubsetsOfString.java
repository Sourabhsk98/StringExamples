package com.SubsetsExample;
import java.util.Scanner;
public class SubsetsOfString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        System.out.println("Subsets of the string:");
        generateSubsets(input);
    }
    //String as input and generates and prints all its subsets.
    private static void generateSubsets(String input) {
        //This line calculates the length of the input string and stores it in the variable length.
        int length = input.length();

        // Total number of subsets is 2^n where n is the length of the string
        int totalSubsets = 1 << length;
        //iterates from 0 to totalSubsets - 1,
        // where totalSubsets is 2 to the power of the length of the input string
        for (int i = 0; i < totalSubsets; i++) {
            //This line prints an opening brace to indicate the start of a subset.
            System.out.print("{ ");
            for (int j = 0; j < length; j++) {
               // This line checks if the j-th bit is set in the binary representation of i.
                // If true, it means the j-th character of the string is included in the current subset.


                if ((i & (1 << j)) != 0) {
                    System.out.print(input.charAt(j) + " ");
                }
            }
            System.out.println("}");
        }
    }
}
