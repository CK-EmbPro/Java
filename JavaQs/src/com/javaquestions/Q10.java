package com.javaquestions;

public class Q10 {
    public static void main(String[] args) {
        int product = 1;

        for (int i = 1; i <= 20; i += 2) {
            product *= i;
        }

        System.out.println("The product of all odd numbers between 1 and 20 is: " + product);
    }
}

