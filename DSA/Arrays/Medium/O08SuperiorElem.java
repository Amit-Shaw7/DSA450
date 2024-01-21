import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class O08SuperiorElem {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 2 };

        System.out.println(findAllSuperiorBrute(arr));
        
        
        System.out.println(findAllSuperiorOptimal(arr));
    }

    public static List<Integer> findAllSuperiorBrute(int[] arr) {
        List<Integer> ls = new ArrayList<>();
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            boolean isSuperior = true;
            for (int j = i+1; j < n; j++) {
                if(arr[j] > curr){
                    isSuperior = false;
                    break;
                }
            }

            if(isSuperior == true){
                ls.add(curr);
            }
        }
        Collections.sort(ls);
        return ls;
    }

    public static List<Integer> findAllSuperiorOptimal(int[] arr){
        List<Integer> ls = new ArrayList<>();
        int n = arr.length;
        int max = arr[n-1];
        ls.add(arr[n-1]);

        for(int i = n-2 ; i >= 0 ; i--){
            int curr = arr[i];
            if(curr > max){
                max = curr;
                ls.add(curr);
            }
        }
        
        return ls;
    }
}
