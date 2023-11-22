package Medium;

import java.util.Arrays;

/*
Have the function SymmetricTree(strArr) take the array of strings stored in strArr,
which will represent a binary tree, and determine if the tree is symmetric (a mirror image of itself).
The array will be implemented similar to how a binary heap is implemented,
except the tree may not be complete and NULL nodes on any level of the tree will be represented with a #.
For example: if strArr is ["1", "2", "2", "3", "#", "#", "3"] then this tree looks like the following:

    1
   / \
  2   2
 / \ / \
3  # #  3
For the input above, your program should return the string true because the binary tree is symmetric.
Examples
Input: new String[] {"4", "3", "4"}
Output: false
Input: new String[] {"10", "2", "2", "#", "1", "1", "#"}
Output: true
 */
class SymmetricTree {
    public static void main(String[] args) {
        System.out.println(symmetricTree(new String[]{"1", "2", "2", "3", "#", "#", "3"}));
        System.out.println(symmetricTree(new String[]{"4", "3", "4"}));
        System.out.println(symmetricTree(new String[]{"10", "2", "2", "#", "1", "1", "#"}));

    }

    public static boolean symmetricTree(String[] strArr) {
        //first level of tree is irrelevant
        String[] tree = Arrays.copyOfRange(strArr, 1, strArr.length);
        int pow = 1;
        while (tree.length > 0) {
            //each level of binary tree has 2^level elements (level from 0)
            int num = (int) Math.pow(2, pow++);

            //get the current level nodes
            String[] level = Arrays.copyOfRange(tree, 0, num);
            for (int i = 0; i < num / 2; i++) {
                //compare the nodes in the first half to the second, if not equal return false
                if (!level[i].equals(level[num - i - 1])) {
                    return false;
                }
            }
            //remove the nodes just processed
            tree = Arrays.copyOfRange(tree, num, tree.length);
        }
        return true;
    }
}
