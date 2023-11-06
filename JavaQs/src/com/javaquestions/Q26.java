package com.javaquestions;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence or a phrase: ");
        String input = scanner.nextLine();

        int charactersWithoutSpaces = countCharactersWithoutSpaces(input);
        int charactersWithSpaces = input.length();
        int wordCount = countWords(input);

        System.out.println("Number of characters without spaces: " + charactersWithoutSpaces);
        System.out.println("Number of characters with spaces: " + charactersWithSpaces);
        System.out.println("Number of words: " + wordCount);

        scanner.close();
    }

    public static int countCharactersWithoutSpaces(String input) {
        // Remove spaces and count characters
        String withoutSpaces = input.replaceAll("\\s", "");
        return withoutSpaces.length();
    }

    public static int countWords(String input) {
        // Split the input into words based on whitespace and count the words
        String[] words = input.split("\\s+");
        return words.length;
    }
}
