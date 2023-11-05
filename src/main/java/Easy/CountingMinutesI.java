package Easy;

/*
Have the function CountingMinutesI(str) take the str parameter being passed which will be two times
(each properly formatted with a colon and am or pm) separated by a hyphen and return the total
number of minutes between the two times. The time will be in a 12 hour clock format.
For example: if str is 9:00am-10:00am then the output should be 60. If str is 1:00pm-11:00am the output should be 1320.
Examples
Input: "12:30pm-12:00am"
Output: 690
Input: "1:23am-1:08am"
Output: 1425
 */
class CountingMinutesI {
    public static void main(String[] args) {
        System.out.println(countingMinutesI("12:01am-12:02am"));
        System.out.println(countingMinutesI("12:30pm-12:00am"));
        System.out.println(countingMinutesI("1:23am-1:08am"));
    }

    private final static int MINUTES_IN_A_DAY = 24 * 60;
    private final static int MINUTES_BEFORE_MIDDAY = 12 * 60;

    public static int countingMinutesI(String str) {
        String[] periods = str.split("-");
        int result = convertToMinutes(periods[1]) - convertToMinutes(periods[0]);
        return result < 0 ? result + MINUTES_IN_A_DAY : result;
    }

    private static int convertToMinutes(String time) {
        String amPm = time.substring(time.length() - 2);
        String[] hrMin = time.substring(0, time.length() - 2).split(":");
        int hours = Integer.parseInt(hrMin[0]);
        int minutes = Integer.parseInt(hrMin[1]);
        if (amPm.equals("pm")) {
            return hours == 12 ? hours * 60 + minutes : hours * 60 + minutes + MINUTES_BEFORE_MIDDAY;
        } else {
            return hours == 12 ? minutes : hours * 60 + minutes;
        }
    }
}
