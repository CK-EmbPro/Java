package com.abstractdemo;

public abstract class Shape {
    public String color;
    public Shape(){

    }

    public Shape(String color){
        this.color = color;
    }

    public abstract double area();
    public abstract String toString();
}
