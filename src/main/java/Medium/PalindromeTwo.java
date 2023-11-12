package Medium;

/*
Have the function PalindromeTwo(str) take the str parameter being passed
and return the string true if the parameter is a palindrome,
(the string is the same forward as it is backward) otherwise return the string false.
The parameter entered may have punctuation and symbols but they should not affect
whether the string is in fact a palindrome.
For example: "Anne, I vote more cars race Rome-to-Vienna" should return true.
Examples
Input: "Noel - sees Leon"
Output: true
Input: "A war at Tarawa!"
Output: true
 */

class PalindromeTwo {
    public static void main(String[] args) {
        System.out.println(palindromeTwo("Anne, I vote more cars race Rome-to-Vienna"));
        System.out.println(palindromeTwo("Noel - sees Leon"));
        System.out.println(palindromeTwo("A war at Tarawa!"));
    }

    //without StringBuilder
    public static boolean palindromeTwo(String str) {
        String onlyLetters = str.toLowerCase().replaceAll("[^a-z]", "");
        for (int i = 0; i < onlyLetters.length() / 2; i++) {
            if (onlyLetters.charAt(i) != onlyLetters.charAt(onlyLetters.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
