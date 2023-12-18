package Sorting.Advanced;

import java.util.Arrays;

public class O02MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = { 9, 3, 6, 2, 0 }; // 9 3 6 2 0
        System.out.println(Arrays.toString(arr));
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSortInPlace(int[] arr, int st, int end) {
        if (end - st == 1) {
            return;
        }

        int mid = st + (end - st) / 2;

        mergeSortInPlace(arr, st, mid);
        mergeSortInPlace(arr, mid, end);
        merge(arr, st, mid, end);
    }

    public static void merge(int[] arr, int st, int mid, int end) {
        int[] temp = new int[end - st];
        int i = st;
        int j = mid;
        int k = 0;

        while (i < mid && j < end) {
            if (arr[i] > arr[j]) {
                temp[k] = arr[j];
                j++;
            } else {
                temp[k] = arr[i];
                i++;
            }
            k++;
        }

        while (i < mid) {
            temp[k] = arr[i];
            k++;
            i++;
        }

        while (j < end) {
            temp[k] = arr[j];
            k++;
            j++;
        }

        for (int l = 0; l < temp.length; l++) {
            arr[st + l] = temp[l];
        }
    }
}
