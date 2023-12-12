package DSA.Arrays.Easy;

public class O01FindLargest {
    public static void main(String[] args) {
        int[] arr = { 3, 2, 4, 5, 3, 2, 3, 455 };
        int num = findLargest(arr);
        System.out.println(num);
    }

    public static int findLargest(int[] arr) {
        int largest = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largest) {
                largest = arr[i];
            }
        }
        return largest;
    }

}
