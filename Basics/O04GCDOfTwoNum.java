package Basics;

public class O04GCDOfTwoNum {
    public static void main(String[] args) {
        int num1 = 176;
        int num2 = 32;
        System.out.println(findGCDBrute(num1, num2));
        System.out.println(findGCDOptimal(num1, num2));
    }

    public static int findGCDBrute(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }

        if (num1 == num2) {
            return num1;
        }

        int gcd = 0;
        int limit = findLimit(num1, num2);

        for (int i = 1; i <= limit; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    }

    public static int findGCDOptimal(int a, int b) {
        if (b == 0) {
            return a;
        }
        int next = a % b;
        return findGCDOptimal(b, next);
    }

    public static int findLimit(int num1, int num2) {
        int limit = 0;
        int bigger = num1 > num2 ? num1 : num2;
        int smaller = num1 < num2 ? num1 : num2;

        if (bigger / 2 > smaller) {
            limit = smaller;
        } else {
            limit = bigger / 2;
        }
        return limit;
    }
}
