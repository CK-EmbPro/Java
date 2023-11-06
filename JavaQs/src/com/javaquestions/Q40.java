package com.javaquestions;

public class Q40 {
    public static void main(String[] args) {
        int num1 = 28;
        int num2 = 30;
        int num3 = 34;

        String sound1 = convertToRaindropSound(num1);
        String sound2 = convertToRaindropSound(num2);
        String sound3 = convertToRaindropSound(num3);

        System.out.println(num1 + " => " + sound1);
        System.out.println(num2 + " => " + sound2);
        System.out.println(num3 + " => " + sound3);
    }

    public static String convertToRaindropSound(int number) {
        StringBuilder result = new StringBuilder();

        if (number % 3 == 0) {
            result.append("Pling");
        }
        if (number % 5 == 0) {
            result.append("Plang");
        }
        if (number % 7 == 0) {
            result.append("Plong");
        }

        // If the result is empty, it means no factors of 3, 5, or 7 were found
        if (result.length() == 0) {
            result.append(Integer.toString(number));
        }

        return result.toString();
    }
}

