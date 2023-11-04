package Easy;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

/*
Have the function LetterCountI(str) take the str parameter being passed and
return the first word with the greatest number of repeated letters.
For example: "Today, is the greatest day ever!" should return greatest because it has 2 e's (and 2 t's)
and it comes before ever which also has 2 e's. If there are no words with repeating letters return -1.
Words will be separated by spaces.
Examples
Input: "Hello apple pie"
Output: Hello
Input: "No words"
Output: -1
 */
class LetterCountI {
    public static void main(String[] args) {
        System.out.println(letterCountI("Today, is the greatest day ever!"));
        System.out.println(letterCountI("Hello apple pie"));
        System.out.println(letterCountI("No words"));
    }

    public static String letterCountI(String str) {
        String[] words = str.trim().split(" ");
        int maxRepeatedCharacters = 0;
        String searchedWord = "";
        for (String word : words) {
            Map<Character, Integer> charOccurrences = new HashMap<>();
            for (char character : word.toCharArray()) {
                charOccurrences.put(character, charOccurrences.getOrDefault(character, 0) + 1);
            }
            int currentMaxCharacters = charOccurrences.values()
                    .stream()
                    .max(Comparator.comparingInt(Integer::intValue))
                    .get();
            if (currentMaxCharacters > maxRepeatedCharacters) {
                maxRepeatedCharacters = currentMaxCharacters;
                searchedWord = word;
            }
        }
        return maxRepeatedCharacters == 1 ? "-1" : searchedWord;
    }
}
