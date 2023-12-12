package Sorting.Easy;

/*
 * Selection Sort -> As the name suggest select the smallest element and keep it in the start of the array 
 * 
 * Algo ->
 *      i) Run outer loop from "0-n" and inner loop from "i+1 to n"
 *     ii) Keep trck of the smallest elem index 
 *    iii) Swap the elem in that index with the arr[i]
 *     iv) Then the outer loops "i" will be incremented and the same will be continued  
 */

import java.util.Arrays;

public class O01SelectionSort {
    public static void main(String[] args) {
        int arr[] = { 13, 46, 24, 52, 20, 9 };
        System.out.println("Before Sorting");
        printArr(arr);

        selectionSort(arr);
        printArr(arr);
    }

    public static void printArr(int[] arr) {
        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int min = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[min] > arr[j]) {
                    min = j;
                }
            }

            swap(arr, i, min);
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

/*
 * TC - O(N^2)
 */
