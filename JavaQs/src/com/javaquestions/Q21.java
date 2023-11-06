package com.javaquestions;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first integer: ");
        int a = scanner.nextInt();

        System.out.print("Enter the second integer: ");
        int b = scanner.nextInt();

        System.out.print("Enter the third integer: ");
        int c = scanner.nextInt();

        printInAscendingOrder(a, b, c);

        scanner.close();
    }

    public static void printInAscendingOrder(int a, int b, int c) {
        if (a <= b && a <= c) {
            System.out.print(a + " ");
            if (b <= c) {
                System.out.print(b + " " + c);
            } else {
                System.out.print(c + " " + b);
            }
        } else if (b <= a && b <= c) {
            System.out.print(b + " ");
            if (a <= c) {
                System.out.print(a + " " + c);
            } else {
                System.out.print(c + " " + a);
            }
        } else {
            System.out.print(c + " ");
            if (a <= b) {
                System.out.print(a + " " + b);
            } else {
                System.out.print(b + " " + a);
            }
        }

        System.out.println();
    }
}
