package Easy;

/*
Have the function ElementMerger(arr) take the array of positive integers
stored in arr and perform the following algorithm:
continuously get the difference of adjacent integers to create a new array of integers,
then do the same for the new array until a single number is left and return that number.
For example: if arr is [4, 5, 1, 2, 7] then taking the difference of each
pair of elements produces the following new array: [1, 4, 1, 5].
Then do the same for this new array to produce [3, 3, 4] -> [0, 1] -> 1.
So for this example your program should return the number 1 because that is what's left at the end.
Examples
Input: new int[] {5, 7, 16, 1, 2}
Output: 7
Input: new int[] {1, 1, 1, 2}
Output: 1
 */
class ElementMerger {
    public static void main(String[] args) {
        System.out.println(elementMerger(new int[]{5, 7, 16, 1, 2}));
        System.out.println(elementMerger(new int[]{1, 1, 1, 2}));
        System.out.println(elementMerger(new int[]{4, 5, 1, 2, 7}));
        System.out.println(elementMergerRecursion(new int[]{5, 7, 16, 1, 2}));
        System.out.println(elementMergerRecursion(new int[]{1, 1, 1, 2}));
        System.out.println(elementMergerRecursion(new int[]{4, 5, 1, 2, 7}));
    }

    public static int elementMergerRecursion(int[] arr) {
        if (arr.length == 2) {
            return Math.abs(arr[0] - arr[1]);
        }
        int[] newArray = new int[arr.length - 1];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = Math.abs(arr[i] - arr[i + 1]);
        }
        return elementMergerRecursion(newArray);
    }

    //my first solution

    public static int elementMerger(int[] arr) {
        int length = arr.length;
        while (length > 1) {
            int[] newArray = new int[arr.length - 1];
            for (int i = 0; i < newArray.length; i++) {
                newArray[i] = Math.abs(arr[i] - arr[i + 1]);
            }
            arr = newArray;
            length--;
        }
        return arr[0];
    }
}
