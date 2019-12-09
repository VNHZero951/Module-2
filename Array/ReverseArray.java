package Array;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
//        Check size of Arr
        do {
            System.out.print("Enter a size: ");
                size = scanner.nextInt();
            if (size > 20) {
                System.out.println("Size does not exceed 20");
            }
        } while ( size > 20);
        array = new int[size];
        int i = 0;
//        Input Arr
        while (i< array.length) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
            i++;
        }
        System.out.printf("%-20s%s", "Elements in array: ", "");
//        Print value of arr
        for (int j=0 ; j < array.length ; j++) {
            System.out.print(array[j] + "\t");
        }
//        reverse arr
        for (int j = 0; j < array.length / 2 ; j++) {
            int temp = array[j];
            array[j] = array[size - 1 -j];
            array[size - 1 -j] = temp;
        }
        System.out.printf("%-21s%s", "\nReverse array: ", "");
//        print array affter reverse array
        for (int j = 0; j < array.length; j++) {
            System.out.print(array[j] + "\t");
        }
    }
}
