package ngoailejava;

import java.util.Scanner;

import static ngoailejava.Phepchia.checkB;

public class Main {

    public static void main(String[] args)  {
        int a ;
        int b;
        int c;
        Scanner input = new Scanner(System.in);
        System.out.println("nhaap  a");
        a =input.nextInt();


        System.out.println("nhaap  b");
        b =input.nextInt();

        try {
            checkB(b);
             c = a/b;
            System.out.println("ket qua " +c);
        }catch (Khongthechiachoko e){
            System.out.println(e.getMessage());
        }

        System.out.println("a laf " +a);

    }
}
