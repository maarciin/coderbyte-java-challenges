package Easy;

import java.util.Arrays;

/*
Have the function NumberAddition(str) take the str parameter, search for all the numbers in the string, add them together,
 then return that final number. For example: if str is "88Hello 3World!" the output should be 91.
 You will have to differentiate between single digit numbers and multiple digit numbers like in the example above.
So "55Hello" and "5Hello 5" should return two different answers. Each string will contain at least one letter or symbol.
 */
class NumberAddition {
    public static void main(String[] args) {
        System.out.println(numberAddition("T1wo Ho33uses"));
        System.out.println(numberAddition("10 2One Number*1*"));
    }

    public static Integer numberAddition(String str) {
        return Arrays
                .stream(str.split("[^0-9]+"))
                .filter(s -> !s.isEmpty())
                .map(Integer::parseInt)
                .reduce(0, Integer::sum);
    }

}
