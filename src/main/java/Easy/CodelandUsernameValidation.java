package Easy;

/*
Have the function CodelandUsernameValidation(str)
take the str parameter being passed and determine if the string is a valid username according to the following rules:

1. The username is between 4 and 25 characters.
2. It must start with a letter.
3. It can only contain letters, numbers, and the underscore character.
4. It cannot end with an underscore character.

If the username is valid then your program should return the string true, otherwise return the string false.
 */
class CodelandUsernameValidation {
    public static String codelandUsernameValidation(String str) {
        return String.valueOf((isBetween4and25Characters(str) && startsWithALetter(str)
                && containsOnlyLettersNumbersAndUnderscore(str)
                && notEndsWithUnderscore(str)));

    }

    private static boolean notEndsWithUnderscore(String str) {
        return !(str.charAt(str.length() - 1) == '_');
    }

    private static boolean containsOnlyLettersNumbersAndUnderscore(String str) {
        return str.matches("^[a-zA-Z0-9_]*$");
    }

    private static boolean startsWithALetter(String str) {
        return Character.isLetter(str.charAt(0));
    }

    private static boolean isBetween4and25Characters(String str) {
        return str.length() >= 4 && str.length() <= 25;
    }

    public static void main(String[] args) {
        String testString1 = "aa_";
        String testString2 = "u__hello_world123";
        System.out.println(codelandUsernameValidation(testString1));
        System.out.println(codelandUsernameValidation(testString2));
    }
}
