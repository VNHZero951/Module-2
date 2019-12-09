package Slide1;

import java.util.Scanner;

public class Screens {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while(choice!= 0) {
            System.out.println("Menu");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle (The corner is square at 4 different angles: top-left, top-right, botton-left, botton-right)");
            System.out.println("3. Print isosceles triangle");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Draw rectangle");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    System.out.println("* * * * * * *");
                    break;
                case 2:
                    System.out.println("Draw square triangle");
                case 3:
                    System.out.println("Draw isosceles triangle");
                    for(int i=7;i>=1;i--){
                        for(int j=1;j<=i;j++){
                            System.out.print("*");
                        }
                        System.out.print("\n");
                    }
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}
