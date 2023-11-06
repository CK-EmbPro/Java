package com.javaquestions;

import java.util.HashSet;
import java.util.Set;

public class Q12{
    public static void main(String[] args) {
        Set<Pair> uniquePairs = new HashSet<>();

        for (int a = 2; a < 100; a++) {
            for (int b = a; b < 100; b++) {
                int cSquared = a * a + b * b;
                int c = (int) Math.sqrt(cSquared);

                if (c * c == cSquared && c < 100) {
                    uniquePairs.add(new Pair(a, b));
                }
            }
        }

        System.out.println("The unique Pythagorean pairs are:");
        for (Pair pair : uniquePairs) {
            System.out.println("(" + pair.a + ", " + pair.b + ")");
        }

        System.out.println("Number of pairs found: " + uniquePairs.size());
    }

    static class Pair {
        int a, b;

        public Pair(int a, int b) {
            this.a = a;
            this.b = b;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            Pair pair = (Pair) obj;
            return (a == pair.a && b == pair.b) || (a == pair.b && b == pair.a);
        }

        @Override
        public int hashCode() {
            return a + b;
        }
    }
}
