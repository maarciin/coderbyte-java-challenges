package Easy;

/*
Have the function BitwiseTwo(strArr) take the array of strings stored in strArr,
which will only contain two strings of equal length that represent binary numbers,
and return a final binary string that performed the bitwise AND operation on both strings.
A bitwise AND operation places a 1 in the new string where
there is a 1 in both locations in the binary strings,
otherwise it places a 0 in that spot. For example: if strArr is ["10111", "01101"]
then your program should return the string "00101"
Examples
Input: new String[] {"100", "000"}
Output: 000
Input: new String[] {"10100", "11100"}
Output: 10100
 */
class BitwiseTwo {
    public static void main(String[] args) {
        System.out.println(bitwiseTwo(new String[]{"100", "000"}));
        System.out.println(bitwiseTwo(new String[]{"10100", "11100"}));
    }

    public static String bitwiseTwo(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr[0].length(); i++) {
            if (strArr[0].charAt(i) == '1' && strArr[1].charAt(i) == '1') {
                sb.append(1);
            } else {
                sb.append(0);
            }
        }
        return sb.toString();
    }
}
