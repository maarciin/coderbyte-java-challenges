package Easy;

/*
Have the function TimeConvert(num) take the num parameter being passed
and return the number of hours and minutes the parameter converts to (ie. if num = 63 then the output should be 1:3).
Separate the number of hours and minutes with a colon.
Examples
Input: 126
Output: 2:6
Input: 45
Output: 0:45
 */
class TimeConvert {
    public static void main(String[] args) {
        System.out.println(timeConvert(63));
        System.out.println(timeConvert(45));
    }

    public static String timeConvert(int num) {
        int hoursPart = num / 60;
        int minutesPart = num % 60;
        return hoursPart + ":" + minutesPart;
    }
}
