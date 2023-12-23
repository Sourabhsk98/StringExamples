package com.DuplicateCharactersExample;

public class DuplicateCharacters {
    public static void main(String[] args) {
        String input = "Mississippi";
        findDuplicateCharacters(input);
    }

    private static void findDuplicateCharacters(String input) {
        // Convert the string to char array for easy iteration
        char[] charArray = input.toCharArray();

        System.out.println("Duplicate characters in the string:");

        // Iterate through each character in the array
        for (int i = 0; i < charArray.length; i++) {
            // Ignore non-alphabetic characters (you can modify this condition as needed)
            if (Character.isLetter(charArray[i])) {
                for (int j = i + 1; j < charArray.length; j++) {
                    // Compare current character with every other character in the string
                    if (Character.toLowerCase(charArray[i]) == Character.toLowerCase(charArray[j])) {
                        System.out.println(charArray[i]);
                        break; // Break to avoid printing the same character multiple times
                    }
                }
            }
        }
    }
}
