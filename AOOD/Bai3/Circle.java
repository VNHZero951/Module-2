package AOOD.Bai3;

import OOPnheritance.Bai1.Shape;

public class Circle extends Shape implements Resizeable {
    double radius;
    public Circle() {
    }

    public Circle(String color, Boolean filled , double radius) {
        super(color, filled);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius + " " +super.toString()+
                '}';
    }
    @Override
    public void resize(double percent) {
        this.radius = this.radius * percent;
    }
}
