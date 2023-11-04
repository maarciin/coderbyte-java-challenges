package Easy;

import java.util.Map;
import java.util.TreeMap;

/*
Have the function GroupTotals(strArr) read in the strArr parameter containing key:
value pairs where the key is a string and the value is an integer.
Your program should return a string with new key:
value pairs separated by a comma such that each key appears only once with the total values summed up.

For example: if strArr is ["B:-1", "A:1", "B:3", "A:5"] then your program should return the string A:6,B:2.

Your final output string should return the keys in alphabetical order.
Exclude keys that have a value of 0 after being summed up.
Examples
Input: new String[] {"X:-1", "Y:1", "X:-4", "B:3", "X:5"}
Output: B:3,Y:1
Input: new String[] {"Z:0", "A:-1"}
Output: A:-1
 */
class GroupTotals {

    public static void main(String[] args) {
        System.out.println(groupTotals(new String[]{"1:1", "2:1", "2:1", "10:3", "10:7"}));
    }

    public static String groupTotals(String[] strArr) {
        Map<String, Integer> occurrencesMap = new TreeMap<>();
        for (String s : strArr) {
            String[] split = s.split(":");
            String key = split[0];
            int occurrences = Integer.parseInt(split[1]);
            occurrencesMap.put(key, occurrencesMap.getOrDefault(key, 0) + occurrences);
            if (occurrencesMap.get(key) == 0) {
                occurrencesMap.remove(key);
            }
        }
        return occurrencesMap.toString().replaceAll("[{} ]", "").replaceAll("=", ":");
    }

    //my initial solution :

//    public static String groupTotals(String[] strArr) {
//        Map<String, Integer> occurrencesMap = new TreeMap<>();
//        for (String string : strArr) {
//            String[] split = string.split(":");
//            String character = split[0];
//            int occurrences = Integer.parseInt(split[1]);
//            occurrencesMap.put(character, occurrencesMap.getOrDefault(character, 0) + occurrences);
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (Map.Entry<String, Integer> stringIntegerEntry : occurrencesMap.entrySet()) {
//            if(stringIntegerEntry.getValue() != 0) {
//                sb.append(stringIntegerEntry.getKey())
//                        .append(":").append(stringIntegerEntry.getValue().toString()).append(",");
//            }
//
//        }
//
//        return sb.substring(0, sb.length() -1);
//    }

}
