package Easy;

/*
Product Digits
Have the function ProductDigits(num) take the num parameter being passed which will be a positive integer,
and determine the least amount of digits you need to multiply to produce it.
For example: if num is 24 then you can multiply 8 by 3 which produces 24,
so your program should return 2 because there is a total of only 2 digits that are needed.
Another example: if num is 90, you can multiply 10 * 9,
so in this case your program should output 3 because you cannot reach 90 without using a total of 3 digits in your multiplication.
Examples
Input: 6
Output: 2
Input: 23
Output: 3
 */
class ProductDigits {
    public static void main(String[] args) {
        System.out.println(productDigits(127));
        System.out.println(productDigits(9));
    }

    public static int productDigits(int num) {
        int minProductDigits = Integer.MAX_VALUE;
        for (int i = 1; i <= (int) Math.sqrt(num); i++) {
            if (num % i == 0) {
                int currentProductDigits = String.valueOf(i).length() + String.valueOf(num / i).length();
                minProductDigits = Math.min(currentProductDigits, minProductDigits);
            }
        }
        return minProductDigits;
    }

}
