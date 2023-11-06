package com.javaquestions;

import java.util.Scanner;

public class Q33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n to find the nth prime number: ");
        int n = scanner.nextInt();

        int nthPrime = findNthPrime(n);

        System.out.println("The " + n + "th prime number is: " + nthPrime);

        scanner.close();
    }

    public static int findNthPrime(int n) {
        int count = 0;
        int number = 2;

        while (true) {
            if (isPrime(number)) {
                count++;
            }

            if (count == n) {
                return number;
            }

            number++;
        }
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }

        if (num <= 3) {
            return true;
        }

        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }

        return true;
    }
}

