package Easy;

/*
Have the function ArithGeo(arr) take the array of numbers stored in arr and return the string "Arithmetic"
if the sequence follows an arithmetic pattern or return "Geometric" if it follows a geometric pattern.
If the sequence doesn't follow either pattern return -1.
An arithmetic sequence is one where the difference between each of the numbers is consistent,
where as in a geometric sequence, each term after the first is multiplied by some constant or common ratio.
Arithmetic example: [2, 4, 6, 8] and Geometric example: [2, 6, 18, 54]. Negative numbers may be entered as parameters,
0 will not be entered, and no array will contain all the same elements.
Examples
Input: new int[] {5,10,15}
Output: Arithmetic
Input: new int[] {2,4,16,24}
Output: -1
 */
class ArithGeo {
    public static String arithGeo(int[] arr) {
        boolean arithmetic = true;
        boolean geometric = true;
        for (int i = 1; i < arr.length - 1; i++) {
            if (arithmetic && 2 * arr[i] != arr[i - 1] + arr[i + 1]) {
                arithmetic = false;
            }
            if (geometric && arr[i] * arr[i] != arr[i - 1] * arr[i + 1]) {
                geometric = false;
            }
        }
        return arithmetic ? "Arithmetic" : geometric ? "Geometric" : "-1";

    }

    public static void main(String[] args) {
        System.out.println(arithGeo(new int[]{5, 10, 15}));
        System.out.println(arithGeo(new int[]{2, 4, 16, 24}));
        System.out.println(arithGeo(new int[]{2, 4, 8, 16, 32, 64, 128}));
    }
}
