package OOPnheritance.Bai1;

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println(shape);

        Shape shape1 = new Shape("red", false);
        System.out.println(shape1);

        Circle circle = new Circle();
        System.out.println(circle);

        Circle circle1 = new Circle(3.5);
        System.out.println(circle1);

        Circle circle2 = new Circle("indigo", false, 3.5);
        System.out.println(circle2);

        Rectangle rectangle = new Rectangle();
        System.out.println(rectangle);
        Rectangle rectangle1 = new Rectangle(2.3, 5.8);
        System.out.println(rectangle1);
        Rectangle rectangle2 = new Rectangle("orange",true,2.5,3.8);
        System.out.println(rectangle2);


        Square square = new Square();
        System.out.println(square);
        Square square1 = new Square(2.3);
        System.out.println(square1);
        Square square2 = new Square("yellow",true,5.8);
        System.out.println(square2);
    }
}
