package Medium;

import java.util.HashMap;
import java.util.Map;

/*
Have the function StringScramble(str1,str2) take both parameters being passed and
return the string true if a portion of str1 characters can be rearranged to match str2,
otherwise return the string false. For example: if str1 is "rkqodlw" and str2 is "world"
the output should return true. Punctuation and symbols will not be entered with the parameters.
Examples
Input: "cdore" & str2 = "coder"
Output: true
Input: "h3llko" & str2 = "hello"
Output: false
 */
class StringScramble {
    public static void main(String[] args) {
        System.out.println(stringScramble("rkqodlw", "world"));
        System.out.println(stringScramble("cdore", "coder"));
        System.out.println(stringScramble("h3llko", "hello"));
    }

    public static boolean stringScramble(String str1, String str2) {
        // Create a map to store the frequency of characters in str2
        Map<Character, Integer> chars = new HashMap<>();
        for (char character : str2.toCharArray()) {
            chars.put(character, chars.getOrDefault(character, 0) + 1);
        }
        // Check characters in str1 against the frequency map
        for (char character : str1.toCharArray()) {
            if (chars.containsKey(character)) {
                // Decrement the count and remove if count becomes zero
                chars.put(character, chars.get(character) - 1);
                if (chars.get(character) == 0) {
                    chars.remove(character);
                }
            }

        }
        // Return true if the map is empty (all characters in str2 accounted for in str1)
        return chars.isEmpty();
    }

}
