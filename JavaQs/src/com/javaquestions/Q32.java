package com.javaquestions;

import java.util.Scanner;

public class Q32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char continueChoice;

        do {
            displayMenu();

            int choice = getUserChoice();
            int num1 = getUserNumber("Enter the first number: ");
            int num2 = getUserNumber("Enter the second number: ");
            int result = performOperation(choice, num1, num2);

            System.out.println("Result: " + result);

            System.out.print("Continue? (y/n): ");
            continueChoice = scanner.next().charAt(0);
        } while (continueChoice == 'y' || continueChoice == 'Y');

        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("MENU");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Multiply");
        System.out.println("4. Divide");
        System.out.println("5. Modulus");
    }

    public static int getUserChoice() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your choice (1-5): ");
        return scanner.nextInt();
    }

    public static int getUserNumber(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextInt();
    }

    public static int performOperation(int choice, int num1, int num2) {
        switch (choice) {
            case 1:
                return num1 + num2;
            case 2:
                return num1 - num2;
            case 3:
                return num1 * num2;
            case 4:
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    System.out.println("Cannot divide by zero.");
                    return 0;
                }
            case 5:
                if (num2 != 0) {
                    return num1 % num2;
                } else {
                    System.out.println("Cannot find modulus with zero.");
                    return 0;
                }
            default:
                System.out.println("Invalid choice.");
                return 0;
        }
    }
}

