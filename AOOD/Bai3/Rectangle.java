package AOOD.Bai3;

import OOPnheritance.Bai1.Shape;

public class Rectangle extends Shape implements Resizeable {
    double radius;

    public Rectangle() {
    }

    public Rectangle(String color, Boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "radius=" + radius + " " + super.toString()+
                '}';
    }
    @Override
    public void resize(double percent) {
        this.radius = this.radius * percent;
    }
}
