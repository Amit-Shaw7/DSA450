package RecursionBasic;

import java.util.Arrays;

public class O03Print_N_To_1 {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(Arrays.toString(printNos(x)));
    }

    public static int[] printNos(int x) {
        int[] arr = new int[x];

        addNumberToArray(x, 0, arr);

        return arr;
    }

    public static void addNumberToArray(int n, int idx, int[] arr) {
        if (idx == arr.length) {
            return;
        }

        arr[idx] = n;
        addNumberToArray(n - 1, idx + 1, arr);
    }
}
