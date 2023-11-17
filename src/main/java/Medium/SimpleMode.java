package Medium;

import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Map;

/*
Have the function SimpleMode(arr) take the array of numbers stored in arr and return the number
that appears most frequently (the mode). For example: if arr contains [10, 4, 5, 2, 4] the output should be 4.
If there is more than one mode return the one that appeared in the array first
(ie. [5, 10, 10, 6, 5] should return 5 because it appeared first). If there is no mode return -1.
The array will not be empty.

Input: new int[] {5,5,2,2,1}
Output: 5
Input: new int[] {3,4,1,6,10}
Output: -1
 */
class SimpleMode {
    public static void main(String[] args) {
        System.out.println(simpleMode(new int[]{2, 5, 5, 5, 2, 2, 1}));
        System.out.println(simpleMode(new int[]{10, 4, 5, 2, 4}));
        System.out.println(simpleMode(new int[]{3, 4, 1, 6, 10}));
        System.out.println(simpleMode(new int[]{4, 4, 5, 6, 7, 8, 8, 8, 8, 8}));
    }

    public static int simpleMode(int[] arr) {
        LinkedHashMap<Integer, Integer> numberOccurrences = new LinkedHashMap<>();
        for (int number : arr) {
            numberOccurrences.put(number, numberOccurrences.getOrDefault(number, 0) + 1);
        }
        return numberOccurrences.entrySet().stream()
                .filter(entry -> entry.getValue() > 1)
                .max(Comparator.comparingInt(Map.Entry::getValue))
                .map(Map.Entry::getKey)
                .orElse(-1);
    }
}
