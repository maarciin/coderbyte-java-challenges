package Easy;

import java.util.HashSet;
import java.util.Set;

/*
Have the function AlphabetSearching(str) take the str parameter being passed
and return the string true if every single letter of the English alphabet exists in the string,
otherwise return the string false. For example: if str is "zacxyjbbkfgtbhdaielqrm45pnsowtuv"
then your program should return the string true because every character in the alphabet
exists in this string even though some characters appear more than once.
Examples
Input: "abcdefghijklmnopqrstuvwxyyyy"
Output: false
Input: "abc123456kmo"
Output: false
 */
class AlphabetSearching {
    public static void main(String[] args) {
        System.out.println(alphabetSearching("zacxyjbbkfgtbhdaielqrm45pnsowtuv"));
        System.out.println(alphabetSearching("abcdefghijklmnopqrstuvwxyyyy"));
        System.out.println(alphabetSearching("abc123456kmo"));
    }

    public static boolean alphabetSearching(String str) {
        char[] charArray = str.toLowerCase().toCharArray();
        Set<Character> letters = new HashSet<>();
        for (char character : charArray) {
            if (Character.isLetter(character)) {
                letters.add(character);
            }
        }
        return letters.size() == 26;
    }
}
