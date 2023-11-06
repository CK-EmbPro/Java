package com.javaquestions;

import java.util.Scanner;

public class Q29 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (isPalindromeWithBuiltInFunctions(inputString)) {
            System.out.println("The string is a palindrome (with built-in functions).");
        } else {
            System.out.println("The string is not a palindrome (with built-in functions).");
        }

        if (isPalindromeWithoutBuiltInFunctions(inputString)) {
            System.out.println("The string is a palindrome (without built-in functions).");
        } else {
            System.out.println("The string is not a palindrome (without built-in functions).");
        }

        scanner.close();
    }

    public static boolean isPalindromeWithBuiltInFunctions(String inputString) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        inputString = inputString.replaceAll("\\s", "").toLowerCase();
        String reversed = new StringBuilder(inputString).reverse().toString();
        return inputString.equals(reversed);
    }

    public static boolean isPalindromeWithoutBuiltInFunctions(String inputString) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        inputString = inputString.replaceAll("\\s", "").toLowerCase();

        int left = 0;
        int right = inputString.length() - 1;

        while (left < right) {
            if (inputString.charAt(left) != inputString.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }
}

