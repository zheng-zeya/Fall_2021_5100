package edu.northeastern.zeyao.Q1;

public class Square extends Shape{
    private int side;

    public Square(int side){
        this.side = side;
    }

    public Square(String name, String color, int side) {
        super(name, color);
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    @Override
    public int getArea() {
        return side * side;
    }
    @Override
    public int getPerimeter() {
        return side * 4;
    }

}
