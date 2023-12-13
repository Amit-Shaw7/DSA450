package Sorting.Advanced;

import java.util.Arrays;

public class O01MergeSort {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 6, 21, 1, 3, 4, 6 };
        printArr(arr);
        mergeSort(0, arr.length, arr);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSort(int st, int end, int[] arr) {
        if (arr.length == 1 || st == end) {
            return;
        }
        int mid = (st + end) / 2;

        mergeSort(st, mid, arr);
        mergeSort(mid + 1, end, arr);

        mergeAlgo(st, mid + 1, end, arr);
    }

    public static void mergeAlgo(int low, int mid, int high, int[] arr) {
        int i = 0;
        int[] temp = new int[arr.length];
        while (low <= mid && mid + 1 <= high) {
            if (arr[low] > arr[mid + 1]) {
                temp[i] = arr[mid + 1];
                mid++;
            } else {
                temp[i] = arr[low];
                low++;
            }
            i++;
        }

        while (low <= mid) {
            temp[i] = arr[low];
            i++;
        }

        while (mid <= high) {
            temp[i] = arr[mid + 1];
            i++;
        }
    }
}
