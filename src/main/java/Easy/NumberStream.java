package Easy;

/*
Have the function NumberStream(str) take the str parameter being passed which will contain the numbers 2 through 9
, and determine if there is a consecutive stream of digits of at least N length where N is the actual digit value.
If so, return the string true, otherwise return the string false.
 For example: if str is "6539923335" then your program should return the string true because
 there is a consecutive stream of 3's of length 3. The input string will always contain at least one digit.
Examples
Input: "5556293383563665"
Output: false
Input: "5788888888882339999"
Output: true
 */
class NumberStream {
    public static boolean numberStream(String str) {
        char[] charArray = str.toCharArray();
        int counter = 1;
        char candidate = charArray[0];
        for (int i = 1; i < charArray.length; i++) {
            if (candidate == charArray[i]) {
                counter++;
            } else {
                candidate = charArray[i];
                counter = 1;
            }
            if (counter == Character.getNumericValue(candidate)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(numberStream("6539923335"));
        System.out.println(numberStream("2344456789"));
    }
}
