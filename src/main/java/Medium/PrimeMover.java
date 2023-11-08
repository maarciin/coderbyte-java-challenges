package Medium;

import java.util.stream.IntStream;

/*
Have the function PrimeMover(num) return the numth prime number.
The range will be from 1 to 10^4. For example: if num is 16 the output should be 53 as 53 is the 16th prime number.
Examples
Input: 9
Output: 23
Input: 100
Output: 541
 */
class PrimeMover {
    public static void main(String[] args) {
        System.out.println(primeMover(9));
        System.out.println(primeMover(16));
        System.out.println(primeMover(100));
        System.out.println(primeMover(1000));
    }

    public static int primeMover(int num) {
        int nthPrime = 0;
        for (int currentNum = 2; ; currentNum++) {
            if (isPrime(currentNum)) {
                nthPrime++;
            }
            if (nthPrime == num) {
                return currentNum;
            }
        }
    }

    private static boolean isPrime(int number) {
        return IntStream.rangeClosed(2, (int) (Math.sqrt(number))).allMatch(n -> number % n != 0);
    }
}
