package Easy;

/*
Have the function LargestFour(arr) take the array of integers stored in arr,
and find the four largest elements and return their sum. For example:
if arr is [4, 5, -2, 3, 1, 2, 6, 6] then the four largest elements in this array are 6, 6, 4,
and 5 and the total sum of these numbers is 21, so your program should return 21.
If there are less than four numbers in the array your program should return the sum of all the numbers in the array.
Examples
Input: new int[] {1, 1, 1, -5}
Output: -2
Input: new int[] {0, 0, 2, 3, 7, 1}
Output: 13
 */

import java.util.Arrays;
import java.util.Comparator;

class LargestFour {
    public static void main(String[] args) {
        System.out.println(largestFour(new int[]{4, 5, -2, 3, 1, 2, 6, 6}));
        System.out.println(largestFour2(new int[]{4, 5, -2, 3, 1, 2, 6, 6}));
        System.out.println(largestFour(new int[]{-1, 2, 9}));
        System.out.println(largestFour2(new int[]{-1, 2, 9}));
    }

    //my initial solution
    public static int largestFour(int[] arr) {
        Arrays.sort(arr);
        if (arr.length > 3) {
            int[] newArray = new int[4];
            System.arraycopy(arr, arr.length - 4, newArray, 0, 4);
            return Arrays.stream(newArray).reduce(0, Integer::sum);
        } else {
            return Arrays.stream(arr).reduce(0, Integer::sum);
        }
    }

    //stream solution found
    public static int largestFour2(int[] arr) {
        return Arrays.stream(arr)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .limit(4)
                .mapToInt(Integer::intValue)
                .sum();
    }

}
