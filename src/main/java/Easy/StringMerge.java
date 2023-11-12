package Easy;

/*
Have the function StringMerge(str) read the str parameter being passed
which will contain a large string of alphanumeric characters with
a single asterisk character splitting the string evenly into two separate strings.
Your goal is to return a new string by pairing up the characters in the corresponding locations in both strings.
For example: if str is "abc1*kyoo" then your program should
return the string akbyco1o because a pairs with k,
b pairs with y, etc. The string will always split evenly with the asterisk in the center.
Examples
Input: "aaa*bbb"
Output: ababab
Input: "123hg*aaabb"
Output: 1a2a3ahbgb
 */
class StringMerge {
    public static void main(String[] args) {
        System.out.println(stringMerge("123hg*aaabb"));
        System.out.println(stringMerge("abc1*kyoo"));
    }

    public static String stringMerge(String str) {
        String[] split = str.split("\\*");
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < split[0].length(); i++) {
            sb.append(split[0].charAt(i)).append(split[1].charAt(i));
        }
        return sb.toString();
    }

}
