package com.javaquestions;

import java.util.Scanner;

public class Q31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String stringWithoutSpaces = removeSpaces(inputString);

        System.out.println("String without spaces: " + stringWithoutSpaces);

        scanner.close();
    }

    public static String removeSpaces(String inputString) {
        return inputString.replaceAll("\\s", "");
    }
}

