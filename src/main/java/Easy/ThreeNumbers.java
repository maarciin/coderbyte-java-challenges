package Easy;

import java.util.HashSet;
import java.util.Set;

/*
Have the function ThreeNumbers(str) take the str parameter being passed
and determine if exactly three unique, single-digit integers occur within each word in the string.
The integers can appear anywhere in the word, but they cannot be all adjacent to each other.
If every word contains exactly 3 unique integers somewhere within it,
then return the string true, otherwise return the string false.
For example: if str is "2hell6o3 wor6l7d2" then your program should return "true"
but if the string is "hell268o w6or2l4d" then your program should return "false"
because all the integers are adjacent to each other in the first word.
Examples
Input: "2a3b5 w1o2rl3d g1gg92"
Output: true
Input: "21aa3a ggg4g4g6ggg"
Output: false
 */
class ThreeNumbers {
    public static void main(String[] args) {
        System.out.println(threeNumbers("2a3b5 w1o2rl3d g1gg92"));
        System.out.println(threeNumbers("21aa3a ggg4g4g6ggg"));
        System.out.println(threeNumbers("2hell6o3 wor6l7d2"));
        System.out.println(threeNumbers("hell268o w6or2l4d"));
    }

    public static boolean threeNumbers(String str) {
        String[] words = str.split(" ");
        Set<Integer> numbersSet;
        for (String word : words) {
            numbersSet = new HashSet<>();
            String numbersWithAsterisks = word.replaceAll("[^0-9]", "*").replaceAll("[*]+", "*");
            numbersWithAsterisks = numbersWithAsterisks.charAt(0) == '*' ? numbersWithAsterisks.substring(1) : numbersWithAsterisks;
            String[] numbers = numbersWithAsterisks.split("[*]");
            if (numbers.length > 3 || numbers.length < 2) {
                return false;
            }
            for (String stringNumber : numbers) {
                int number = Integer.parseInt(stringNumber);
                if (number >= 100 || number % 11 == 0) {
                    return false;
                }
                if (number >= 10) {
                    numbersSet.add(number % 10);
                    numbersSet.add(number / 10);
                } else {
                    numbersSet.add(number);
                }
            }
            if (numbersSet.size() != 3) {
                return false;
            }
        }

        return true;
    }

}
