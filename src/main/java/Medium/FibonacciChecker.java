package Medium;

/*

Have the function FibonacciChecker(num) return the string yes if the number given
is part of the Fibonacci sequence. This sequence is defined by: Fn = Fn-1 + Fn-2,
which means to find Fn you add the previous two numbers up. The first two numbers are 0 and 1,
then comes 1, 2, 3, 5 etc. If num is not in the Fibonacci sequence, return the string no.
Examples
Input: 34
Output: yes
Input: 54
Output: no
 */
class FibonacciChecker {
    public static void main(String[] args) {
        System.out.println(fibonacciChecker(34));
        System.out.println(fibonacciChecker(55));
    }

    public static String fibonacciChecker(int num) {
        int a = 0;
        int b = 1;
        while (a <= num) {
            if (a == num) {
                return "yes";
            }
            int fib = a + b;
            a = b;
            b = fib;
        }
        return "no";
    }

}
