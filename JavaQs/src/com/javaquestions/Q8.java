package com.javaquestions;

import java.util.Scanner;

public class Q8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Input 1st number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Input 2nd number: ");
        int secondNumber = scanner.nextInt();

        // Swapping the numbers
        int temp = firstNumber;
        firstNumber = secondNumber;
        secondNumber = temp;

        System.out.println("After swapping the 1st number is: " + firstNumber);
        System.out.println("After swapping the 2nd number is: " + secondNumber);

        scanner.close();
    }
}

