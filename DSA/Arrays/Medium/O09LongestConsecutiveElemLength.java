import java.util.Arrays;

public class O09LongestConsecutiveElemLength {
    public static void main(String[] args) {

        int[] arr = { 15, 6, 2, 1, 16, 4, 2, 29, 9, 12, 8, 5, 14, 21, 8, 12, 17, 16, 6, 26, 3 };
        System.out.println(findLongestConsecutiveArrLengthBrute(arr));
    }

    public static int findLongestConsecutiveArrLengthBrute(int[] arr) {
        int n = arr.length;
        int count = 1;
        Arrays.sort(arr);
        int max = arr[0];
        System.out.println(Arrays.toString(arr));

        for (int i = 1; i < n; i++) {
            int curr = arr[i];
            if (curr - max == 1) {
                max = curr;
                count++;
            }
        }
        return count++;
    }
}
