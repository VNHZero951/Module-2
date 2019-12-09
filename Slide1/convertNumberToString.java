package Slide1;

import java.util.Scanner;

public class convertNumberToString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input The Number : ");
        int number = scanner.nextInt();
        String text = "";
        switch (number){
            case 1:
                text = "One";
                break;
            case 2:
                text = "Two";
                break;
            case 3:
                text = "Three";
                break;
            case 4:
                text = "Four";
                break;
            case 5:
                text = "Five";
                break;
            case 6:
                text = "Six";
                break;
            case 7:
                text = "Seven";
                break;
            case 8:
                text = "Eight";
                break;
            case 9:
                text = "Nine";
                break;
            case 10:
                text = "Ten";
                break;
            default:
                System.out.println("out of ability");
        }

        System.out.println(number + " Is " + text);
    }
}
