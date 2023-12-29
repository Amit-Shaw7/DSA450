package DSA.Arrays.Easy;

import java.util.HashMap;
import java.util.Map;

public class O012NumberOccuringOnlyOnce {
    public static void main(String[] args) {
        int[] arr = { 1, 1, 2, 2, 3, 3, 4, 5, 5, 6, 6 };

        // Brute - TC - O(n^2) || SC - O(1)
        int numOccuringOnce1 = findNumberThatAppearsOnceBrute(arr);
        System.out.println(numOccuringOnce1);

        // Better - TC - O(n + n + m) m -> length of hash array || SC - O(maxElem + 1)
        int numOccuringOnce2 = findNumberThatAppearsOnceBetter(arr);
        System.out.println(numOccuringOnce2);

        // Optimal - TC - O(n + m) m -> length of hashmap || SC - O(m)
        int numOccuringOnce3 = findNumberThatAppearsOnceOptimal(arr);
        System.out.println(numOccuringOnce3);
    }

    public static int findNumberThatAppearsOnceBrute(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int curr = arr[i];
            int occurence = 0;

            for (int j = 0; j < arr.length; j++) {
                if (curr == arr[j]) {
                    occurence++;
                }
            }

            if (occurence == 1) {
                return arr[i];
            }
        }

        return -1;
    }

    public static int findNumberThatAppearsOnceBetter(int[] arr) {
        int max = arr[0];

        // Finding max elem
        for (int i = 0; i < arr.length; i++) {
            max = Math.max(max, arr[i]);
        }

        // Create a hash array from 0 to max + 1 elem
        int[] hash = new int[max + 1];

        // Setting frequencies
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        for (int i = 0; i < hash.length; i++) {
            if (hash[i] == 1) {
                return i;
            }
        }

        return -1;
    }

    public static int findNumberThatAppearsOnceOptimal(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int freq = 0;

            if (map.containsKey(key)) {
                freq = map.get(arr[i]);
            }

            freq++;
            map.put(arr[i], freq);
        }

        for (Map.Entry<Integer, Integer> mapElement : map.entrySet()) {
            int value = mapElement.getValue();
            int key = mapElement.getKey();

            if (value == 1) {
                return key;
            }
        }

        return -1;
    }
}
