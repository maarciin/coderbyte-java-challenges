package Easy;

/*
Have the function AdditivePersistence(num) take the num parameter being passed
which will always be a positive integer and return its additive persistence which
is the number of times you must add the digits in num until you reach a single digit.
For example: if num is 2718 then your program should return 2
because 2 + 7 + 1 + 8 = 18 and 1 + 8 = 9 and you stop at 9.
Examples
Input: 4
Output: 0
Input: 19
Output: 2
 */
class AdditivePersistence {
    public static void main(String[] args) {
        System.out.println(additivePersistence(19));
        System.out.println(additivePersistenceRecursive(12));
    }

    public static int additivePersistence(int num) {
        int counter = 0;
        while (num > 9) {
            num = getDigitsSum(num);
            counter++;
        }
        return counter;
    }

    //using recursion
    public static int additivePersistenceRecursive(int num) {
        return num < 10 ? 0 : 1 + additivePersistence(getDigitsSum(num));
    }

    private static int getDigitsSum(int num) {
        int sumDigits = 0;
        while (num > 0) {
            sumDigits += num % 10;
            num /= 10;
        }
        return sumDigits;
    }
}
