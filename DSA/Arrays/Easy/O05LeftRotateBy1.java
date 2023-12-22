package DSA.Arrays.Easy;

import java.util.Arrays;

public class O05LeftRotateBy1 {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };

        System.out.println(Arrays.toString(arr));
        leftRotateByOneOptimal(arr);
        System.out.println(Arrays.toString(arr));
    }

    // Brute force  - use an extra array

    public static void leftRotateByOneOptimal(int[] arr) {
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
    }
}
