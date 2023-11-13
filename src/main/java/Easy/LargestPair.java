package Easy;

/*
Have the function LargestPair(num) take the num parameter being passed
and determine the largest double digit number within the whole number.
For example: if num is 4759472 then your program should return 94 because
that is the largest double digit number.
The input will always contain at least two positive digits.
Examples
Input: 453857
Output: 85
Input: 363223311
Output: 63
 */
class LargestPair {
    public static void main(String[] args) {
        System.out.println(largestPair(4759472));
        System.out.println(largestPair(453857));
        System.out.println(largestPair(363223311));
    }

    public static int largestPair(int num) {
        String stringNum = Integer.toString(num);
        int largestPair = Integer.parseInt(stringNum.substring(0, 2));
        for (int i = 1; i < stringNum.length() - 2; i++) {
            largestPair = Math.max(largestPair, Integer.parseInt(stringNum.substring(i, i + 2)));
        }
        return largestPair;
    }

}
