package Easy;

/*

Have the function SerialNumber(str) take the str parameter being passed and determine
if it is a valid serial number with the following constraints:

1. It needs to contain three sets each with three digits (1 through 9) separated by a period.
2. The first set of digits must add up to an even number.
3. The second set of digits must add up to an odd number.
4. The last digit in each set must be larger than the two previous digits in the same set.

If all the above constraints are met within the string, the your program should return the string true,
otherwise your program should return the string false.
For example: if str is "224.315.218" then your program should return "true".
Examples
Input: "11.124.667"
Output: false
Input: "114.568.112"
Output: true
 */
class SerialNumber {
    public static boolean serialNumber(String str) {
        if (!str.matches("[1-9]{3}\\.[1-9]{3}\\.[1-9]{3}")) {
            return false;
        }
        String[] setOfNumbers = str.split("\\.");

        for (String setOfNumber : setOfNumbers) {
            int setLength = setOfNumber.length();
            int lastDigit = Character.getNumericValue(setOfNumber.charAt(setLength - 1));
            int secondLastDigit = Character.getNumericValue(setOfNumber.charAt(setLength - 2));
            int thirdLastDigit = Character.getNumericValue(setOfNumber.charAt(setLength - 3));
            if (lastDigit <= secondLastDigit || lastDigit <= thirdLastDigit) return false;
        }

        int firstSetDigitsSum = 0;
        for (char character : setOfNumbers[0].toCharArray()) {
            firstSetDigitsSum += Character.getNumericValue(character);
        }
        int secondSetDigitsSum = 0;
        for (char character : setOfNumbers[1].toCharArray()) {
            secondSetDigitsSum += Character.getNumericValue(character);
        }

        return isNumberEven(firstSetDigitsSum) && !isNumberEven(secondSetDigitsSum);
    }

    private static boolean isNumberEven(int number) {
        return number % 2 == 0;
    }

    public static void main(String[] args) {
        System.out.println(serialNumber("4.1.1"));
    }
}
