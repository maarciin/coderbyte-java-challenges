package Medium;

/*
Bracket Matcher
Have the function BracketMatcher(str) take the str parameter being passed and return 1
if the brackets are correctly matched and each one is accounted for. Otherwise return 0.
For example: if str is "(hello (world))", then the output should be 1, but if str is "((hello (world))"
the the output should be 0 because the brackets do not correctly match up. Only "(" and ")" will be used as brackets.
If str contains no brackets return 1.
Examples
Input: "(coder)(byte))"
Output: 0
Input: "(c(oder)) b(yte)"
Output: 1
 */
class BracketMatcher {
    public static void main(String[] args) {
        System.out.println(BracketMatcher("asdf)_)_)(((sa32a_)"));
        System.out.println(BracketMatcher("(coder)(byte))"));
        System.out.println(BracketMatcher("(c(oder)) b(yte)"));
        System.out.println(BracketMatcher("(()))"));
    }

    public static String BracketMatcher(String str) {
        String onlyBrackets = str.replaceAll("[^()]+", "");
        while (onlyBrackets.contains("()")) {
            onlyBrackets = onlyBrackets.replace("()", "");
        }
        return onlyBrackets.isEmpty() ? "1" : "0";
    }
}


