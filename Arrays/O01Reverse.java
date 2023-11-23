package Arrays;

import java.util.Arrays;

public class O01Reverse {
    public static void reverse(int[] arr){
        int start = 0;
        int end = arr.length - 1;

        while(end >= start){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void printArr(int[] arr){
        System.out.println(Arrays.toString(arr));
    }
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        reverse(arr);
        printArr(arr);
    }
}
