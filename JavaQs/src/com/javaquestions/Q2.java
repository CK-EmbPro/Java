package com.javaquestions;

public class Q2 {
    public static void main(String[] args) {
        int n = 10; // Number of natural numbers to sum
        int sum = 0;
        int i = 1;

        while (i <= n) {
            sum += i;
            i++;
        }

        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}


