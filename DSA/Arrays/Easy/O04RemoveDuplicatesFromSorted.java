package DSA.Arrays.Easy;

import java.util.HashSet;

/*
 * Return the size of the new array after removing all duplicates from it.
 */

public class O04RemoveDuplicatesFromSorted {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 2, 3, 3, 4, 5, 6 };
        System.out.println(removeDuplicates(arr));
        System.out.println(removeDuplicatesOptimal(arr));
    }

    public static int removeDuplicates(int[] arr) {
        // System.out.println("Incompplete");
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }

        return set.size();
    }

    public static int removeDuplicatesOptimal(int[] arr) {
        int i = 0;

        if (arr.length == 1) {
            return 1;
        }

        for (int j = 0; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        return i + 1;
    }
}
