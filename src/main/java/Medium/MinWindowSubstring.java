package Medium;

import java.util.HashMap;
import java.util.Map;

/*
Min Window Substring
Have the function MinWindowSubstring(strArr) take the array of strings stored in strArr,
which will contain only two strings,
the first parameter being the string N and the second parameter being a string K of some characters,
 and your goal is to determine the smallest substring of N that contains all the characters in K.
 For example: if strArr is ["aaabaaddae", "aed"] then the smallest substring of N that contains the characters a, e,
  and d is "dae" located at the end of the string. So for this example your program should return the string dae.

Another example: if strArr is ["aabdccdbcacd", "aad"] then the smallest substring of N
that contains all of the characters in K is "aabd" which is located at the beginning of the string.
Both parameters will be strings ranging in length from 1 to 50 characters and all of K's characters will exist
somewhere in the string N. Both strings will only contains lowercase alphabetic characters.
Examples
Input: new String[] {"ahffaksfajeeubsne", "jefaa"}
Output: aksfaje
Input: new String[] {"aaffhkksemckelloe", "fhea"}
Output: affhkkse
 */
class MinWindowSubstring {
    public static void main(String[] args) {
        System.out.println(minWindowSubstring(new String[]{"abcabcabcdaaaaad", "ddb"}));
        System.out.println(minWindowSubstring(new String[]{"aaaaaaaaa", "a"}));
    }

    //brute force O(n^3) solution with comments
    public static String minWindowSubstring(String[] strArr) {
        String searchString = strArr[0];
        String pattern = strArr[1];

        int searchStringLength = searchString.length();

        // It contains the min length seen so far
        int minWindowLengthSeenSoFar = Integer.MAX_VALUE;

        // It contains the minimum length substring
        String minWindow = "";

        // The nested for loop help us generate all the substrings
        for (int left = 0; left < searchStringLength; left++) {
            for (int right = left; right < searchStringLength; right++) {

                //Generete substring
                String currentWindow = searchString.substring(left, right + 1);

                //Check if the generated substring contains all the characters of pattern
                boolean windowContainsAllCharsFromPattern = stringContainsAllCharsFromPattern(currentWindow, pattern);

                // If it is a valid substring
                // And the length is less than the minimum so far
                // Update the minWindow
                if (windowContainsAllCharsFromPattern && currentWindow.length() < minWindowLengthSeenSoFar) {
                    minWindowLengthSeenSoFar = currentWindow.length();
                    minWindow = currentWindow;
                }
            }
        }
        return minWindow;

    }

    // Helper function to check if all the char of string are
    // Present in the string searchString
    private static boolean stringContainsAllCharsFromPattern(String text, String pattern) {
        // Hash Map for storing the character frequency
        Map<Character, Integer> requiredCharacters = new HashMap<>();

        // Store the frequency of all the characters of pattern string
        for (char character : pattern.toCharArray()) {
            int occurrencesOfCharacter = requiredCharacters.getOrDefault(character, 0);
            requiredCharacters.put(character, occurrencesOfCharacter + 1);
        }

        // Traverse the text
        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);
            if (requiredCharacters.containsKey(currentChar)) {

                // Calculate what the new occurrence count will be
                int newOccurrenceCount = requiredCharacters.get(currentChar) - 1;

                /*
                 * If we have satisfied all of the characters for this character, remove the key
                 * from the hashtable.
                 *
                 * Otherwise, just update the mapping with 1 less occurrence to satisfy for
                 */
                if (newOccurrenceCount == 0) {
                    requiredCharacters.remove(currentChar);
                } else {
                    requiredCharacters.put(currentChar, newOccurrenceCount);
                }
            }
        }
        // If we satisfied all characters the the required characters hashtable will be empty
        return requiredCharacters.isEmpty();
    }

}
