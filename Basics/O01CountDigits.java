package Basics;

public class O01CountDigits {
    public static int countBruteForce(int n) {
        /*
         * TC - 0(n)
         * SC - 0(1)
         */
        int count = 0;
        while(n > 0){
            n = n/10;
            count++;
        }
        return count;
    }

    public static int countBetter(int n) {
        /*
         * TC - 0(1) // Ignoring the time of conversion of integer to string
         * SC - 0(1)
         */
        String str = Integer.toString(n);
        return str.length();
    }

    public static int countOptimized(int n) {
        /*
         * TC - 0(1)
         * SC - 0(1)
         */
        int count = (int)(Math.floor(Math.log10(n) + 1));
        return count;
    }

    public static void main(String[] args) {
        int n = 12345;
        System.out.println(countBruteForce(n));
        System.out.println(countBetter(n));
        System.out.println(countOptimized(n));
    }
}
