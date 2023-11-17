package Easy;

/*
Have the function OneDecremented(str) count how many times a digit appears that is
exactly one less than the previous digit. For example: if str is "5655984" then your program
should return 2 because 5 appears directly after 6 and 8 appears directly after 9.
The input will always contain at least 1 digit.
Examples
Input: "56"
Output: 0
Input: "9876541110"
Output: 6
 */
class OneDecremented {
    public static void main(String[] args) {
        System.out.println(oneDecremented("5655984"));
        System.out.println(oneDecremented("56"));
        System.out.println(oneDecremented("9876541110"));
    }

    public static int oneDecremented(String str) {
        int counter = 0;
        for (int i = 0; i < str.length() - 1; i++) {
            if (Character.getNumericValue(str.charAt(i)) == Character.getNumericValue(str.charAt(i + 1)) + 1) {
                counter++;
            }
        }
        return counter;
    }
}
