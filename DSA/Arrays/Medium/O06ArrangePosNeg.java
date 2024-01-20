import java.util.Arrays;

public class O06ArrangePosNeg {
    public static void main(String[] args) {
        int[] arr = { 1, 2, -3, -1, -2, 3 };

        // Brute ---> TC - O(N + N/2) Or O(2N) | O(N)
        System.out.println(Arrays.toString(arrangeBrute(arr)));

        System.out.println(Arrays.toString(arrangeOptimal(arr)));
    }

    public static int[] arrangeBrute(int[] arr) {
        int n = arr.length;
        int[] pos = new int[n / 2];
        int[] neg = new int[n / 2];
        int negIdx = 0;
        int posIdx = 0;

        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) {
                pos[posIdx] = arr[i];
                posIdx++;
            } else {
                neg[negIdx] = arr[i];
                negIdx++;
            }
        }

        for (int i = 0; i < n / 2; i++) {
            arr[2 * i] = pos[i];
            arr[2 * i + 1] = neg[i];
        }

        return arr;
    }

    public static int[] arrangeOptimal(int[] arr) {
        int n = arr.length;
        int[] res = new int[n];
        int negIdx = 1;
        int posIdx = 0;

        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            if (curr > 0) {
                res[posIdx] = arr[i];
                posIdx = posIdx + 2;
            } else {
                res[negIdx] = arr[i];
                negIdx = negIdx + 2;
            }
        }

        return res;
    }
}
