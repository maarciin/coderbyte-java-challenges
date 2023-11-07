package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Have the function ArrayAdditionI(arr) take the array of numbers stored in arr
and return the string true if any combination of numbers in the array (excluding the largest number)
can be added up to equal the largest number in the array, otherwise return the string false.
For example: if arr contains [4, 6, 23, 10, 1, 3] the output should return true because 4 + 6 + 10 + 3 = 23.
The array will not be empty, will not contain all the same elements, and may contain negative numbers.
Examples
Input: new int[] {5,7,16,1,2}
Output: false
Input: new int[] {3,5,-1,8,12}
Output: true
 */
class ArrayAdditionI {
    public static void main(String[] args) {
        System.out.println(arrayAdditionI(new int[]{4, 6, 23, 10, 1, 3}));
        System.out.println(arrayAdditionI(new int[]{5, 7, 16, 1, 2}));
        System.out.println(arrayAdditionI(new int[]{3, 5, -1, 8, 12}));
    }

    public static boolean arrayAdditionI(int[] arr) {

        Arrays.sort(arr);
        int max = arr[arr.length - 1];
        List<List<Integer>> combinations = new ArrayList<>();
        combinations.add(new ArrayList<>());

        for (int i = 0; i < arr.length - 1; i++) {
            List<Integer> newCombination;
            int combinationsLength = combinations.size();
            for (int j = 0; j < combinationsLength; j++) {
                newCombination = new ArrayList<>(combinations.get(j));
                newCombination.add(arr[i]);
                combinations.add(newCombination);
                if (newCombination.stream().mapToInt(Integer::intValue).sum() == max) {
                    return true;
                }
            }
        }
        return false;

    }
}

