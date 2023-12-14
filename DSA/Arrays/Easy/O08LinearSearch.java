package DSA.Arrays.Easy;

public class O08LinearSearch {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 4, 6, 5, 3, 12, 34, 16 };
        int target = 16;
        int idx = findUsingLinearSearch(arr , target);
        System.out.println(idx);
    }

    public static int findUsingLinearSearch(int[] arr , int target){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target){
                return i;
            }
        }

        return -1;
    }
}
