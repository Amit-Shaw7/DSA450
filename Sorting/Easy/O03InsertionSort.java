package Sorting.Easy;

import java.util.Arrays;

public class O03InsertionSort {
    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        printArr(arr);
        insertionSort(arr);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void insertionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i; // Index to start checking with
            while (j > 0 && arr[j - 1] > arr[j]) { // Check all left side elem so start with 1
                // Left side elem is bigger thn current -> swap
                swap(arr, j, j - 1);
                j--;
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
