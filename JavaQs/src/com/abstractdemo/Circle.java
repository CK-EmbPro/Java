package com.abstractdemo;

public class Circle extends Shape {
    private double radius;
    public Circle(){}

    @Override
    public double area() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }

    public Circle(String color, double r){
        super();
        this.radius = r;

    }
}
