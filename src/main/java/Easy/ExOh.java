package Easy;

/*
Have the function ExOh(str) take the str parameter being passed and return the string true
 if there is an equal number of x's and o's, otherwise return the string false.
 Only these two letters will be entered in the string, no punctuation or numbers.
 For example: if str is "xooxxxxooxo" then the output should return false because there are 6 x's and 5 o's.
Examples
Input: "xooxxo"
Output: true
Input: "x"
Output: false
 */
class ExOh {
    public static void main(String[] args) {
        System.out.println(exOh("xooxxxxooxo"));
        System.out.println(exOh("ooxx"));
    }

    public static boolean exOh(String str) {
        return str.replace("x", "").length() == str.replace("o", "").length();
    }
}
