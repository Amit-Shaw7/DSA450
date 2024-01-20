import java.util.Arrays;

public class O07NextPermutation {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3 };

        // TC - O(N) | SC - O(1)
        findNextPermutation(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void findNextPermutation(int[] arr) {
        int n = arr.length;
        int bkp = -1; // breakpoint

        for (int i = n - 2; i >= 0; i--) {
            int prev = arr[i];
            int next = arr[i + 1];
            if (next > prev) {
                bkp = i;
                break;
            }
        }

        if (bkp == -1) {
            reverse(arr, 0, n - 1);
            return;
        }

        for (int i = n - 1; i > bkp; i--) {
            int curr = arr[i];
            int bkpElemm = arr[bkp];
            if (curr > bkpElemm) {
                swap(arr, i, bkp);
                break;
            }
        }
        reverse(arr, bkp + 1, n - 1);
    }

    public static void swap(int[] arr, int idx1, int idx2) {
        int temp = arr[idx1];
        arr[idx1] = arr[idx2];
        arr[idx2] = temp;
    }

    public static void reverse(int[] arr, int st, int end) {
        while (st < end) {
            swap(arr, st, end);
            st++;
            end--;
        }
    }
}
