package Sorting;

import java.util.Arrays;

public class O02BubbleSort {
    public static void main(String[] args) {
        int arr[] = { 9, 13, 20, 24, 46, 52 };
        printArr(arr);

        bubbleSort(arr);
        printArr(arr);
    }

    public static void bubbleSort(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            boolean swapped = false;
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    swapped = true;
                    swap(arr, j, j + 1);
                }
            }

            if (!swapped) {
                // No swap happens 
                System.out.println("alreaadyy sorted");
                return;
            }
        }
    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}


/*
 * TC - O(N^2)
 * But f the array is sorted it will take - O(N)
 */