package Easy;

/*
Have the function SimpleEvens(num) check whether every single number
in the passed in parameter is even.
If so, return the string true, otherwise return the string false.
For example: if num is 4602225 your program should return the string false because 5 is not an even number.
Examples
Input: 2222220222
Output: true
Input: 20864646452
Output: false
 */
class SimpleEvens {
    public static void main(String[] args) {
        System.out.println(simpleEvens(9));
        System.out.println(simpleEvens(222222022));
    }

    public static boolean simpleEvens(int num) {
        while (num > 0) {
            if (num % 2 == 1) {
                return false;
            }
            num /= 10;
        }
        return true;
    }
}
