package Easy;

/*
Have the function StringPeriods(str) take the str parameter being passed and determine if there is some substring K
 that can be repeated N > 1 times to produce the input string exactly as it appears.
 Your program should return the longest substring K, and if there is none it should return the string -1.

For example: if str is "abcababcababcab" then your program should return abcab
because that is the longest substring that is repeated 3 times to create the final string.
Another example: if str is "abababababab" then your program should return ababab because it is the longest substring.
If the input string contains only a single character, your program should return the string -1.
Examples
Input: "abcxabc"
Output: -1
Input: "affedaaffed"
Output: -1
 */
class StringPeriods {

    public static void main(String[] args) {
        System.out.println(StringPeriods("abcababcababcab"));
        System.out.println(StringPeriods("abcxabc"));
        System.out.println(StringPeriods("gg"));
    }

    public static String StringPeriods(String str) {
        int originalStringLength = str.length();
        if (originalStringLength == 1) {
            return "-1";
        }
        for (int substringLength = originalStringLength / 2; substringLength >= 1; substringLength--) {
            String subString = str.substring(0, substringLength);
            int repetitions = originalStringLength / substringLength;
            if (subString.repeat(repetitions).equals(str)) {
                return subString;
            }
        }
        return "-1";
    }
}
