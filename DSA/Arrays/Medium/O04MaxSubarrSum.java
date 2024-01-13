public class O04MaxSubarrSum {
    public static void main(String[] args) {
        int[] arr = { 10, 20, -30, 40, -50, 60 };

        System.out.println(findMaxSubarrBrute(arr));
    }

    public static int findMaxSubarrBrute(int[] arr) {
        int sum = Integer.MIN_VALUE;
        int n = arr.length;

        for (int k = 0; k < n; k++) {
            for (int i = k; i < n; i++) {
                int curSubSum = 0;
                for (int j = 0; j <= i; j++) {
                    curSubSum += arr[j];
                }

                if (sum < curSubSum) {
                    sum = curSubSum;
                }
            }
        }

        return sum;
    }
}
