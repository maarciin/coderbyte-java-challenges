package Easy;

/*
Have the function NumberReverse(str) take the str parameter being passed which will be a string of numbers,
and return a new string with the numbers in reverse order.
Examples
Input: "1 2 3"
Output: 3 2 1
Input: "10 20 50"
Output: 50 20 10
 */
class NumberReverse {
    public static void main(String[] args) {
        System.out.println(numberReverse("1 2 3"));
        System.out.println(numberReverse("23 23 23 566 76"));
    }

    public static String numberReverse(String str) {
        String[] numbers = str.split(" ");
        int numLength = numbers.length;
        for (int i = 0; i < numLength / 2; i++) {
            String temp = numbers[i];
            numbers[i] = numbers[numLength - i - 1];
            numbers[numLength - i - 1] = temp;
        }
        return String.join(" ", numbers);
    }

}
