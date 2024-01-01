import java.util.HashMap;
import java.util.Map;

public class O03FindMajority {
    public static void main(String[] args) {
        int[] arr = { 2, 2, 3, 1, 1, 1, 2, 2, 2};

        System.out.println(findMajorityBrute(arr)); // TC - O(N^2) || SC - O(1);

        // TC - O(N) || SC - O(1); but Hashmap insertion takes logN and for n elem it
        // will take n*logn hence , TC - O(N*logN) + O(N)
        System.out.println(findMajorityBetter(arr));

        System.out.println(findMajorityOptimal(arr));
    }

    public static int findMajorityBrute(int[] arr) {
        int majority = -1;
        int n = arr.length;

        for (int i = 0; i < n; i++) {
            int currentElem = arr[i];
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (arr[j] == currentElem) {
                    count++;
                }
            }

            if (count > n / 2) {
                majority = currentElem;
            }
        }

        return majority;
    }

    public static int findMajorityBetter(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = arr.length;
        int majority = -1;

        for (int i = 0; i < n; i++) {
            int key = arr[i];
            int freq = 0;

            if (map.containsKey(key)) {
                freq = map.get(key);
            }
            freq++;

            map.put(key, freq);
        }

        for (Map.Entry<Integer, Integer> mapElement : map.entrySet()) {
            int value = mapElement.getValue();
            int key = mapElement.getKey();

            if (value > n / 2) {
                majority = key;
            }
        }

        return majority;
    }

    public static int findMajorityOptimal(int[] arr) {
        int n = arr.length;
        int cnt = 0;
        int majorityElem = 0;

        for (int i = 0; i < n; i++) {
            int curr = arr[i];
            if (cnt == 0) {
                cnt = 1;
                majorityElem = curr;
            } else if (majorityElem == curr) {
                cnt++;
            }else{
                cnt--;
            }
        }

        int countOfMajorityElem = 0;
        for(int i = 0 ; i < n; i++){
            if(arr[i] == majorityElem){
                countOfMajorityElem++;
            }
        }

        if(countOfMajorityElem > n/2){
            return majorityElem;
        }
        return -1;
    }
}
