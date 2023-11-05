package Easy;

import java.util.Arrays;

/*
PalindromeSwapper(str) take the str parameter being passed and determine if a palindrome
can be created by swapping two adjacent characters in the string. If it is possible to create a palindrome,
then your program should return the palindrome, if not then return the string -1.
The input string will only contain alphabetic characters.
For example: if str is "rcaecar" then you can create a palindrome by swapping the second and third characters,
so your program should return the string racecar which is the final palindromic string.
Examples
Input: "anna"
Output: anna
Input: "kyaak"
Output: kayak
 */
class PalindromeSwapper {
    public static void main(String[] args) {
        System.out.println(palindromeSwapper("anna"));
        System.out.println(palindromeSwapper("kyaak"));
        System.out.println(palindromeSwapper("maadm"));

    }

    public static String palindromeSwapper(String str) {
        char[] charArray = str.toCharArray();
        for (int i = 0; i < charArray.length / 2 + 1; i++) {
            char[] swap = Arrays.copyOf(charArray, charArray.length);
            char temp = swap[i];
            swap[i] = swap[i + 1];
            swap[i + 1] = temp;
            String newString = new String(swap);
            if (newString.contentEquals(new StringBuilder(newString).reverse())) {
                return newString;
            }
        }
        return "-1";
    }

}
