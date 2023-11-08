package Medium;

import java.util.Arrays;

/*
Have the function Consecutive(arr) take the array of integers stored in arr
and return the minimum number of integers needed to make the contents of arr consecutive
from the lowest number to the highest number.
For example: If arr contains [4, 8, 6] then the output should be 2
because two numbers need to be added to the array (5 and 7)
to make it a consecutive array of numbers from 4 to 8.
Negative numbers may be entered as parameters and no array will have less than 2 elements.
Examples
Input: new int[] {5,10,15}
Output: 8
Input: new int[] {-2,10,4}
Output: 10
 */
class Consecutive {
    public static void main(String[] args) {
        System.out.println(consecutive(new int[]{5, 10, 15}));
        System.out.println(consecutive(new int[]{-2, 10, 4}));
    }

    public static int consecutive(int[] arr) {
        Arrays.sort(arr);
        return arr[arr.length - 1] - arr[0] - (arr.length - 1);
    }
}
