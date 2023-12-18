package Sorting.Advanced;

import java.util.Arrays;

public class O03BubbleSortRecursive {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(arr));
        bubbleSort(arr, arr.length - 1, 0);
        System.out.println(Arrays.toString(arr));
    }

    public static void bubbleSort(int[] arr, int r, int c) {
        // base case if r which starts from len(arr) reaches 0 -> return
        if (r <= 0) {
            return;
        }

        // If c == len(arr)-1      ->  one iteration complete starts from 0 again 
        if (c == arr.length - 1) {
            r--;
            c = 0;
        }

        if (arr[c] > arr[c + 1]) {
            // swap
            int temp = arr[c];
            arr[c] = arr[c + 1];
            arr[c + 1] = temp;
        }

        bubbleSort(arr, r, c + 1);
    }
}
