package DSA.Arrays.Easy;

import java.util.Arrays;

public class O06LeftRotateByK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int k = 3;
        System.out.println(Arrays.toString(arr));
        leftRotateByK(arr, k);
        System.out.println(Arrays.toString(arr));
        System.out.println("--------------------------------------------");
        leftRotateByKOptimal(arr1, k);
        System.out.println(Arrays.toString(arr1));
    }

    public static void leftRotateByK(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            System.out.println(i);
            leftRotateByOne(arr, k);
        }
    }

    public static void leftRotateByOne(int[] arr, int k) {
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }

        arr[arr.length - 1] = temp;
    }

    public static void leftRotateByKOptimal(int[] arr, int k) {
        int n = arr.length;

        if (k > n) {
            k = k - n;
        } else if (k == n) {
            k = 0;
        }

        for (int i = 0; i < k; i++) {
            System.out.println(i);
            leftRotateByOne(arr, k);
        }
    }
}
