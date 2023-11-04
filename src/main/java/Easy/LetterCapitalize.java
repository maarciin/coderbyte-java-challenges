package Easy;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
Have the function LetterCapitalize(str) take the str parameter being passed and capitalize the first letter of each word.
 Words will be separated by only one space.
Examples
Input: "hello world"
Output: Hello World
Input: "i ran there"
Output: I Ran There
 */
class LetterCapitalize {
    public static void main(String[] args) {
        System.out.println(letterCapitalize("hello world"));
        System.out.println(letterCapitalize("i ran there"));
    }

    public static String letterCapitalize(String str) {
        String[] words = str.trim().split(" ");
        return Arrays.stream(words)
                .map(word -> word.substring(0, 1).toUpperCase() + word.substring(1))
                .collect(Collectors.joining(" "));

//        StringBuilder builder = new StringBuilder();
//        for (String word : words) {
//            builder.append(Character.toUpperCase(word.charAt(0)))
//                    .append(word.substring(1))
//                    .append(" ");
//        }
//        return builder.toString().trim();
    }

}
