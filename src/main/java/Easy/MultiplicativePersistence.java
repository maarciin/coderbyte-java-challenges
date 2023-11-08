package Easy;

/*
Have the function MultiplicativePersistence(num) take the num parameter being passed
which will always be a positive integer and return its multiplicative persistence
which is the number of times you must multiply the digits in num until you reach a single digit.
For example: if num is 39 then your program should return 3
because 3 * 9 = 27 then 2 * 7 = 14 and finally 1 * 4 = 4 and you stop at 4.
Examples
Input: 4
Output: 0
Input: 25
Output: 2
 */
class MultiplicativePersistence {
    public static void main(String[] args) {
        System.out.println(multiplicativePersistence(4));
        System.out.println(multiplicativePersistence(25));
    }

    public static int multiplicativePersistence(int num) {
        return num < 10 ? 0 : 1 + multiplicativePersistence(getMultipliedDigits(num));
    }

    private static int getMultipliedDigits(int number) {
        int result = 1;
        while (number > 1) {
            result *= number % 10;
            number /= 10;
        }
        return result;
    }
}
