package Slide1;

public class IsPrimeless100 {
    public static void main(String[] args) {
        int count;
        for (int i = 1; i < 100 ; ++i) {
            count = 0;
            for (int j = 2; j <= Math.sqrt(i); j++) {
                if (i % j == 0) {
                    count++;
                }
            }
            if (count == 0 && i > 1){
                System.out.printf("%d\t",i);
            }
        }
    }
}
