package com.javaquestions;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        int spaceCount = countSpaces(inputString);

        System.out.println("Number of spaces in the string: " + spaceCount);

        scanner.close();
    }

    public static int countSpaces(String inputString) {
        int spaceCount = 0;

        for (int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        return spaceCount;
    }
}

