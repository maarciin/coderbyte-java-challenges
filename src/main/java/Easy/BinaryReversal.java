package Easy;

/*
Have the function BinaryReversal(str) take the str parameter being passed,
which will be a positive integer, take its binary representation
(padded to the nearest N * 8 bits), reverse that string of bits,
and then finally return the new reversed string in decimal form.
For example: if str is "47" then the binary version of this integer is 101111
but we pad it to be 00101111. Your program should reverse this binary string which then becomes:
11110100 and then finally return the decimal version of this string, which is 244.
Examples
Input: "213"
Output: 171
Input: "4567"
Output: 60296
 */
class BinaryReversal {
    public static void main(String[] args) {
        System.out.println(binaryReversal("47"));
        System.out.println(binaryReversal("213"));
        System.out.println(binaryReversal("4567"));
    }

    public static int binaryReversal(String str) {
        int decimalNumber = Integer.parseInt(str);
        StringBuilder reversedBinaryNumber = new StringBuilder(Integer.toBinaryString(decimalNumber)).reverse();
        if (reversedBinaryNumber.length() % 8 != 0) {
            reversedBinaryNumber.append("0".repeat(8 - reversedBinaryNumber.length() % 8));
        }
        return Integer.parseInt(reversedBinaryNumber.toString(), 2);
    }
}
