package com.javaquestions;

public class Q36 {
    public static void main(String[] args) {
        int n = 10; // Change this to the desired value of N

        int squareOfSum = findSquareOfSum(n);
        int sumOfSquares = findSumOfSquares(n);
        int difference = squareOfSum - sumOfSquares;

        System.out.println("The difference between the square of the sum and the sum of the squares of the first " + n + " natural numbers is: " + difference);
    }

    public static int findSquareOfSum(int n) {
        int sum = (n * (n + 1)) / 2; // Sum of first N natural numbers
        return sum * sum; // Square of the sum
    }

    public static int findSumOfSquares(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i * i; // Sum of squares of first N natural numbers
        }
        return sum;
    }
}

