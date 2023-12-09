package RecursionBasic;

import java.util.Arrays;

public class O08GGenerateFibonacci {
    public static int[] generateFibonacci(int n) {
        if (n == 1) {
            return new int[] { 0 };
        }

        if (n == 2) {
            return new int[] { 0, 1 };
        }

        int[] fibSeries = new int[n];
        fibSeries[0] = 0;
        fibSeries[1] = 1;
        generateSeries(fibSeries, 2, n);
        return fibSeries;
    }

    public static void generateSeries(int[] arr, int idx, int n) {
        if (idx == n) {
            return;
        }

        arr[idx] = arr[idx - 1] + arr[idx - 2];
        generateSeries(arr, idx + 1, n);
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(Arrays.toString(generateFibonacci(n)));
    }
}
