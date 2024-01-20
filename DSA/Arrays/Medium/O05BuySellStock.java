public class O05BuySellStock {
    public static void main(String[] args) {
        int[] arr = { 2, 100, 150, 120 };

        // Brute - TC - O(N^2) | SC - O(1)
        System.out.println(findMaxProfitBrute(arr));

        // Optimal - TC - O(N) | SC - O(1)
        System.out.println(findMaxProfitOptimal(arr));
    }

    public static int findMaxProfitBrute(int[] arr) {
        int maxProfit = 0;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int cp = arr[i];
            for (int j = i + 1; j < n; j++) {
                int sp = arr[j];
                if (sp > cp) {
                    int profit = sp - cp;
                    if (profit > maxProfit) {
                        maxProfit = profit;
                    }
                }
            }
        }

        return maxProfit;
    }

    public static int findMaxProfitOptimal(int[] arr) {
        int maxProfit = 0;
        int min = Integer.MAX_VALUE;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            if(arr[i] < min){
                min = arr[i];
            }

            int profit = arr[i] - min;
            if(profit > maxProfit){
                maxProfit = profit;
            }
        }

        return maxProfit;
    }
}
