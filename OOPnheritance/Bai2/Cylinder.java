package OOPnheritance.Bai2;

public class Cylinder extends Circle {
    double height;

    public Cylinder() {
    }

    public Cylinder(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea(){
        return radius * radius * Math.PI * height;
    }

    @Override
    public String toString() {
        return "A Circle with radius= "
                + getRadius()
                + " And Area : "
                +getArea();
    }
}
