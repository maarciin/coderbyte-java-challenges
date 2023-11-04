package Easy;

import java.util.Arrays;
import java.util.Scanner;

/*
Have the function SumMultiplier(arr) take the array of numbers stored in arr and return the string true
 if any two numbers can be multiplied so that the answer is greater than double the sum of all the elements in the array.
  If not, return the string false. For example: if arr is [2, 5, 6, -6, 16, 2, 3, 6, 5, 3]
  then the sum of all these elements is 42 and doubling it is 84. There are two elements in the array,
  16 * 6 = 96 and 96 is greater than 84, so your program should return the string true.
Examples
Input: new int[] {2, 2, 2, 2, 4, 1}
Output: false
Input: new int[] {1, 1, 2, 10, 3, 1, 12}
Output: true
 */
class SumMultiplier {
    public static void main(String[] args) {
        System.out.println(sumMultiplier(new int[]{2, 2, 2, 2, 4, 1}));
        System.out.println(sumMultiplier(new int[]{1, 1, 2, 10, 3, 1, 12}));
        System.out.println(sumMultiplier(new int[]{2}));
    }

    public static boolean sumMultiplier(int[] arr) {
        int arrayTotalSum = Arrays.stream(arr).reduce(0, Integer::sum);
        Arrays.sort(arr);
        int biggestNumber = arr.length > 0 ? arr[arr.length - 1] : 0;
        int secondBiggestNumber = arr.length > 1 ? arr[arr.length - 2] : 0;
        return biggestNumber * secondBiggestNumber > 2 * arrayTotalSum;
    }

}
