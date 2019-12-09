package Array;

public class FindMin {
    public static int Min(int []arr){
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min ) {
                min = arr[i];
            }
        } return min;
    }

    public static void main(String[] args) {
        int []arr = {4, 12, 7, 8, -5, 6, 9};
        int min = Min(arr);
        System.out.println("The smallest element in the array is : " + min);
    }
}
