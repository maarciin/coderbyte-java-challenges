package Easy;

/*
Have the function Superincreasing(arr) take the array of numbers stored in arr and determine
if the array forms a superincreasing sequence where each element in the array is greater
than the sum of all previous elements. The array will only consist of positive integers.
For example: if arr is [1, 3, 6, 13, 54] then your program should return the string "true"
because it forms a superincreasing sequence. If a superincreasing sequence isn't formed,
then your program should return the string "false"
Examples
Input: new int[] {1,2,3,4}
Output: false
Input: new int[] {1,2,5,10}
Output: true
 */
class Superincreasing {
    public static void main(String[] args) {
        System.out.println(superincreasing(new int[]{1, 3, 6, 13, 54}));
        System.out.println(superincreasing(new int[]{1, 2, 3, 4}));
        System.out.println(superincreasing(new int[]{1, 2, 5, 10}));
    }

    public static boolean superincreasing(int[] arr) {
        int sum = 0;
        for (int number : arr) {
            if (number <= sum) {
                return false;
            }
            sum += number;
        }
        return true;
    }
}
