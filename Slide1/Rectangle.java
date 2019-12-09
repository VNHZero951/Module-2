package Slide1;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float width, height;

        System.out.println("Enter width:");
        width = scanner.nextFloat();
        System.out.println("Enter height:");
        height = scanner.nextFloat();
        float area = width * height;
        System.out.println("Area is : " + area);
    }
}
