package com.javaquestions;
import java.util.Scanner;

public class Q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char choice;

        do {
            // Ask the user to enter two numbers
            System.out.print("Enter the first number: ");
            double num1 = scanner.nextDouble();
            System.out.print("Enter the second number: ");
            double num2 = scanner.nextDouble();

            // Calculate and display the sum
            double sum = num1 + num2;
            System.out.println("The sum of " + num1 + " and " + num2 + " is: " + sum);

            // Ask the user if they want to perform the operation again
            System.out.print("Do you want to perform the operation again? (y/n): ");
            choice = scanner.next().charAt(0);

        } while (choice == 'y' || choice == 'Y');

        scanner.close();
    }
}
