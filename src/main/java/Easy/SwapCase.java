package Easy;

import java.util.Arrays;

/*
Have the function SwapCase(str) take the str parameter and swap the case of each character.
For example: if str is "Hello World" the output should be hELLO wORLD. Let numbers and symbols stay the way they are.
Examples
Input: "Hello-LOL"
Output: hELLO-lol
Input: "Sup DUDE!!?"
Output: sUP dude!!?
 */
class SwapCase {
    public static String SwapCase(String str) {
        StringBuilder builder = new StringBuilder();
        for (char character : str.toCharArray()) {
            if (Character.isLowerCase(character)) {
                character = Character.toUpperCase(character);
            } else if (Character.isUpperCase(character)) {
                character = Character.toLowerCase(character);
            }
            builder.append(character);
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        System.out.println(SwapCase("Hello-LOL"));
    }
}
