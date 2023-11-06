package com.javaquestions;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the Christmas tree: ");
        int treeHeight = scanner.nextInt();

        if (treeHeight <= 0) {
            System.out.println("Please enter a positive number for the tree height.");
        } else {
            drawChristmasTree(treeHeight);
        }

        scanner.close();
    }

    public static void drawChristmasTree(int height) {
        for (int i = 1; i <= height; i++) {
            // Print spaces
            for (int j = height - i; j > 0; j--) {
                System.out.print(" ");
            }

            // Print stars
            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }

}
