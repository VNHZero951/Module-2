package OOPnheritance.Bai4;

public class Main {
    public static void main(String[] args) {
        Point point = new Point(5.0f,6.0f);
        System.out.println(point);

        MoveablePoint moveablePoint = new MoveablePoint(5.0f,6.0f,5.0f,6.0f);
        System.out.println(moveablePoint);
    }
}
