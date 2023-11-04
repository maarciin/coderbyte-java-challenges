package Easy;

import java.util.HashSet;

/*
Have the function HappyNumbers(num) determine if a number is Happy,
which is a number whose sum of the square of the digits eventually converges to 1.
 Return true if it's a Happy number, otherwise return false.

For example: the number 10 is Happy because 1^2 + 0^2 converges to 1.
Examples
Input: 1
Output: true
Input: 101
Output: false
 */
class HappyNumber {
    public static boolean HappyNumbers(int num) {
        HashSet<Integer> seen = new HashSet<>();
        while (num != 1 && !seen.contains(num)) {
            seen.add(num);
            int squaredDigitsSum = 0;
            while (num > 0) {
                int digit = num % 10;
                squaredDigitsSum += digit * digit;
                num /= 10;
            }
            num = squaredDigitsSum;
        }
        return num == 1;
    }

    public static void main(String[] args) {
        System.out.println(HappyNumbers(10));
        System.out.println(HappyNumbers(19));
        System.out.println(HappyNumbers(7));
    }
}
