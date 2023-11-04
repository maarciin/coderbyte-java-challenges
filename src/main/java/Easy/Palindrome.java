package Easy;

import java.util.Arrays;
import java.util.stream.Stream;

/*
Have the function Palindrome(str) take the str parameter being passed
and return the string true if the parameter is a palindrome, (the string is the same forward as it is backward)
otherwise return the string false. For example: "racecar" is also "racecar" backwards.
Punctuation and numbers will not be part of the string.
 */
class Palindrome {

    public static void main(String[] args) {
        System.out.println(palindrome("siema"));
        System.out.println(palindrome("never odd or even"));
    }

    public static boolean palindrome(String str) {
        char[] charArray = str.trim().replace(" ", "").toCharArray();
        for (int i = 0; i < charArray.length / 2; i++) {
            if (charArray[i] != charArray[charArray.length - i - 1]) {
                return false;
            }
        }
        return true;
    }

}
