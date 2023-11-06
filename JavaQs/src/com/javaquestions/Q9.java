package com.javaquestions;

public class Q9 {
    public static void main(String[] args) {
        int sum = 0;

        for (int i = 2; i < 100; i += 2) {
            sum += i;
        }

        System.out.println("The sum of all even numbers less than 100 is: " + sum);
    }
}

