package Easy;

/*
Have the function CheckNums(num1,num2)
take both parameters being passed and return the string true if num2 is greater than num1,
otherwise return the string false. If the parameter values are equal to each other then return the string -1.
Examples
Input: 3 & num2 = 122
Output: true
Input: 67 & num2 = 67
Output: -1
 */
class CheckNums {
    public static String CheckNums(int num1, int num2) {
        return num2 > num1 ? "true" : num2 == num1 ? "-1" : "false";
    }

    public static void main(String[] args) {
        System.out.println(CheckNums(3, 122));
        System.out.println(CheckNums(67, 67));
        System.out.println(CheckNums(67, 6));
    }
}
