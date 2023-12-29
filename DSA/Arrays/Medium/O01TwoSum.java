package DSA.Arrays.Medium;

import java.util.HashMap;

public class O01TwoSum {
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 2, 2};
        int target = 5;

        findTwosumBrute(arr, target); // Brute - TC - O(N^2) || SC - O(1)
        findTwosumBetter(arr, target); // Better1 - TC - O(N + N) || SC - O(N)
        findTwosumBetter2(arr, target); // Better 2 - TC - O(N) || SC - O(N)
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
                    }
                }
            }
        }
        System.out.println("NO");
    }

    public static void findTwosumBetter(int[] arr, int target) {
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // We can skip it and do all in the same loop also for this refer third loop
        for (int i = 0; i < n; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;

            if (map.containsKey(moreNeeded)) {
                System.out.println("YES");
                return;
            }
        }

        System.out.println("NO");
    }

    public static void findTwosumBetter2(int[] arr , int target){
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int num = arr[i];
            int moreNeeded = target - num;

            if(map.containsKey(moreNeeded)){
                System.out.println("YES");
                return;
            }

            map.put(arr[i], i);
        }

        System.out.println("NO");
    }
}
