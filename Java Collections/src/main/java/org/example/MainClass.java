package org.example;

public class MainClass {
    public static void main(String[] args){
        Point<Integer> point = new Point(1,3);

        Point<Double> points = new Point(1.3,3.1);
        System.out.println(point.toString());
        System.out.println(points.toString());

    }
}
