package Easy;

/*
Have the function RemoveBrackets(str) take the str parameter being passed,
which will contain only the characters "(" and ")", and determine the minimum number of brackets
that need to be removed to create a string of correctly matched brackets.
For example: if str is "(()))" then your program should return the number 1.
The answer could potentially be 0, and there will always be at least one set of matching brackets in the string.
 */
class RemoveBrackets {
    public static void main(String[] args) {
        System.out.println(removeBrackets("(())()((("));
        System.out.println(removeBrackets("(()("));
        System.out.println(removeBrackets("(()))"));
    }

    //:D great solution found on coderbyte, very clever
    public static int removeBrackets(String str) {
        while (str.contains("()")) {
            str = str.replace("()", "");
        }
        return (str.length());
    }
}
