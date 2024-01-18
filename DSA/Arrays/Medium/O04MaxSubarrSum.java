public class O04MaxSubarrSum {
    public static void main(String[] args) {
        int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

        System.out.println(findMaxSubarrBrute(arr));

        System.out.println(findMaxSubArrBetter(arr));

        System.out.println(findMaxSubArrOptimal(arr));
    }

    public static int findMaxSubarrBrute(int[] arr) {
        int sum = Integer.MIN_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int subSum = 0;
                for (int k = i; k <= j; k++) {
                    subSum = subSum + arr[k];
                }

                if (subSum > sum) {
                    sum = subSum;
                }
            }
        }

        return sum;
    }

    public static int findMaxSubArrBetter(int[] arr) {
        int max = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum > max) {
                    max = sum;
                }
            }
        }

        return max;
    }

    public static int findMaxSubArrOptimal(int[] arr) {
        int max = arr[0];
        int n = arr.length;
        int sum = arr[0];

        for (int i = 0; i < n; i++) {
            if (sum >= 0) {
                sum = sum + arr[i];
            } else {
                sum = arr[i];
            }
            max = Integer.max(max, sum);
        }

        return max;
    }
}
