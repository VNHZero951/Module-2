package Slide1;

public class Firstisprime {
    public static void main(String[] args) {
        int count=0,number=0,i=1,j=1;
        while(number<20)
        {
            j=1;
            count=0;
            while(j<=i)
            {
                if(i%j==0)
                    count++;
                j++;
            }
            if(count==2)
            {
                System.out.printf("%d ",i);
                number++;
            }
            i++;
        }
    }
}
