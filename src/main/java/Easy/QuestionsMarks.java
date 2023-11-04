package Easy;

/*
Have the function QuestionsMarks(str) take the str string parameter,
 which will contain single digit numbers, letters, and question marks,
 and check if there are exactly 3 question marks between every pair of two numbers that add up to 10.
  If so, then your program should return the string true, otherwise it should return the string false.
  If there aren't any two numbers that add up to 10 in the string, then your program should return false as well.

For example: if str is "arrb6???4xxbl5???eee5" then your program should return true because there are exactly
3 question marks between 6 and 4, and 3 question marks between 5 and 5 at the end of the string.
Examples
Input: "aa6?9"
Output: false
Input: "acc?7??sss?3rr1??????5"
Output: true
 */
class QuestionsMarks {
    public static void main(String[] args) {
        System.out.println(questionsMarks("acc?1??sss?3rr2???5"));
    }

    public static boolean questionsMarks(String str) {
        int num1 = -1;
        int num2;
        int count = 0;
        boolean foundPair = false;

        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                int num = Character.getNumericValue(c);
                if (num1 == -1) {
                    num1 = num;
                    count = 0;
                } else {
                    num2 = num;
                    if (num1 + num2 == 10) {
                        if (count != 3) {
                            return false;
                        }
                        foundPair = true;
                    }
                    num1 = num2;
                    count = 0;
                }
            } else if (c == '?') {
                count++;
            }
        }

        return foundPair;
    }
}
