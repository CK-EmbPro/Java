package com.javaquestions;

public class Q35 {
    public static void main(String[] args) {
        int number1 = 32121;
        int digit1 = 1;

        int number2 = 33331;
        int digit2 = 3;

        int number3 = 3;
        int digit3 = 3;

        int number4 = -543;
        int digit4 = 3;

        int count1 = countDigit(number1, digit1);
        int count2 = countDigit(number2, digit2);
        int count3 = countDigit(number3, digit3);
        int count4 = countDigit(number4, digit4);

        System.out.println("countDigit(" + number1 + ", " + digit1 + ") = " + count1);
        System.out.println("countDigit(" + number2 + ", " + digit2 + ") = " + count2);
        System.out.println("countDigit(" + number3 + ", " + digit3 + ") = " + count3);
        System.out.println("countDigit(" + number4 + ", " + digit4 + ") = " + count4);
    }

    public static int countDigit(int number, int digit) {
        if (number < 0 || digit < 0) {
            return -1;
        }

        int count = 0;

        while (number > 0) {
            int lastDigit = number % 10;
            if (lastDigit == digit) {
                count++;
            }
            number /= 10;
        }

        return count;
    }
}

