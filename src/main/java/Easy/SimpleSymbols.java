package Easy;

/*
Have the function SimpleSymbols(str) take the str parameter being passed and determine
if it is an acceptable sequence by either returning the string true or false.
The str parameter will be composed of + and = symbols with several characters between them
(ie. ++d+===+c++==a) and for the string to be true each letter must be surrounded by a + symbol.
So the string to the left would be false. The string will not be empty and will have at least one letter.
Examples
Input: "+d+=3=+s+"
Output: true
Input: "f++d+"
Output: false
 */
class SimpleSymbols {
    public static void main(String[] args) {
        System.out.println(simpleSymbols("+d+=3=+s+"));
        System.out.println(simpleSymbols("f++d+"));
    }

    public static String simpleSymbols(String str) {
        for (int i = 0; i < str.length(); i++) {
            char currentLetter = str.charAt(i);
            if (Character.isLetter(currentLetter)) {
                if (i == 0 || i == str.length() - 1 || str.charAt(i - 1) != '+' || str.charAt(i + 1) != '+') {
                    return "false";
                }
            }
        }
        return "true";
    }

}
