package Hashing;

import java.util.Arrays;
import java.util.HashMap;

public class O02CountFreqTillN {
    public static void main(String[] args) {
        int n = 7;
        int[] arr = { 10, 7, 9, 8, 14, 20, 6 };

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, 0);
        }

        for (int i = 1; i <= n; i++) {
            int key = arr[i - 1];
            if (map.containsKey(key)) {
                int freq = map.get(key);
                map.put(key, freq++);
            }
        }

        for (int name : map.keySet()) {
            int key = name;
            int value = map.get(name);
            System.out.println(key + " " + value);
        }

        int[] res = new int[n];
        for (int i = 1; i < n; i++) {
            res[i - 1] = map.get(i);
        }

        System.out.println(Arrays.toString(res));
    }

}
