package OOP;

import java.util.Scanner;

public class QuadraticEquation {
    private double a,b,c;
    double delta;
    public QuadraticEquation(){

    }
    public QuadraticEquation(double a,double b,double c){
        this.a = a;
        this.b = b;
        this.c = c;
        if(getDiscriminant()>0){
//            System.out.println("The equation has two roots : " + getRoot1() + " And " + getRoot2());
            System.out.printf("The equation has two roots : %.4f And %.4f",getRoot1(),getRoot2() );
        } else if (getDiscriminant() == 0 ){
            System.out.printf("The equation has one roots : %.2f " ,getRoot3());
        } else {
            System.out.println("The equation has no roots");
        }
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant(){
        return delta = (Math.pow(getB(),2) - 4*getA()*getC());
    }
    public double getRoot1(){
        return (-getB() + Math.sqrt(getDiscriminant())) / 2*getA();
    }
    public  double getRoot2(){
        return (-getB() - Math.sqrt(getDiscriminant())) / 2*getA();
    }
    public  double getRoot3(){
        return (-getB())/2*getA();
    }
//    public void Tong(double a, double b, double c){
//        if(getDiscriminant()>0){
//            System.out.println("The equation has two roots : " + getRoot1() + " And " + getRoot2());
//        } else if (getDiscriminant() == 0 ){
//            System.out.println("The equation has one roots : " + getRoot3());
//        } else {
//            System.out.println("The equation has no roots");
//        }
//    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        System.out.print("Enter c: ");
        double c = scanner.nextDouble();
        QuadraticEquation PTB2 = new QuadraticEquation(a,b,c);
//        PTB2.Tong(a,b,c);
    }
}
