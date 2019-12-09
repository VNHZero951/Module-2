package ngoailejava;

public class Phepchia {
    public static void checkB(int b) throws Khongthechiachoko {
        if (b == 0) {
            // Nếu tuổi nhỏ hơn 18, một ngoại lệ sẽ được ném ra
            // Phương thức này sẽ kết thúc tại đây.
            throw new Khongthechiachoko("b" +" khong dc bang ko");
        }
    }
}
