package Slide1;

import java.util.Scanner;

public class rateIncrease {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input Money:");
        double money = scanner.nextDouble();
        System.out.println("Input Month:");
        int month = scanner.nextInt();
        System.out.println("Input Rate:");
        double rate = scanner.nextDouble();

        double totalRate = 0;
        for (int i = 0; i < month; i++) {
            totalRate = money * (rate / 100) / 12 * 3;
        }
        System.out.println("Total of interset : " + totalRate);
    }
}
