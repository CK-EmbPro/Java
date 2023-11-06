package com.javaquestions;

import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input First Name: ");
        String firstName = scanner.nextLine();

        System.out.print("Input Last Name: ");
        String lastName = scanner.nextLine();

        String reversedName = reverseName(firstName, lastName);

        System.out.println("Name in reverse is: " + reversedName);

        scanner.close();
    }

    public static String reverseName(String firstName, String lastName) {
        return lastName + " " + firstName;
    }
}
