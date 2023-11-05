package Easy;

/*
Have the function MeanMode(arr) take the array of numbers stored in arr and return 1
if the mode equals the mean, 0 if they don't equal each other (ie. [5, 3, 3, 3, 1]
should return 1 because the mode (3) equals the mean (3)). The array will not be empty,
will only contain positive integers, and will not contain more than one mode.
Examples
Input: new int[] {1, 2, 3}
Output: 0
Input: new int[] {4, 4, 4, 6, 2}
Output: 1
 */

import java.util.HashMap;
import java.util.Map;

class MeanMode {
    public static void main(String[] args) {
        System.out.println(meanMode(new int[]{1, 2, 3}));
        System.out.println(meanMode(new int[]{4, 4, 4, 6, 2}));
    }

    public static int meanMode(int[] arr) {
        return mean(arr) == mode(arr) ? 1 : 0;
    }

    private static int mean(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            sum += number;
        }
        return sum / arr.length;
    }

    private static int mode(int[] arr) {
        int maxCount = 0;
        int mode = 0;
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int number : arr) {
            int count = countMap.getOrDefault(number, 0) + 1;
            countMap.put(number, count);
            if (count > maxCount) {
                maxCount = count;
                mode = number;
            }
        }
        return mode;
    }

}
