package Easy;

import java.util.Arrays;

/*
Have the function CamelCase(str) take the str parameter being passed and return it in
 proper camel case format where the first letter of each word is capitalized (excluding the first letter).
 The string will only contain letters and some combination of delimiter punctuation characters separating each word.

For example: if str is "BOB loves-coding" then your program should return the string bobLovesCoding.
Examples
Input: "cats AND*Dogs-are Awesome"
Output: catsAndDogsAreAwesome
Input: "a b c d-e-f%g"
Output: aBCDEFG
 */
class CamelCase {

    public static void main(String[] args) {
        System.out.println(camelCase("Siema asdf234 asdf!@31 asf2134"));
        System.out.println(camelCase("ats AND*Dogs-are Awesome"));
    }

    public static String camelCase(String str) {
        String[] words = str.toLowerCase().split("[^a-zA-Z]+");
        StringBuilder sb = new StringBuilder(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            String upperCaseFirstLetter = words[i].substring(0, 1).toUpperCase();
            String lowerCaseRestOfWord = words[i].substring(1);
            sb.append(upperCaseFirstLetter);
            sb.append(lowerCaseRestOfWord);
        }
        return sb.toString();
    }

}
