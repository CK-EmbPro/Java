package com.javaquestions;

class Box{
    int width;
    int height;
    int length;

    Box(int w, int h, int l){
        this.width = w;
        this.height = h;
        this.length = l;
    }

    public int volume() {
        return this.width * this.height * this.length;
    }


}

public class BoxDemo {
    public static void main(String[] args) {
        Box b1 = new Box(10, 10, 10);
        System.out.println("The value is " + b1.volume());
    }
}