package Easy;

/*
Have the function DifferentCases(str) take the str parameter being passed
and return it in upper camel case format where the first letter of each word is capitalized.
The string will only contain letters and some combination of delimiter punctuation characters separating each word.

For example: if str is "Daniel LikeS-coding" then your program should return the string DanielLikesCoding.
Examples
Input: "cats AND*Dogs-are Awesome"
Output: CatsAndDogsAreAwesome
Input: "a b c d-e-f%g"
Output: ABCDEFG
 */
class DifferentCases {
    public static void main(String[] args) {
        System.out.println(differentCases("Daniel LikeS-coding"));
        System.out.println(differentCases("cats AND*Dogs-are Awesome"));
        System.out.println(differentCases("a b c d-e-f%g"));
    }

    public static String differentCases(String str) {
        String[] words = str.split("[^a-zA-Z]");
        StringBuilder sb = new StringBuilder();
        for (String word : words) {
            sb.append(word.substring(0, 1).toUpperCase())
                    .append(word.substring(1).toLowerCase());
        }
        return sb.toString();
    }
}
