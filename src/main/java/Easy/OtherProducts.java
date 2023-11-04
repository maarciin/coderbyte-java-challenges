package Easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/*
Have the function OtherProducts(arr) take the array of numbers stored in arr
and return a new list of the products of all the other numbers in the array for each element.
For example: if arr is [1, 2, 3, 4, 5] then the new array,
where each location in the new array is the product of all other elements
, is [120, 60, 40, 30, 24]. The following calculations were performed to get this answer
: [(2*3*4*5), (1*3*4*5), (1*2*4*5), (1*2*3*5), (1*2*3*4)].
You should generate this new array and then return the numbers as a string joined by a hyphen: 120-60-40-30-24.
The array will contain at most 10 elements and at least 1 element of only positive integers.
Examples
Input: new int[] {1,4,3}
Output: 12-3-4
Input: new int[] {3,1,2,6}
Output: 12-36-18-6
 */
class OtherProducts {

    public static void main(String[] args) {
        System.out.println(otherProducts(new int[]{1, 2, 3, 4, 5}));
        System.out.println(otherProducts(new int[]{1, 2, 4, 8, 16}));
    }

    public static String otherProducts(int[] arr) {
        List<String> products = new ArrayList<>();
        int productOfAll = Arrays.stream(arr).reduce(1, (a, b) -> a * b);
        for (int number : arr) {
            products.add(Integer.toString(productOfAll / number));
        }
        return String.join("-", products);
    }
}
