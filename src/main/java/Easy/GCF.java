package Easy;

/*
Have the function GCF(arr) take the array of numbers stored in arr
which will always contain only two positive integers,
and return the greatest common factor of them.
For example: if arr is [45, 12] then your program should return 3.
There will always be two elements in the array and they will be positive integers.
Examples
Input: new int[] {1, 6}
Output: 1
Input: new int[] {12, 28}
Output: 4
 */
class GCF {
    public static void main(String[] args) {
        System.out.println(GCF(new int[]{12, 28}));
        System.out.println(GCF(new int[]{1, 6}));
        System.out.println(GCF(new int[]{45, 12}));
    }

    public static int GCF(int[] arr) {
        while (arr[1] != 0) {
            int temp = arr[1];
            arr[1] = arr[0] % arr[1];
            arr[0] = temp;
        }
        return arr[0];
    }

}
