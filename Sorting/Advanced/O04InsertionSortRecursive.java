package Sorting.Advanced;

import java.util.Arrays;

public class O04InsertionSortRecursive {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(arr));
        insertionSort(arr, 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr, int idx) {
        if (idx == arr.length) {
            return;
        }

        int j = idx; // from j to 0 while loop will run and do swaps where needed

        while (j > 0) {
            if (arr[j] < arr[j - 1]) {
                swap(arr, j, j - 1);
            }
            j--;
        }

        insertionSort(arr, idx + 1);
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
