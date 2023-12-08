package RecursionBasic;

import java.util.Arrays;

public class O02Print_1_To_N {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(Arrays.toString(printNos(x)));
    }
    public static int[] printNos(int x) {
        // Write Your Code Here
        int[] arr = new int[x];
        addNumberToArray(x, arr);

        return arr;
    }

    public static void addNumberToArray(int x, int[] arr) {
        // Write Your Code Here
        if (x == 0) {
            return;
        }

        arr[x - 1] = x;
        addNumberToArray(x + 1, arr);
    }
}
