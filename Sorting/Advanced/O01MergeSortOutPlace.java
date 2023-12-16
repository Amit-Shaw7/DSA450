package Sorting.Advanced;

import java.util.Arrays;

public class O01MergeSortOutPlace {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 5, 6, 21, 1, 3, 4, 6 };
        System.out.println("Before : ");
        printArr(arr);
        System.out.println("After sort : ");
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }

        int mid = arr.length / 2;

        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));

        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] merged = new int[left.length + right.length];

        int leftIdx = 0;
        int rightIdx = 0;
        int mergedIdx = 0;

        // Check for both arrays
        while (leftIdx < left.length && rightIdx < right.length) {
            if (left[leftIdx] > right[rightIdx]) {
                merged[mergedIdx] = right[rightIdx];
                rightIdx++;
            } else {
                merged[mergedIdx] = left[leftIdx];
                leftIdx++;
            }
            mergedIdx++;
        }

        // If left has some elem left
        while(leftIdx < left.length){
            merged[mergedIdx++] = left[leftIdx++];
        }

        // If right has some elem left
        while(rightIdx < right.length){
            merged[mergedIdx++] = right[rightIdx++];
        }

        return merged;
    }

}