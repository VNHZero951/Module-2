package Slide1;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Numbers : ");
        int number = scanner.nextInt();
        if (number < 2) {
            System.out.println(number + " is not a prime");
        } else {
            int i = 2;
            boolean check = true;
            while (i<= Math.sqrt(number)) {
                if (number % i == 0) {
                    check = false;
                    break;
                }
                i++;
            }
            if (check){
                System.out.println(number + " is a prime");
            } else {
                System.out.println(number + " is not a prime");
            }
        }
    }
}
