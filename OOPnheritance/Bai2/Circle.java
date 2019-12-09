package OOPnheritance.Bai2;

public class Circle {
    double radius = 5;
    String Color = "";

    public Circle() {
    }

    public Circle(double radius, String color) {
        this.radius = radius;
        Color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public double getArea(){
        return radius * radius * Math.PI;
    }

    public String toString(){
        return "A Circle with radius= "
                + getRadius()
                + " And Area is : "
                + getArea();
    }
}
