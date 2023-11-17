package Easy;

/*
Have the function HDistance(strArr) take the array of strings stored in strArr,
which will only contain two strings of equal length and return the number of characters
at each position that are different between them. For example: if strArr is ["house", "hours"]
then your program should return 2.
The string will always be of equal length and will only contain lowercase characters from the alphabet and numbers.
Examples
Input: new String[] {"10011", "10100"}
Output: 3
Input: new String[] {"abcdef", "defabc"}
Output: 6
 */
class HDistance {
    public static void main(String[] args) {
        System.out.println(hDistance(new String[]{"house", "hours"}));
        System.out.println(hDistance(new String[]{"10011", "10100"}));
        System.out.println(hDistance(new String[]{"abcdef", "defabc"}));
    }

    public static int hDistance(String[] strArr) {
        int counter = 0;
        for (int i = 0; i < strArr[0].length(); i++) {
            if (strArr[0].charAt(i) != strArr[1].charAt(i)) {
                counter++;
            }
        }
        return counter;
    }

}
