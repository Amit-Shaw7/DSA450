package DSA.Arrays.Easy;

import java.util.Arrays;

public class O06LeftRotateByK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        int[] arr1 = { 1, 2, 3, 4, 5 };
        int[] arr2 = { 1, 2, 3, 4, 5 };
        int k = 10;
        System.out.println("---------------------Brute-----------------------");
        System.out.print("Original : ");
        System.out.println(Arrays.toString(arr));
        leftRotateByK(arr, k);
        System.out.print("After Rotation : ");
        System.out.println(Arrays.toString(arr));

        System.out.println("---------------------Better----------------------");
        System.out.print("Original : ");
        System.out.println(Arrays.toString(arr1));
        leftRotateByKBetter(arr1, k);
        System.out.print("After Rotation : ");
        System.out.println(Arrays.toString(arr1));

        System.out.println("---------------------Optimal----------------------");
        System.out.print("Original : ");
        System.out.println(Arrays.toString(arr2));
        leftRotateByKOptimal(arr2, k);
        System.out.print("After Rotation : ");
        System.out.println(Arrays.toString(arr2));
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

    public static void leftRotateByKBetter(int[] arr, int k) {
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

    public static void leftRotateByKOptimal(int[] arr, int k) {
        int n = arr.length;
        k = k % n;

        reverse(arr, 0, k - 1);
        reverse(arr, k, n - 1);
        reverse(arr, 0, n - 1);
    }

    public static void reverse(int[] arr, int st, int end) {
        System.out.println("ran");
        while (st < end) {
            int temp = arr[st];
            arr[st] = arr[end];
            arr[end] = temp;
            st++;
            end--;
        }
    }
}
