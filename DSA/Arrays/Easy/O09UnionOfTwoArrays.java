package DSA.Arrays.Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


public class O09UnionOfTwoArrays {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3, 7, 8, 9 };
        int[] arr2 = { 1, 2, 3, 4, 5, 6, 7 };

        // Method - I - TC - O((m+n)(log(m+n))) || SC - 0(N) - We are using List to return not to solve hence using hashmap only
        List<Integer> union1 = findUnionUsingHashMap(arr1, arr2);
        System.out.println(union1);

        // Method - II - TC - O((m+n)(log(m+n))) || SC - 0(N) - We are using List to return not to solve hence using only hashset
        List<Integer> union2 = findUnionUsingHashSet(arr1, arr2);
        System.out.println(union2);

        // Method - III - TC - O(m+n) || SC - 0(1) - We are using List to return not to solve
        List<Integer> union3 = findUnionUsingTwoPointer(arr1, arr2);
        System.out.println(union3);

    }

    // First method - using Hashmap
    public static List<Integer> findUnionUsingHashMap(int[] arr1, int[] arr2) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        ArrayList<Integer> Union = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++)
            freq.put(arr1[i], freq.getOrDefault(arr1[i], 0) + 1);

        for (int i = 0; i < arr2.length; i++)
            freq.put(arr2[i], freq.getOrDefault(arr2[i], 0) + 1);
        for (int it : freq.keySet())
            Union.add(it);
        return Union;

        
    }
    
    // Second method - using HashSet
    public static List<Integer> findUnionUsingHashSet(int[] arr1, int[] arr2) {
        ArrayList<Integer> Union = new ArrayList<>();
        HashSet<Integer> set = new HashSet<>();

        for(int i = 0 ; i < arr1.length; i++){
            set.add(arr1[i]);
        }
        for(int i = 0 ; i < arr2.length; i++){
            set.add(arr2[i]);
        }

        set.forEach((val) -> {
            Union.add(val);
        });

        return Union;
    }


    public static List<Integer> findUnionUsingTwoPointer(int[] arr1, int[] arr2) {
        ArrayList<Integer> Union = new ArrayList<>();
        int n1 = arr1.length;
        int n2 = arr2.length;
        int i = 0;
        int j = 0;

        while(i < n1 && j < n2){
            if(arr1[i] >= arr2[j]){
                if(Union.size() == 0 || Union.get(Union.size() - 1) != arr2[j]){
                    Union.add(arr2[j]);
                }
                j++;
            }else{
                if(Union.size() == 0 || Union.get(Union.size() - 1) != arr1[i]){
                    Union.add(arr1[i]);
                }
                i++;
            }
        }

        while (i < n1) {
            if(Union.get(Union.size() - 1) != arr1[i]){
                Union.add(arr1[i]);
            }
            i++;
        }
        while (j < n2) {
            if( Union.get(Union.size() - 1) != arr2[j]){
                Union.add(arr2[j]);
            }
            j++;
        }

        return Union;
    }

}
