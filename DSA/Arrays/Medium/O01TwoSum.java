
import java.util.Arrays;
import java.util.HashMap;

public class O01TwoSum {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4 };
        int target = 6;

        findTwosumBrute(arr, target); // Brute - TC - O(N^2) || SC - O(1)
        findTwosumBetter(arr, target); // Better1 - TC - O(N + N) || SC - O(N)
        findTwosumBetter2(arr, target); // Better 2 - TC - O(N) || SC - O(N)

        // Optimal only if yes no needs to be printed if indexes need to be printed this will not work
        findTwosumOptimal(arr, target);
    }

    public static void findTwosumBrute(int[] arr, int target) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == i) {
                    continue;
                } else {
                    if (arr[i] + arr[j] == target) {
                        System.out.println("YES");
                        return;
                        // If asked to return
                        // return new int[] {i , j};
                    }
                }
            }
        }
        System.out.println("NO");
        // If asked to return
        // return new int[] {-1 , -1};
    }

    public static void findTwosumBetter(int[] arr, int target) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // We can skip it and do all in the same loop also for this refer third approach
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;

            if (map.containsKey(moreNeeded)) {
                System.out.println("YES");
                return;
                // If asked to return
                // return new int[] {i , j};
            }
        }

        System.out.println("NO");
        // If asked to return
        // return new int[] {-1 , -1};
    }

    public static void findTwosumBetter2(int[] arr, int target) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;

            if (map.containsKey(moreNeeded)) {
                System.out.println("YES");
                return;
                // If asked to return
                // return new int[] {i , j};
            }

            map.put(arr[i], i);
        }

        System.out.println("NO");
        // If asked to return
        // return new int[] {-1,-1};
    }

    public static void findTwosumOptimal(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int left = 0;
        int right = n - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("YES" + left + " " + right);
                return;
                // If asked to return
                // return new int[] {left , right};
            } else if (target > sum) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println("NO");
        // If asked to return
        // return new int[] {-1 , j-1};
    }
}
