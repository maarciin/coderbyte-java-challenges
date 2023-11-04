package Easy;

/*
Have the function NonrepeatingCharacter(str) take the str parameter being passed,
which will contain only alphabetic characters and spaces, and return the first non-repeating character.
For example: if str is "agettkgaeee" then your program should return k.
The string will always contain at least one character and there will always be at least one non-repeating character.
Examples
Input: "abcdef"
Output: a
Input: "hello world hi hey"
Output: w
 */

import java.util.LinkedHashMap;
import java.util.Map;

class NonrepeatingCharacter {
    public static void main(String[] args) {
        System.out.println(nonrepeatingCharacter("hello world hi hey"));
    }

    public static Character nonrepeatingCharacter(String str) {
        Map<Character, Integer> charCount = new LinkedHashMap<>();
        for (char c : str.toCharArray()) {
            charCount.put(c, charCount.getOrDefault(c, 0) + 1);
        }
        return charCount.entrySet().stream()
                .filter(entry -> entry.getValue() == 1)
                .findFirst()
                .map(Map.Entry::getKey)
                .orElseThrow();
    }
}
