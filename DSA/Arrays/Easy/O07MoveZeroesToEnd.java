package DSA.Arrays.Easy;

import java.util.Arrays;

public class O07MoveZeroesToEnd {
    public static void main(String[] args) {
        int[] arr = { 0, 1, 2, 3, 0, 4, 5, 0 };
        int[] arr2 = { 0, 1, 2, 3, 0, 4, 5, 0 };
        System.out.println("------------ Brute ----------------");
        System.out.print("Original : ");
        System.out.println(Arrays.toString(arr));
        moveZeroesToEnd(arr);
        System.out.print("After moving zero to end : ");
        System.out.println(Arrays.toString(arr));

        System.out.println("------------ Optimal ----------------");
        System.out.print("Original : ");
        System.out.println(Arrays.toString(arr2));
        moveZeroesToEndOptimal(arr2);
        System.out.print("After moving zero to end : ");
        System.out.println(Arrays.toString(arr2));


    }

    public static void moveZeroesToEnd(int[] arr) {
        int[] temp = new int[arr.length];
        int j = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                temp[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = temp[i];
        }
    }

    public static void moveZeroesToEndOptimal(int[] arr) {
        int j = -1;

        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] == 0){
                j = i;
                break;
            }
        }

        if(j == -1){
            return;
        }

        for(int i = j + 1 ; i < arr.length ; i++){
            if(arr[i] != 0){
                swap(arr , i , j);
                j++;
            }
        }
    }

    public static void swap(int[] arr , int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
