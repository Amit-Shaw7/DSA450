package Sorting.Advanced;

import java.util.Arrays;

public class O05QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5, 4, 3, 2, 1 };

        System.out.println(Arrays.toString(arr));
        quickSort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }

        int partitionIdx = findPartitionIdx(arr, low, high);

        quickSort(arr, low, partitionIdx - 1);
        quickSort(arr, partitionIdx + 1, high);
    }

    public static int findPartitionIdx(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }
            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                swap(arr, i, j);
            }
        }
        swap(arr, low, j);
        return j;
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
