package AOOD.Bai5;

import OOPnheritance.Bai1.Shape;

public class Square extends Shape implements Colorable {
    double side;
    public Square() {
    }

    public Square(double side) {
        this.side = side;
    }

    public Square(String color, Boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }
    public double getArea(){
        return side * side;
    }
    @Override
    public void howToColor() {
        System.out.println("Color all four sides.");
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side + super.toString()+
                '}';
    }
}
