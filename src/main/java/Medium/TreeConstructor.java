package Medium;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/*
Have the function TreeConstructor(strArr) take the array of strings stored in strArr,
which will contain pairs of integers in the following format: (i1,i2), where i1 represents a child node in a tree
and the second integer i2 signifies that it is the parent of i1. For example: if strArr is ["(1,2)", "(2,4)", "(7,2)"],
then this forms the following tree:
      4
     /
    2
   / \
  1   7
which you can see forms a proper binary tree.
Your program should, in this case, return the string true because a valid binary tree can be formed.
If a proper binary tree cannot be formed with the integer pairs, then return the string false.
All of the integers within the tree will be unique, which means there can only be one node in the tree with the given integer value.
Examples
Input: new String[] {"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}
Output: true
Input: new String[] {"(1,2)", "(3,2)", "(2,12)", "(5,2)"}
Output: false
 */
class TreeConstructor {
    public static void main(String[] args) {
        System.out.println(treeConstructor(new String[]{"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)", "(3,8)"}));
        System.out.println(treeConstructor(new String[]{"(1,2)", "(2,4)", "(5,7)", "(7,2)", "(9,5)"}));
        System.out.println(treeConstructor(new String[]{"(1,2)", "(3,2)", "(2,12)", "(5,2)"}));
    }

    public static boolean treeConstructor(String[] strArr) {
        Set<String> children = new HashSet<>();
        Map<String, Integer> parents = new HashMap<>();
        for (String pair : strArr) {
            String[] values = pair.replaceAll("[^0-9,]", "").split(",");
            children.add(values[0]);
            int parentCount = parents.getOrDefault(values[1], 0);
            //every parent can have at most two children
            if (parentCount + 1 > 2) {
                return false;
            } else {
                parents.put(values[1], ++parentCount);
            }
        }
        //every child node can have one parent
        //if the children size is less than the length of the input array -> the same child has more than one parent
        return children.size() == strArr.length;
    }

}
