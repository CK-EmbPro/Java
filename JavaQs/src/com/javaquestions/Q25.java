package com.javaquestions;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a character: ");
        char inputChar = scanner.next().charAt(0);

        if (isDigit(inputChar)) {
            System.out.println("The entered character is a digit.");
        } else if (isAlphaLetter(inputChar)) {
            System.out.println("The entered character is an alphabetic letter.");
        } else {
            System.out.println("The entered character is neither a digit nor an alphabetic letter.");
        }

        scanner.close();
    }

    public static boolean isDigit(char character) {
        return Character.isDigit(character);
    }

    public static boolean isAlphaLetter(char character) {
        return Character.isLetter(character);
    }
}

