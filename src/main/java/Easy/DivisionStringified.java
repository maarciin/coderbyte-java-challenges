package Easy;

import java.text.NumberFormat;
import java.util.Locale;

/*
DivisionStringified(num1,num2) take both parameters being passed, divide num1 by num2,
and return the result as a string with properly formatted commas. If an answer is only 3 digits long,
return the number with no commas (ie. 2 / 3 should output "1"). For example: if num1 is 123456789 and num2 is
10000 the output should be "12,346".
Examples
Input: 5 & num2 = 2
Output: 3
Input: 6874 & num2 = 67
Output: 103
 */
class DivisionStringified {
    public static void main(String[] args) {
        System.out.println(divisionStringified(45, 50));
        System.out.println(divisionStringified(123456789, 10000));
    }

    public static String divisionStringified(int num1, int num2) {
        NumberFormat numberFormat = NumberFormat.getNumberInstance(Locale.US);
        return numberFormat.format(Math.round((double) num1 / num2));
    }

}
