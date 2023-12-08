package RecursionBasic;

import java.util.Arrays;

public class O01PrintNTimes {
    public static void main(String[] args) {
        int n = 5;
        int[] arr = new int[n];
        printNTimes(n , arr);
        System.out.println(Arrays.toString(arr));
    }

    public static int[] printNTimes(int n , int[] arr) {
        if (n == 1) {
            arr[n - 1] = 1;
        }
        printNTimes(n-1 , arr);
        arr[n-1] = n;

        return arr;
    }
}
