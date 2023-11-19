package Medium;

import java.util.Stack;

/*
Have the function MultipleBrackets(str) take the str parameter being passed and return 1
#ofBrackets if the brackets are correctly matched and each one is accounted for.
Otherwise return 0. For example: if str is "(hello [world])(!)",
then the output should be 1 3 because all the brackets are matched and there are 3 pairs of brackets,
but if str is "((hello [world])" the the output should be 0 because the brackets do not correctly match up.
Only "(", ")", "[", and "]" will be used as brackets. If str contains no brackets return 1.
Examples
Input: "(coder)[byte)]"
Output: 0
Input: "(c([od]er)) b(yt[e])"
Output: 1 5
 */
class MultipleBrackets {
    public static void main(String[] args) {
        System.out.println(multipleBrackets("(hello [world])(!)"));
        System.out.println(multipleBrackets("(coder)[byte)]"));
        System.out.println(multipleBrackets("(c([od]er)) b(yt[e])"));
        System.out.println(multipleBracketsWithStack("(c([od]er)) b(yt[e])"));
    }

    public static String multipleBrackets(String str) {
        String newString = str.replaceAll("[^\\[\\]()]", "");
        String onlyBrackets = newString;
        while (onlyBrackets.contains("()") || onlyBrackets.contains("[]")) {
            onlyBrackets = onlyBrackets.replace("()", "");
            onlyBrackets = onlyBrackets.replace("[]", "");
        }
        return onlyBrackets.isEmpty() ? "1 " + (newString.length() / 2) : "0";

    }

    public static String multipleBracketsWithStack(String str) {
        int bracketsCounter = 0;
        char[] characters = str.toCharArray();
        Stack<Character> stack = new Stack<>();
        for (char character : characters) {
            if (character == '(' || character == '[') {
                stack.push(character);
            } else if (character == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    bracketsCounter++;
                    stack.pop();
                } else {
                    return "0";
                }
            } else if (character == ']') {
                if (!stack.isEmpty() && stack.peek() == '[') {
                    bracketsCounter++;
                    stack.pop();
                } else {
                    return "0";
                }
            }
        }
        return stack.isEmpty() ? "1 " + bracketsCounter : "0";
    }
}
