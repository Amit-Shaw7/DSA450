package Hashing;

import java.util.*;

public class O03LargestLowest {

    public static void main(String[] args) {
        int[] arr = { 4, 4, 4, 5, 65, 4, 3 };
        System.out.println(Arrays.toString(getFrequencies(arr)));
    }

    public static int[] getFrequencies(int[] v) {

        // Write Your Code Here

        Map<Integer, Integer> freqMap = new TreeMap<>();

        for (int i = 0; i < v.length; i++) {

            // populate the map

            if (freqMap.containsKey(v[i])) {

                freqMap.put(v[i], freqMap.get(v[i]) + 1);

            } else {

                freqMap.put(v[i], 1);

            }

        }

        // sort the map

        int[] ans = sortMap(freqMap);

        return ans;

    }

    private static int[] sortMap(Map<Integer, Integer> freqMap) {

        List<Map.Entry<Integer, Integer>> ll = new LinkedList<>(freqMap.entrySet());

        // sort the list

        Collections.sort(ll, (e1, e2) -> e1.getValue().compareTo(e2.getValue()));

        // System.out.println(freqMap.keySet());

        int highestFreqElement = ll.get(0).getKey();

        // System.out.println(highestFreqElement);

        int highestFreq = ll.get(0).getValue();

        for (int i = 1; i < ll.size(); i++) {

            if (ll.get(i).getValue() > highestFreq) {

                highestFreq = ll.get(i).getValue();

                highestFreqElement = ll.get(i).getKey();

                // System.out.println(highestFreqElement);

            }

        }

        int lowestFreqElement = ll.get(ll.size() - 1).getKey();

        int smallestFreq = ll.get(ll.size() - 1).getValue();

        for (int i = ll.size() - 2; i >= 0; i--) {

            if (ll.get(i).getValue() <= smallestFreq) {

                smallestFreq = ll.get(i).getValue();

                lowestFreqElement = ll.get(i).getKey();

            }

        }

        return new int[] { highestFreqElement, lowestFreqElement };

    }

}