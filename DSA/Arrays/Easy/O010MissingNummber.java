package DSA.Arrays.Easy;

public class O010MissingNummber {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 5, 6 };
        int n = 6; // elem inside arr will not be greater than it

        // NOTE - For TC - N -> n && m -> length of arr && h -> length of hash array

        // Brute - TC - O(M^2) || SC - O(1)
        int missingNum1 = findMMissingNumBrute(arr, n);
        System.out.println(missingNum1);

        // Better - TC - O(N + M)
        int missingNum2 = findMMissingNumBrute(arr, n);
        System.out.println(missingNum2);

        // Optimal 1 - TC - O(N) || SC - O(1)
        int missingNum3 = findMissingOptimal(arr, n);
        System.out.println(missingNum3);
    }

    public static int findMMissingNumBrute(int[] a, int N) {
        for (int i = 1; i <= N; i++) {

            // flag variable to check
            // if an element exists
            int flag = 0;

            // Search the element using linear search:
            for (int j = 0; j < a.length; j++) {
                if (a[j] == i) {

                    // i is present in the array:
                    flag = 1;
                    break;
                }
            }

            // check if the element is missing
            // i.e flag == 0:

            if (flag == 0)
                return i;
        }

        // The following line will never execute.
        // It is just to avoid warnings.
        return -1;
    }

    public static int findMMissingNumBetter(int[] arr, int n) {
        int[] hash = new int[n];

        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 0) {
                return hash[i];
            }
        }

        return -1;
    }

    public static int findMissingOptimal(int[] arr, int n) {
        // We know n is the the max num and arr must have all the number till n
        int sum = (n * (n + 1)) / 2; // sum till n
        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        int missingNum = sum - arrSum;
        return missingNum;
    }

}
