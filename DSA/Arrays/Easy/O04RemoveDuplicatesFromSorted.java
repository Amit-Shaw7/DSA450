package DSA.Arrays.Easy;

import java.util.Arrays;
import java.util.HashSet;

/*
 * Return the size of the new array after removing all duplicates from it.
 */

public class O04RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 4, 5, 6 };
        int res = removeDuplicates(arr);
        System.out.println(res);
    }

    public static int removeDuplicates(int[] arr) {
        // System.out.println("Incompplete");
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        return set.size();
    }
}
