package Easy;

/*
Letter Changes
Have the function LetterChanges(str) take the str parameter being passed and modify it using the following algorithm.
 Replace every letter in the string with the letter following it in the alphabet (ie. c becomes d, z becomes a).
 Then capitalize every vowel in this new string (a, e, i, o, u) and finally return this modified string.
Examples
Input: "hello*3"
Output: Ifmmp*3
Input: "fun times!"
Output: gvO Ujnft!
 */
class LetterChanges {
    public static void main(String[] args) {
        System.out.println(LetterChanges("hello*3"));
        System.out.println(LetterChanges("fun timeZ"));
    }

    public static String LetterChanges(String str) {
        StringBuilder sb = new StringBuilder();
        String lowerVowels = "aoeui";
        for (char character : str.toCharArray()) {
            if (character == 'z' || character == 'Z') {
                character -= 25;
            } else if (Character.isAlphabetic(character)) {
                character++;
            }
            if (lowerVowels.indexOf(character) != -1) {
                character = Character.toUpperCase(character);
            }
            sb.append(character);
        }
        return sb.toString();
    }
}
