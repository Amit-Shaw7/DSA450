package Sorting.Advanced;

import java.util.Arrays;

public class O02MergeSortInPlace {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };
        System.out.println(Arrays.toString(arr));
        mergeSortInPlace(arr, 0, arr.length);
        System.out.println(Arrays.toString(arr));
    }

    public static void mergeSortInPlace(int[] arr, int st, int end) {
        if (st >= end) {
            return;
        }

        int mid = st + (end - st) / 2;

        mergeSortInPlace(arr, st, mid);
        mergeSortInPlace(arr, mid + 1, end);
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
                i++;
            } else {
                temp[k] = arr[i];
                j++;
            }
            k++;
        }

        while (i < mid) {
            temp[k++] = arr[i++];
        }

        while (j < end) {
            temp[k++] = arr[j++];
        }

        for (int l = 0; l < temp.length; l++) {
            arr[st + l] = temp[l];
        }
    }
}
