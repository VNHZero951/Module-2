package OOP;

public class Swap {
    int a = 5;
    int b = 10;
    int temp;
    public Swap(){

    }
    public Swap(int a , int b){
        temp = a;
        this.a = b;
        this.b = temp;
        System.out.println("Before a:"+a);
        System.out.println("Before b:"+b);
        System.out.println("-------------");
    }

    public static void main(String[] args) {
        Swap out = new Swap(5,10);
        System.out.println("After a:"+out.a);
        System.out.println("After b:"+out.b);
    }
}
