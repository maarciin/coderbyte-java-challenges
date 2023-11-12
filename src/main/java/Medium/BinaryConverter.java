package Medium;

/*
Have the function BinaryConverter(str) return the decimal form of the binary value.
For example: if 101 is passed return 5, or if 1000 is passed return 8.
Examples
Input: "100101"
Output: 37
Input: "011"
Output: 3
 */
class BinaryConverter {
    public static void main(String[] args) {
        System.out.println(binaryConverter("100101"));
        System.out.println(binaryConverter("011"));
    }

    public static int binaryConverter(String str) {
        return Integer.parseInt(str, 2);
    }
}
