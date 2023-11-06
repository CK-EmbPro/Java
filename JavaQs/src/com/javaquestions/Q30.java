package com.javaquestions;

import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String uppercaseString = convertToUppercase(inputString);

        System.out.println("Uppercase string: " + uppercaseString);

        scanner.close();
    }

    public static String convertToUppercase(String inputString) {
        return inputString.toUpperCase();
    }
}

