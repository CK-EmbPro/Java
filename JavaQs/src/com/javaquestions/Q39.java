package com.javaquestions;

public class Q39 {
    public static void main(String[] args) {
        int num1 = 1234;
        int num2 = 12005;
        int num3 = 1;
        int num4 = 1000;
        int num5 = 0;
        int num6 = -12345;

        int reversed1 = reverseInteger(num1);
        int reversed2 = reverseInteger(num2);
        int reversed3 = reverseInteger(num3);
        int reversed4 = reverseInteger(num4);
        int reversed5 = reverseInteger(num5);
        int reversed6 = reverseInteger(num6);

        System.out.println("Reverse of " + num1 + " is " + reversed1);
        System.out.println("Reverse of " + num2 + " is " + reversed2);
        System.out.println("Reverse of " + num3 + " is " + reversed3);
        System.out.println("Reverse of " + num4 + " is " + reversed4);
        System.out.println("Reverse of " + num5 + " is " + reversed5);
        System.out.println("Reverse of " + num6 + " is " + reversed6);
    }

    public static int reverseInteger(int num) {
        int reversed = 0;
        boolean isNegative = false;

        if (num < 0) {
            isNegative = true;
            num = Math.abs(num);
        }

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return isNegative ? -reversed : reversed;
    }
}
