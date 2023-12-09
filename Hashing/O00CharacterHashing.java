package Hashing;

import java.util.Scanner;

/*
 * Input format
 * sadfsgaf                 -> String
 * 5                        -> number of queries
 * a                        -> query 1 find freq of a
 * b                        -> query 2 find freq of b
 * c                        -> query 3 find freq of c
 * d                        -> query 3 find freq of d
 * e                        -> query 3 find freq of e
 * 
 * Assuming only lowercase character present in string
 * Note - Always use array for a character hashing because we never gonna need aarray greater than 256 size
 */

public class O00CharacterHashing {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int q = sc.nextInt();

        // Pre calcultion
        int[] hash = new int[26]; // There are only 26 lowercase character in string
        for (int i = 0; i < str.length(); i++) {
            char curr = str.charAt(i);
            hash[curr - 'a']++;
        }    

        for (int i = 0; i < q; i++) {
            char ch = sc.next().charAt(0);
            System.out.println(hash[ch - 'a']);
        }
    }
}
