package DSA.Arrays.Easy;

public class O011LongestConsecutiveOne {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 1, 1, 1, 3, 1, 1, 1 ,1};
        int maxRep = findMaxConsecutiveOne(arr);
        System.out.println(maxRep);
    }

    public static int findMaxConsecutiveOne(int[] arr) {
        int rep = 0;
        int repTemp = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 1){
                repTemp++;
                if(repTemp > rep){
                    rep = repTemp;
                }
            }else{
                repTemp = 0;
            }
        }
        return rep;
    }
}
