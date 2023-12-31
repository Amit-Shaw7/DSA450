import java.util.Arrays;

public class O02Sort012 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 1, 2, 0 };
        int[] arr1 = { 1, 0, 2, 1, 2, 0 };
        int[] arr2 = { 1, 0, 2, 1, 2, 0 };

        sortBrute(arr);
        System.out.println(Arrays.toString(arr));

        sortBetter(arr1);
        System.out.println(Arrays.toString(arr1));
    }

    public static void sortBrute(int[] arr) {
        Arrays.sort(arr);
    }

    public static void sortBetter(int[] arr) {
        int n = arr.length;
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] == 0) {
                count0++;
            } else if (arr[i] == 1) {
                count1++;
            } else {
                count2++;
            }
        }

        int idx = 0;
        for (int i = 0; i < count0; i++) {
            arr[idx] = 0;
            idx++;
        }
        for (int i = 0; i < count1; i++) {
            arr[idx] = 1;
            idx++;
        }
        for (int i = 0; i < count2; i++) {
            arr[idx] = 2;
            idx++;
        }
    }
}
