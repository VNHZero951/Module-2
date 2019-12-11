package AOOD.Bai3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle("Red",true,3.5);
        System.out.println(circle);
        double random = (int)((Math.random() * 100));
        circle.resize(random);
        System.out.println(circle.toString());


        Rectangle rectangle = new Rectangle("Green",true,3.5);
        System.out.println(rectangle);
        rectangle.resize(random);
        System.out.println(rectangle.toString());

        Square square = new Square("Blue",false,5);
        System.out.println(square);
        square.resize(random);
        System.out.println(square.toString());

    }
}
