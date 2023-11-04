package Easy;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
Have the function AlphabetSoup(str) take the str string parameter being passed
and return the string with the letters in alphabetical order (ie. hello becomes ehllo).
Assume numbers and punctuation symbols will not be included in the string.
Examples
Input: "coderbyte"
Output: bcdeeorty
Input: "hooplah"
Output: ahhloop
 */
class AlphabetSoup {

    public static void main(String[] args) {
        System.out.println(alphabetSoup("marcin"));
    }

    public static String alphabetSoup(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }
}
