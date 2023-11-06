package com.abstractdemo;

import org.w3c.dom.css.Rect;

public class Rectangle extends  Shape{

    private double width;
    private double length;
    public Rectangle(){}
    public Rectangle(String color, double w, double l){
        super(color);
        this.length=l;
        this.width =w;
    }
    @Override
    public double area() {
        return 0;
    }

    @Override
    public String toString() {
        return null;
    }
}
