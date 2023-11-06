package com.javaquestions;

import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        QuotientAndRemainder result = calculateQuotientAndRemainder(dividend, divisor);

        System.out.println("Quotient: " + result.getQuotient());
        System.out.println("Remainder: " + result.getRemainder());

        scanner.close();
    }

    public static QuotientAndRemainder calculateQuotientAndRemainder(int dividend, int divisor) {
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;
        return new QuotientAndRemainder(quotient, remainder);
    }
}

class QuotientAndRemainder {
    private int quotient;
    private int remainder;

    public QuotientAndRemainder(int quotient, int remainder) {
        this.quotient = quotient;
        this.remainder = remainder;
    }

    public int getQuotient() {
        return quotient;
    }

    public int getRemainder() {
        return remainder;
    }
}

