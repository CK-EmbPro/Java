package com.javaquestions;

public class Q11{
    public static void main(String[] args) {
        long product = 1;

        for (int num = 2; num <= 100; num++) {
            if (isPrime(num)) {
                product *= num;
            }
        }

        System.out.println("The product of prime numbers between 1 and 100 is: " + product);
    }

    // Helper function to check if a number is prime
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

