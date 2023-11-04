package Easy;

/*
Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it.
For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24.
For the test cases, the range will be between 1 and 18 and the input will always be an integer.
 */
class FirstFactorial {
    //recursive
    public static int firstFactorialResursive(int num) {
        if (num <= 2) return num;
        else {
            return firstFactorialResursive(num - 1) * num;
        }
    }

    public static int firstFactorialNonRecursive(int num) {
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        int factorial1 = firstFactorialResursive(18);
        int factorial2 = firstFactorialNonRecursive(18);
        System.out.println(factorial1);
        System.out.println(factorial2);
    }
}
