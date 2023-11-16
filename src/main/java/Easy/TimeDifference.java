package Easy;

import java.util.Arrays;

/*
Have the function TimeDifference(strArr) read the array of strings stored in
strArr which will be an unsorted list of times in a twelve-hour format like so:
HH:MM(am/pm). Your goal is to determine the smallest difference in minutes between
two of the times in the list. For example: if strArr is ["2:10pm", "1:30pm", "10:30am", "4:42pm"]
then your program should return 40 because the smallest difference is between 1:30pm and 2:10pm
with a difference of 40 minutes.
The input array will always contain at least two elements and all of the elements will be in the correct format and unique.
Examples
Input: new String[] {"1:10pm", "4:40am", "5:00pm"}
Output: 230
Input: new String[] {"10:00am", "11:45pm", "5:00am", "12:01am"}
Output: 16
 */
class TimeDifference {
    public static void main(String[] args) {
        System.out.println(timeDifference(new String[]{"2:10pm", "1:30pm", "10:30am", "4:42pm"}));
        System.out.println(timeDifference(new String[]{"1:10pm", "4:40am", "5:00pm"}));
        System.out.println(timeDifference(new String[]{"10:00am", "11:45pm", "5:00am", "12:01am"}));
    }

    public static int timeDifference(String[] strArr) {
        int[] minutesArray = new int[strArr.length];
        for (int i = 0; i < minutesArray.length; i++) {
            minutesArray[i] = convertTimeToMinutes(strArr[i]);
        }
        Arrays.sort(minutesArray);
        int minDifference = Integer.MAX_VALUE;
        for (int i = 0; i < minutesArray.length - 1; i++) {
            minDifference = Math.min(minDifference, minutesArray[i + 1] - minutesArray[i]);
        }
        return minDifference;
    }

    private static int convertTimeToMinutes(String time) {
        String amPm = time.substring(time.length() - 2);
        int totalMinutes = 0;
        if (amPm.equals("pm") && !time.startsWith("12")) {
            totalMinutes += 12 * 60;
        }
        String[] hoursMinutes = time.substring(0, time.length() - 2).split(":");
        int hours = Integer.parseInt(hoursMinutes[0]);
        int minutes = Integer.parseInt(hoursMinutes[1]);
        if (hours != 12) {
            totalMinutes += hours * 60;
        }
        totalMinutes += minutes;
        return amPm.equals("pm") ? totalMinutes - 24 * 60 : totalMinutes;
    }
}
