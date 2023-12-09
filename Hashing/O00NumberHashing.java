package Hashing;

import java.util.Scanner;

/*
 * Input format
 * 5                        -> size of array
 * 2 3 4 5 6                -> elements of array
 * 5                        -> number of queries
 * 3                        -> query 1 find freq of 3
 * 4                        -> query 2 find freq of 4
 * 6                        -> query 3 find freq of 6
 * 12                       -> query 3 find freq of 12
 * 9                        -> query 3 find freq of 9
 * 
 * Assuming the maximum elem in array is "12"
 * If the greatest number is greater than 10^7 we cannot use array in the below maanner we will get an error 
 * baecause java will not able to allocate that big size memory
 */

public class O00NumberHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        // Pre calculation
        int[] hash = new int[13]; // size -> the largest elem of array + 1
        for (int i = 0; i < arr.length; i++) {
            hash[arr[i]]++;
        }

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            int num = sc.nextInt();
            System.out.println(hash[num]);
        }

        sc.close();
    }
}
