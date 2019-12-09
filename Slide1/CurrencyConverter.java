package Slide1;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        int choice = -1;
        Scanner scanner = new Scanner(System.in);
        while(choice!= 0) {
            System.out.println("Menu");
            System.out.println("1. VND to USD");
            System.out.println("2. USD to VND");
            System.out.println("0. Exit");
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            int VND,USD,temp;
            switch (choice) {
                case 1:
                    System.out.println("Input VND Want Converter:");
                    VND = scanner.nextInt();
                    temp = VND / 23000;
                    System.out.printf("%d VND = %d USD",VND,temp);
                case 2:
                    System.out.println("Input USD Want Converter:");
                    USD = scanner.nextInt();
                    temp = USD * 23000;
                    System.out.printf("%d USD = %d VND",USD,temp);
                case 0:
                    System.exit(0);
                default:
                    System.out.println("No choice!");
            }
        }
        }
}
