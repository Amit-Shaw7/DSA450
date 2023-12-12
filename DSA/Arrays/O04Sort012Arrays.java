package DSA.Arrays;

import java.util.Arrays;

public class O04Sort012Arrays {
    public static void sort012(int[] a) {
        int count0 = 0;
        int count1 = 0;
        int count2 = 0;

        for (int i = 0; i < a.length; i++) {
            switch (a[i]) {
                case 0:
                    count0++;
                    break;
                case 1:
                    count1++;
                    break;
                case 2:
                    count2++;
                    break;

                default:
                    break;
            }
        }
        int i = 0;

        while (count0 > 0) {
            a[i] = 0;
            count0--;
            i++;
        }
        while (count1 > 0) {
            a[i] = 1;
            count1--;
            i++;
        }
        while (count2 > 0) {
            a[i] = 2;
            count2--;
            i++;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 0, 1, 2 };
        sort012(arr);
        System.out.println(Arrays.toString(arr));
    }
}
