package AOOD.Bai3;

import OOPnheritance.Bai1.Shape;

public class Square extends Shape implements Resizeable {
    double radius;

    public Square() {
    }

    public Square(String color, Boolean filled , double radius) {
        super(color, filled);
        this.radius = radius;
    }
    @Override
    public String toString() {
        return "Square{" +
                "radius=" + radius + " " + super.toString()+
                '}';
    }
    @Override
    public void resize(double percent) {
        this.radius = this.radius * percent;
    }
}
