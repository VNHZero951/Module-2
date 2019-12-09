package Slide1;

public class numberToString_Demo {
    public static String motSo (int i) {
        String result = "";
        switch (i) {
            case 1:result = "mot";break;
            case 2:result = "hai";break;
            case 3:result = "ba";break;
            case 4:result = "bon";break;
            case 5:result = "nam";break;
            case 6:result = "sau";break;
            case 7:result = "bay";break;
            case 8:result = "tam";break;
            case 9:result = "chin";break;
            default:
                break;
        }
        return result;
    }
    public static String haiSo(int i) {
        String result = "";
        if(i>=10 && i <= 19 && i != 15) {
            result = "muoi"+motSo(i%10);
        }
        else if (i == 15)
            result = "muoilam";
        else if(i%10 == 5)
        {
            result = motSo(i/10) + "muoilam" ;
        }
        else {
            result = motSo(i/10) + "muoi" + motSo(i%10);
        }
        return result;
    }
    public static void main(String[] args)
    {
        int number = 562;
        String result = "";
        if(number == 0)
            result = "khong";
        else if(number>0 && number <=9) {
            result = motSo(number);
        }
        else if(number >= 10 && number <=99)
        {
            result = haiSo(number);
        }
        else if(number >=100 && number <=999)
        {
            if(number%100/10 == 0)
            {
                if(number%10 ==0)
                    result = motSo(number/100)+"tram";
                else
                    result = motSo(number/100) + "tramle"+motSo(number%10);
            }
            else {
                result = motSo(number/100)+"tram"+haiSo(number%100);
            }
        }
        System.out.print(result+"\n");
    }
}
