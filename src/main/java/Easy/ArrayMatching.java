package Easy;

/*
Have the function ArrayMatching(strArr) read the array of strings stored in strArr
which will contain only two elements, both of which will represent an array of positive integers.
For example: if strArr is ["[1, 2, 5, 6]", "[5, 2, 8, 11]"],
then both elements in the input represent two integer arrays,
and your goal for this challenge is to add the elements in corresponding locations from both arrays.
For the example input, your program should do the following additions: [(1 + 5), (2 + 2), (5 + 8), (6 + 11)]
which then equals [6, 4, 13, 17]. Your program should finally return this
resulting array in a string format with each element separated by a hyphen: 6-4-13-17.

If the two arrays do not have the same amount of elements,
then simply append the remaining elements onto the new array (example shown below).
Both arrays will be in the format: [e1, e2, e3, ...] where at least one element will exist in each array.
Examples
Input: new String[] {"[5, 2, 3]", "[2, 2, 3, 10, 6]"}
Output: 7-4-6-10-6
Input: new String[] {"[1, 2, 1]", "[2, 1, 5, 2]"}
Output: 3-3-6-2
 */
class ArrayMatching {
    public static void main(String[] args) {
        System.out.println(arrayMatching(new String[]{"[5, 2, 3]", "[2, 2, 3, 10, 6]"}));

    }

    public static String arrayMatching(String[] strArr) {
        String[] array1 = strArr[0].replaceAll("[^0-9,]", "").split(",");
        String[] array2 = strArr[1].replaceAll("[^0-9,]", "").split(",");
        int maxLength = Math.max(array1.length, array2.length);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < maxLength; i++) {
            int num1 = i < array1.length ? Integer.parseInt(array1[i]) : 0;
            int num2 = i < array2.length ? Integer.parseInt(array2[i]) : 0;
            sb.append(num1 + num2);
            if (i < maxLength - 1) {
                sb.append("-");
            }
        }
        return sb.toString();
    }

}
