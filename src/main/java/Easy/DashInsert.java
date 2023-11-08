package Easy;

/*
Have the function DashInsert(str) insert dashes ('-') between each two odd numbers in str.
For example: if str is 454793 the output should be 4547-9-3. Don't count zero as an odd number.
Examples
Input: 99946
Output: 9-9-946
Input: 56730
Output: 567-30
 */
class DashInsert {
    public static void main(String[] args) {
        System.out.println(dashInsert("56730"));
        System.out.println(dashInsert("99946"));
    }

    public static String dashInsert(String str) {
        StringBuilder sb = new StringBuilder().append(str.charAt(0));
        for (int i = 1; i < str.length(); i++) {
            if (Character.getNumericValue(str.charAt(i - 1)) % 2 == 1 && Character.getNumericValue(str.charAt(i)) % 2 == 1) {
                sb.append('-');
            }
            sb.append(str.charAt(i));
        }
        return sb.toString();
    }
}
