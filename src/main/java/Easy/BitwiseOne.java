package Easy;

/*
Have the function BitwiseOne(strArr) take the array of strings stored in strArr,
which will only contain two strings of equal length that represent binary numbers,
and return a final binary string that performed the bitwise OR operation on both strings.
A bitwise OR operation places a 0 in the new string where there are zeroes in both binary strings,
otherwise it places a 1 in that spot.
For example: if strArr is ["1001", "0100"]
then your program should return the string "1101"
Examples
Input: new String[] {"100", "000"}
Output: 100
Input: new String[] {"00011", "01010"}
Output: 01011
 */
class BitwiseOne {
    public static void main(String[] args) {
        System.out.println(bitwiseOne(new String[]{"100", "000"}));
        System.out.println(bitwiseOne(new String[]{"00011", "01010"}));
        System.out.println(bitwiseOne(new String[]{"1001", "0100"}));
    }

    public static String bitwiseOne(String[] strArr) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < strArr[0].length(); i++) {
            sb.append(strArr[0].charAt(i) == '1' || strArr[1].charAt(i) == '1' ? '1' : '0');
        }
        return sb.toString();
    }
}
