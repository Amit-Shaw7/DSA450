package DSA.Arrays.Easy;

public class O013LongestSubarrWithSumK {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2, 1, 1, 1, 4, 2, 3 };
        int k = 3;

        // Brute - TC - O(N^2) || SC - O(1)
        int length1 = findLongestSubArrLengthBrute(arr, k);
        System.out.println(length1);


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
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum = sum + arr[j];
                if (sum == k) {
                    maxLength = Math.max(j - i + 1, maxLength);
                }
            }
        }
        return maxLength;
    }

    public static int findLongestSubArrLengthBetter(int[] arr , int k){
        int maxLength = 0;

        return maxLength;
    }
    public static int findLongestSubArrLengthOptimal(int[] arr , int k){
        int maxLength = 0;


        return maxLength;
    }


}
