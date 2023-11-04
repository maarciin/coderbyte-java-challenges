package Easy;

import java.util.*;

/*
Have the function FindIntersection(strArr) read the array of strings stored in strArr which will contain 2 elements:
 the first element will represent a list of comma-separated numbers sorted in ascending order,
 the second element will represent a second list of comma-separated numbers (also sorted).
 Your goal is to return a comma-separated string containing the numbers that occur in elements of strArr in sorted order.
 If there is no intersection, return the string false.
Examples
Input: new String[] {"1, 3, 4, 7, 13", "1, 2, 4, 13, 15"}
Output: 1,4,13
Input: new String[] {"1, 3, 9, 10, 17, 18", "1, 4, 9, 10"}
Output: 1,9,10
 */
class FindIntersection {
    public static void main(String[] args) {
        // keep this function call here
        String[] s1 = new String[]{"1, 5, 6, 7, 10, 11, 12", "5, 6, 8, 11, 17"};
//        String intersection = findIntersection(s1);
//        System.out.println(intersection);

    }

    //new String[] {"1, 3, 4, 7, 13",
    //              "1, 2, 4, 13, 15"}
    public static String findIntersection(String[] strArr) {
        String[] firstArray = strArr[0].split(", ");
        String[] secondArray = strArr[1].split(", ");
        List<String> resultList = new ArrayList<>();
        Set<String> matchSet = new HashSet<>(Arrays.asList(firstArray));
        for (String element : secondArray) {
            if (!matchSet.add(element)) {
                resultList.add(element);
            }
        }
        if (resultList.isEmpty()) {
            return "false";
        } else {
            return String.join(",", resultList);
        }
    }
}
