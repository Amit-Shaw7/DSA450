package DSA.Arrays.Easy;

public class O03CheckArraySorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        int res = isSorted(arr);
        System.out.println(res);
    }

    public static int isSorted(int[] arr) {
        // Write your code here.
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return 0;
            }
        }

        return 1;
    }
}
