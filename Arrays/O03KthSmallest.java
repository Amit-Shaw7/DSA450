package Arrays;

import java.util.Arrays;

public class O03KthSmallest {
    public static int kthSmallest(int[] arr, int l, int r, int k) {
        Arrays.sort(arr);
        return arr[k-1];
    }

    public static void main(String[] args) {
        int[] arr = { 7, 10, 4, 20, 15 };
        int k = 3;
        int l = 0;
        int r = 5;
        int kthSmallest = kthSmallest(arr, l, r, k);
        System.out.println(kthSmallest);
    }
}
