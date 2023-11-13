package Easy;

import java.util.HashSet;
import java.util.Set;

/*
Have the function DistinctCharacters(str) take the str parameter being passed
and determine if it contains at least 10 distinct characters, if so,
then your program should return the string true, otherwise it should return the string false.
For example: if str is "abc123kkmmmm?" then your program should return the string false because
this string contains only 9 distinct characters: a, b, c, 1, 2, 3, k, m, ? adds up to 9.
Examples
Input: "12334bbmma:=6"
Output: true
Input: "eeeemmmmmmmmm1000"
Output: false
 */
class DistinctCharacters {
    public static void main(String[] args) {
        System.out.println(distinctCharacters("12334bbmma:=6"));
        System.out.println(distinctCharacters("abc123kkmmmm?"));
        System.out.println(distinctCharacters("eeeemmmmmmmmm1000?"));
    }

    public static boolean distinctCharacters(String str) {
        Set<Character> charSet = new HashSet<>();
        for (char character : str.toCharArray()) {
            charSet.add(character);
        }
        return charSet.size() >= 10;
    }
}
