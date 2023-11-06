package com.javaquestions;

public class Q38 {
    public static void main(String[] args) {
        int[] array1 = {1};
        int[] array2 = {1, 2};
        int[] array3 = {1, 2, 3};
        int[] array4 = {1, 2, 3, 4};
        int[] array5 = {3, 3, 4, 4};
        int[] array6 = {3, 2, 3, 4};
        int[] array7 = {4, 1, 2, 3};
        int[] array8 = {1, 1};
        int[] array9 = {};

        int result1 = findDifferenceOddEvenSum(array1);
        int result2 = findDifferenceOddEvenSum(array2);
        int result3 = findDifferenceOddEvenSum(array3);
        int result4 = findDifferenceOddEvenSum(array4);
        int result5 = findDifferenceOddEvenSum(array5);
        int result6 = findDifferenceOddEvenSum(array6);
        int result7 = findDifferenceOddEvenSum(array7);
        int result8 = findDifferenceOddEvenSum(array8);
        int result9 = findDifferenceOddEvenSum(array9);

        System.out.println("Difference of odd and even sum (array1): " + result1);
        System.out.println("Difference of odd and even sum (array2): " + result2);
        System.out.println("Difference of odd and even sum (array3): " + result3);
        System.out.println("Difference of odd and even sum (array4): " + result4);
        System.out.println("Difference of odd and even sum (array5): " + result5);
        System.out.println("Difference of odd and even sum (array6): " + result6);
        System.out.println("Difference of odd and even sum (array7): " + result7);
        System.out.println("Difference of odd and even sum (array8): " + result8);
        System.out.println("Difference of odd and even sum (array9): " + result9);
    }

    public static int findDifferenceOddEvenSum(int[] arr) {
        int oddSum = 0;
        int evenSum = 0;

        for (int num : arr) {
            if (num % 2 == 0) {
                evenSum += num;
            } else {
                oddSum += num;
            }
        }

        return oddSum - evenSum;
    }
}

