package com.javaquestions;

import java.util.Scanner;

public class Q16{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        String result = checkNumberSign(number);

        System.out.println("The number is " + result);

        scanner.close();
    }

    public static String checkNumberSign(double number) {
        if (number > 0) {
            return "positive";
        } else if (number < 0) {
            return "negative";
        } else {
            return "zero";
        }
    }
}
