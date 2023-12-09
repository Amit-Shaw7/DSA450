package RecursionBasic;

import java.util.ArrayList;
import java.util.List;

public class O05Factorial_Less_Than_N {
    public static void main(String[] args) {
        int n = 7;
        System.out.println(factorial(n));
    }

    public static List<Long> factorial(int n) {
        List<Long> ls = new ArrayList<>();
        for (long i = 1; findFactorial(i) <= n; i++) {
            ls.add(findFactorial(i));
        }
        return ls;
    }

    public static long findFactorial(long n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * findFactorial(n - 1);
    }
}
