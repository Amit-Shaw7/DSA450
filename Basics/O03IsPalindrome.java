package Basics;

public class O03IsPalindrome {
    public static int reverse(int x) {
        long rev = 0;
        int original = x;

        while (original > 0) {
            int r = original % 10;
            rev = (rev * 10) + r;
            original = original / 10;
        }

        return (int) rev;
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int reversed = reverse(x);

        if (x == reversed) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int num = 522;
        System.out.println(isPalindrome(num));
    }
}
