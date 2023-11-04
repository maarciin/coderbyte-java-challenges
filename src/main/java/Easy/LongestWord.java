package Easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
Longest Word
Have the function LongestWord(sen) take the sen parameter being passed and return the longest word in the string.
If there are two or more words that are the same length, return the first word from the string with that length.
Ignore punctuation and assume sen will not be empty. Words may also contain numbers, for example "Hello world123 567"
Examples
Input: "fun&!! time"
Output: time
Input: "I love dogs"
Output: love
 */
class LongestWord {
    public static void main(String[] args) {
        String text = "fun&!! time";
        String text2 = "fun&!! time asdf234 asdf23 !@3asdfa3!@asd 32";
        String word = LongestWord(text);
        String word2 = LongestWord(text2);
        System.out.println(word);
        System.out.println(word2);
    }

    public static String LongestWord(String sen) {
        return Arrays.stream(sen.split("[^a-zA-Z0-9]+"))
                .filter(word -> !word.isEmpty())
                .max(Comparator.comparingInt(String::length))
                .orElse("");
    }
}
