package DSA.Arrays.Easy;

import java.util.Arrays;

public class O02SecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = { 13, 15, 13, 12, 2, 45, 76, 5, 3 };
        int[] res = findSecondLargestAndSmallest(arr);
        System.out.println(Arrays.toString(res));
    }

    public static int[] findSecondLargestAndSmallest(int[] arr) {
        int largest = arr[0];
        int smallest = arr[1];
        int smallestIdx = 0;
        int largestIdx = 0;

        // Get smallest annd largest elem idx
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
                largestIdx = i;
            }

            if (arr[i] < smallest) {
                smallestIdx = i;
                smallest = arr[i];
            }
        }

        smallest = Integer.MAX_VALUE;
        largest = Integer.MIN_VALUE;
        // Find second smallest
        for (int i = 0; i < arr.length; i++) {
            if (i == smallestIdx)
                continue;

            if (smallest > arr[i]) {
                smallest = arr[i];
            }
        }

        // Find second largest
        for (int i = 0; i < arr.length; i++) {
            if (i == largestIdx)
                continue;

            if (largest < arr[i]) {
                largest = arr[i];
            }
        }

        return new int[] { largest, smallest };
    }
}
