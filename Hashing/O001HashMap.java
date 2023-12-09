package Hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class O001HashMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter " + n + " elements with space or enter");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Pre calculation
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            int key = arr[i];
            int freq = 0;

            if (map.containsKey(key)) {
                freq = map.get(key);
            }

            freq++;
            map.put(arr[i], freq);
        }
        for (int name : map.keySet()) {
            int key = name;
            int value = map.get(name);
            System.out.println(key + " " + value);
        }
        System.out.print("How many queries you're gonna ask : ");
        int q = sc.nextInt();

        for (int i = 0; i < q; i++) {
            System.out.print("Enter your query : ");
            int num = sc.nextInt();
            // Fetching
            System.out.print("Freq of " + num + " : " + " ");
            if (map.containsKey(num)) {
                System.out.println(map.get(num));
            } else {
                System.out.println(0);
            }
            System.out.println();
        }

        sc.close();

    }
}
