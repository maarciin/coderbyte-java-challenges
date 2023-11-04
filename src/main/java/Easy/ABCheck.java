package Easy;

/*
Have the function ABCheck(str) take the str parameter being passed and return the string true if the characters
a and b are separated by exactly 3 places anywhere in the string at least once
(ie. "lane borrowed" would result in true because there is exactly three characters between a and b).
Otherwise return the string false.
Examples
Input: "after badly"
Output: false
Input: "Laura sobs"
Output: true
 */
class ABCheck {
    public static boolean ABCheck(String str) {
        return str.toLowerCase().matches(".*a.{3}?b.*") || str.toLowerCase().matches(".*b.{3}?a.*");
    }

    public static void main(String[] args) {
        System.out.println(ABCheck("after badly"));
        System.out.println(ABCheck("Laura sobs"));
    }
}
