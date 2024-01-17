package DSA.Arrays.Easy;

import java.util.HashMap;

public class O013LongestSubarrWithSumK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1, 1, 1, 4, 2, 3 };
        int k = 3;

        // Brute - TC - O(N^3) || SC - O(1)
        int length1 = findLongestSubArrLengthBrute(arr, k);
        System.out.println(length1);

        // Brute - TC - O(N^2) || SC - O(1)
        int length4 = findLongestSubArrLengthBrute2(arr, k);
        System.out.println(length4);

        // Better - TC - O(N^2) || SC - O(1)
        int length2 = findLongestSubArrLengthBetter(arr, k);
        System.out.println(length2);

        // Better - TC - O(N^2) || SC - O(1)
        int length3 = findLongestSubArrLengthOptimal(arr, k);
        System.out.println(length3);
    }

    public static int findLongestSubArrLengthBrute(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                // Find sum
                int sum = 0;
                for (int l = i; l <= j; l++) {
                    sum += arr[l];
                }
                if (sum == k) {
                    maxLength = Integer.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    public static int findLongestSubArrLengthBrute2(int[] arr, int k) {
        int n = arr.length;
        int maxLength = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                // Find sum
                sum += arr[j];

                if (sum == k) {
                    maxLength = Integer.max(maxLength, j - i + 1);
                }
            }
        }

        return maxLength;
    }

    public static int findLongestSubArrLengthBetter(int[] arr, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxLength = 0;
        int n = arr.length;
        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += arr[i];

            // sum calculation
            if (sum == k) {
                maxLength = Integer.max(maxLength, i + 1);
            }

            // find sum - k and check if it is present
            int rem = sum - k;
            if (map.containsKey(rem)) {
                int val = map.get(rem);
                int len = i - val;
                maxLength = Integer.max(len, maxLength);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        return maxLength;
    }

    public static int findLongestSubArrLengthOptimal(int[] arr, int k) {
        int maxLength = 0;
        int right = 0;
        int left = 0;
        int n = arr.length;
        int sum = arr[0];

        while (right < n) {

            while (sum > k && left <= right) {
                sum = sum - arr[left];
                left++;
            }

            if (sum == k) {
                maxLength = Integer.max(maxLength, right - left + 1);
            }

            right++;
            if(right < n){
                sum = sum + arr[right];
            }
        }

        return maxLength;
    }

}
