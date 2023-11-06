package com.javaquestions;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the side length of the cube: ");
        double sideLength = scanner.nextDouble();

        double volume = calculateCubeVolume(sideLength);

        System.out.println("Volume of the cube: " + volume);

        scanner.close();
    }

    public static double calculateCubeVolume(double sideLength) {
        return Math.pow(sideLength, 3);
    }
}
