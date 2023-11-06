package rw.ac.rca.geo;

public class Shape {
    protected int code;
    protected int dima;
    protected int dimb;

    public Shape(int code, int dima, int dimb) {
        this.code = code;
        this.dima = dima;
        this.dimb = dimb;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getDima() {
        return dima;
    }

    public void setDima(int dima) {
        this.dima = dima;
    }

    public int getDimb() {
        return dimb;
    }

    public void setDimb(int dimb) {
        this.dimb = dimb;
    }

    void area() {
        System.out.println("I don't have details");
    }

    public static void main(String[] args){
        Triangle tria1 = new Triangle(123, 40, 50);
        tria1.area();
    }

}


class Triangle extends Shape{
    public Triangle(int code, int dima, int dimb){
        super(code, dima, dimb);
    }

    void area(){
        System.out.println("In triangle no enough details");
    }
}

class Square extends Shape{
    public Square(int code, int dima, int dimb){
        super(code, dima, dimb);

    }

    void area(){
        System.out.println("The square  doesn't have enough details");
    }

}

