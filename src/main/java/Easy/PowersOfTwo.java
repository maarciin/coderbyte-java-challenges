package Easy;

/*
Have the function PowersofTwo(num) take the num parameter being passed which will be an integer and return
the string true if it's a power of two. If it's not return the string false.
 For example if the input is 16 then your program should return the string true but
 if the input is 22 then the output should be the string false.
Examples
Input: 4
Output: true
Input: 124
Output: false
 */
class PowersOfTwo {
    public static String powersofTwo(int num) {
        while (num > 1) {
            if (num % 2 != 0) return "false";
            num = num / 2;
        }
        return "true";
    }

    //my first solution - conversion to binary string and then sum all the 0 and 1 in this binary number
    //if sum = 1 than it's a power of 2
//    public static String powersofTwo(int num) {
//        char[] digitsArray  = Integer.toBinaryString(num).toCharArray();
//        int sum = 0;
//        for (char digit : digitsArray) {
//            sum += Character.getNumericValue(digit);
//        }
//        return sum == 1 ? "true" : "false";
//    }

    public static void main(String[] args) {
        System.out.println(powersofTwo(4));
        System.out.println(powersofTwo(124));
    }
}
