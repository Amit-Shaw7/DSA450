package RecursionBasic;

import java.util.Arrays;

public class O06ReverseArray {

    public static void reverseUsingExtraAr(int[] arr, int[] temp, int idx) {
        if (idx == arr.length) {
            return;
        }

        temp[idx] = arr[arr.length - 1 - idx];
        reverseUsingExtraAr(arr, temp, idx + 1);
    }

    public static void reverseWithoutUsingExtraAr(int[] arr, int start, int end) {
        if (start >= end) {
            return;
        }

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverseWithoutUsingExtraAr(arr, start + 1, end - 1);
    }

    public static void main(String[] args) {
        int[] arr = { 4, 3, 6, 8, 4 };
        int[] temp = new int[arr.length];

        reverseUsingExtraAr(arr, temp, 0);

        reverseWithoutUsingExtraAr(arr, 0, arr.length - 1);

        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(arr));
    }
}
