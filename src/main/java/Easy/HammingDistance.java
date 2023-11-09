package Easy;

/*
Have the function HammingDistance(strArr) take the array of strings stored in strArr,
which will only contain two strings of equal length and return the Hamming distance between them.
The Hamming distance is the number of positions where the corresponding characters are different.
For example: if strArr is ["coder", "codec"] then your program should return 1. ,
The string will always be of equal length and will only contain lowercase characters from the alphabet and numbers.
Examples
Input: new String[] {"10011", "10100"}
Output: 3
Input: new String[] {"helloworld", "worldhello"}
Output: 8
 */
class HammingDistance {
    public static void main(String[] args) {
        System.out.println(hammingDistance(new String[]{"10011", "10100"}));
        System.out.println(hammingDistance(new String[]{"helloworld", "worldhello"}));
    }

    public static int hammingDistance(String[] strArr) {
        int diffChar = 0;
        for (int i = 0; i < strArr[0].length(); i++) {
            if (strArr[0].charAt(i) != strArr[1].charAt(i)) {
                diffChar++;
            }
        }
        return diffChar;
    }
}
