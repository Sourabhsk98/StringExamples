package com.ReverseAString;

public class ReverseString {
    public static void main(String args[]) {
        String str1 = "Animals";
        System.out.println("Original string: " + str1);
        int n = str1.length(); // calculates length of String

        //the line calulate and store n values
        String Reverse_String = "";
        char ch;
        //This line starts a for loop that iterates over each character of the original string
        for (int i = 0; i < n; i++) {
            //fetch each character
            ch = str1.charAt(i);

            //concatenates each character in front of the new string
            Reverse_String = ch + Reverse_String;
        }
        System.out.println("Reversed string: " + Reverse_String); //  Display the reversed String
    }
}

