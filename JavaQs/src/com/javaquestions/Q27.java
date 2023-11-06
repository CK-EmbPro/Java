package com.javaquestions;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String reversedString = reverseString(inputString);

        System.out.println("Reversed string: " + reversedString);

        scanner.close();
    }

    public static String reverseString(String inputString) {
        StringBuilder reversed = new StringBuilder(inputString);
        return reversed.reverse().toString();
    }
}
