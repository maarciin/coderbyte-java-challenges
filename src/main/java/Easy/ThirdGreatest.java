package Easy;

import java.util.Arrays;

/*
Have the function ThirdGreatest(strArr) take the array of strings stored in strArr
and return the third largest word within it. So for example:
if strArr is ["hello", "world", "before", "all"]
your output should be world because "before" is 6 letters long,
and "hello" and "world" are both 5, but the output should be world
because it appeared as the last 5 letter word in the array. If strArr was ["hello", "world", "after", "all"]
the output should be after because the first three words are all 5 letters long, so return the last one.
The array will have at least three strings and each string will only contain letters.
Examples
Input: new String[] {"coder","byte","code"}
Output: code
Input: new String[] {"abc","defg","z","hijk"}
Output: abc
 */
class ThirdGreatest {
    public static void main(String[] args) {
        System.out.println(thirdGreatest(new String[]{"abc", "defg", "z", "hijk"}));
        System.out.println(thirdGreatest(new String[]{"coder", "byte", "code"}));
        System.out.println(thirdGreatest(new String[]{"hello", "world", "before", "all"}));
    }

    public static String thirdGreatest(String[] strArr) {
        Arrays.sort(strArr, (s1, s2) -> Integer.compare(s2.length(), s1.length()));
        return strArr[2];
    }
}
