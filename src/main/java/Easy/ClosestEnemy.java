package Easy;

/*
Have the function ClosestEnemy(arr) take the array of numbers stored in arr
and from the position in the array where a 1 is, return the number of spaces
either left or right you must move to reach an enemy which is represented by a 2.
For example: if arr is [0, 0, 1, 0, 0, 2, 0, 2] then your program should return 3
because the closest enemy (2) is 3 spaces away from the 1.
The array will contain any number of 0's and 2's, but only a single 1.
It may not contain any 2's at all as well, where in that case your program should return a 0.
Examples
Input: new int[] {1, 0, 0, 0, 2, 2, 2}
Output: 4
Input: new int[] {2, 0, 0, 0, 2, 2, 1, 0}
Output: 1
 */

class ClosestEnemy {
    public static void main(String[] args) {
        System.out.println(closestEnemy(new int[]{1, 0, 0, 0, 2, 2, 2}));
        System.out.println(closestEnemy(new int[]{2, 0, 0, 0, 2, 0, 1, 2}));
        System.out.println(closestEnemy(new int[]{0, 0, 1, 0, 0, 0, 0, 0}));
    }

    public static int closestEnemy(int[] arr) {
        int closestEnemy = Integer.MAX_VALUE;
        int indexOf1 = -1;
        int indexOf2 = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                indexOf1 = i;
            }
            if (arr[i] == 2) {
                indexOf2 = i;
            }
            if (indexOf1 != -1 && indexOf2 != -1) {
                closestEnemy = Math.min(closestEnemy, Math.abs(indexOf2 - indexOf1));
            }
        }
        return closestEnemy == Integer.MAX_VALUE ? 0 : closestEnemy;
    }

}
