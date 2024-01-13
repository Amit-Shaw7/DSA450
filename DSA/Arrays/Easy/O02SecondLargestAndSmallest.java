package DSA.Arrays.Easy;

import java.util.Arrays;

public class O02SecondLargestAndSmallest {
    public static void main(String[] args) {
        int[] arr = { 13, 15, 13, 12, 2, 45, 76, 5, 3 };
        int[] res = findSecondLargestAndSmallestBrute(arr);
        System.out.println(Arrays.toString(res));
        
        int[] resOptimal = findSecondLargestAndSmallestOptimal(arr);
        System.out.println(Arrays.toString(resOptimal));
    }

    public static int[] findSecondLargestAndSmallestBrute(int[] arr) {
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

    public static int[] findSecondLargestAndSmallestOptimal(int[] arr){

        int secondSmall = findSecondSmall(arr);
        int secondLarge = findSecondLarge(arr);

        return new int[]{secondLarge , secondSmall};
    }

    public static int findSecondSmall(int[] arr) {
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        if (arr.length < 2) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < smallest) {
                secondSmallest = smallest;
                smallest = arr[i];
            } else if (arr[i] < secondSmallest && arr[i] != smallest) {
                secondSmallest = arr[i];
            }
        }
        return secondSmallest;
    }

    public static int findSecondLarge(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if (arr.length < 2) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        return secondLargest;
    }

}
