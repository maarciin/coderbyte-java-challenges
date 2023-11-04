package Easy;

import java.util.*;
import java.util.stream.Collectors;

/*
Have the function TwoSum(arr) take the array of integers stored in arr,
and determine if any two numbers (excluding the first element) in the array can sum up to the first element in the array.
 For example: if arr is [7, 3, 5, 2, -4, 8, 11],
 then there are actually two pairs that sum to the number 7: [5, 2] and [-4, 11].
 Your program should return all pairs, with the numbers separated by a comma,
 in the order the first number appears in the array. Pairs should be separated by a space.
 So for the example above, your program would return: 5,2 -4,11

If there are no two numbers that sum to the first element in the array, return -1
Examples
Input: new int[] {17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7}
Output: 6,11 10,7 15,2
Input: new int[] {7, 6, 4, 1, 7, -2, 3, 12}
Output: 6,1 4,3
 */
class TwoSum {

    public static void main(String[] args) {
        int[] array = {17, 4, 5, 6, 10, 11, 4, -3, -5, 3, 15, 2, 7};
        String result = TwoSum(array);
        System.out.println(result);

    }

    public static String TwoSum(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        Set<Integer> resultSet = new TreeSet<>();
        int target = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (map.containsKey(target - arr[i])) {
                resultSet.add(map.get(target - arr[i]));
            }
            map.put(arr[i], i);
        }

        if (resultSet.isEmpty()) {
            return "-1";
        } else {
            return resultSet.stream()
                    .map(i -> "%s,%s".formatted(arr[i], target - arr[i]))
                    .collect(Collectors.joining(" "));

//            StringBuilder sb = new StringBuilder();
//            for (Integer result : resultSet) {
//                sb.append(arr[result])
//                        .append(",")
//                        .append(target - arr[result])
//                        .append(" ");
//            }
//            sb.deleteCharAt(sb.length() - 1);
//            return sb.toString();
        }

    }

    //{1,2,3,4,5,6,7,10}, target = 15
    //brute force
//    public static int[] twoSumWithTarget(int[] nums, int target) {
//        for (int i = 0; i < nums.length - 1; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    return new int[]{i, j};
//                }
//            }
//        }
//        throw new RuntimeException("Not found");
//    }
//
//    //hashmap solution
    //{1,2,3,4,5,6,7,10}, target = 15
//    public static int[] twoSumWithHashMap(int[] nums, int target) {
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            map.put(nums[i], i);
//            if (map.containsKey(target - nums[i])) {
//                return new int[]{map.get(target - nums[i]), i};
//            }
//
//        }
//        return new int[]{-1, -1};
//    }
}
