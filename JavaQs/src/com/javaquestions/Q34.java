package com.javaquestions;

public class Q34 {
    public static void main(String[] args) {
        int number1 = 13013;
        int number2 = 8;

        int minDistance1 = minDistance(number1);
        int minDistance2 = minDistance(number2);

        System.out.println("minDistance(" + number1 + ") = " + minDistance1);
        System.out.println("minDistance(" + number2 + ") = " + minDistance2);
    }

    public static int minDistance(int number) {
        int minDist = Integer.MAX_VALUE;

        for (int i = 1; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                int factor1 = i;
                int factor2 = number / i;
                int distance = Math.abs(factor2 - factor1);

                if (distance < minDist) {
                    minDist = distance;
                }
            }
        }

        return minDist;
    }
}
