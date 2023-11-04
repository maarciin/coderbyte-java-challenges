package Easy;

import java.util.*;

/*
Have the function SecondGreatLow(arr) take the array of numbers stored in arr and
return the second lowest and second greatest numbers, respectively, separated by a space.
For example: if arr contains [7, 7, 12, 98, 106] the output should be 12 98.
The array will not be empty and will contain at least 2 numbers.
It can get tricky if there's just two numbers!
Examples
Input: new int[] {1, 42, 42, 180}
Output: 42 42
Input: new int[] {4, 90}
Output: 90 4
 */
class SecondGreatLow {
    public static void main(String[] args) {
        System.out.println(secondGreatLow(new int[]{1, 42, 42, 180}));
        System.out.println(secondGreatLow(new int[]{7, 7, 12, 98, 106}));
        System.out.println(secondGreatLow(new int[]{4, 90}));
        System.out.println(secondGreatLow(new int[]{2, 2, 2, 5, 5, 5, 6}));
        System.out.println(secondGreatLow(new int[]{80, 80}));
    }

    public static String secondGreatLow(int[] arr) {
        Set<Integer> numSet = new TreeSet<>();
        for (int num : arr) {
            numSet.add(num);
        }
        List<Integer> numList = new ArrayList<>(numSet);

        return numList.size() == 1 ? numList.get(0) + " " + numList.get(0)
                : numList.get(1) + " " + numList.get(numList.size() - 2);
    }
}
