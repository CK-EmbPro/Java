package com.javaquestions;

public class Q23 {
    public static void main(String[] args) {
        long seconds = 1_000_000_000L; // 1,000,000,000 seconds

        double years = calculateAgeInYears(seconds);

        System.out.println("John is approximately " + years + " years old.");
    }

    public static double calculateAgeInYears(long seconds) {
        double secondsPerYear = 31_536_000.0; // Number of seconds in a year

        double years = seconds / secondsPerYear;
        return years;
    }
}

