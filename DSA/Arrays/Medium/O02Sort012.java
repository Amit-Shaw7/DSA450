import java.util.Arrays;

public class O02Sort012 {
    public static void main(String[] args) {
        int[] arr = { 1, 0, 2, 1, 2, 0 };
        int[] arr1 = { 1, 0, 2, 1, 2, 0 };
        int[] arr2 = { 1, 0, 2, 1, 2, 0 };

        sortBrute(arr); // TC - O(n(logn)) || SC - O(N);
        System.out.println(Arrays.toString(arr));

        sortBetter(arr1); // TC - O(N) but iterating twice || SC - O(1);
        System.out.println(Arrays.toString(arr1));

        sortOptimal(arr2); // TC - O(N) but iterating once || SC - O(1);
        System.out.println(Arrays.toString(arr2));
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

    public static void sortOptimal(int[] arr) {
        int n = arr.length;
        int low = 0;
        int mid = 0;
        int high = n - 1;

        for (int i = 0; i < n; i++) {
            if (arr[mid] == 0) {
                swap(arr, mid, low);
                mid++;
                low++;
            } else if (arr[mid] == 1) {
                mid++;
            }else{
                swap(arr , mid , high);
                high--;
            }
        }
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }
}
