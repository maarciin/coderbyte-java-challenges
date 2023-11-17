package Medium;

/*
Have the function WordSplit(strArr) read the array of strings stored in strArr,
which will contain 2 elements: the first element will be a sequence of characters,
and the second element will be a long string of comma-separated words, in alphabetical order,
that represents a dictionary of some arbitrary length. For example: strArr can be:
["hellocat", "apple,bat,cat,goodbye,hello,yellow,why"].
Your goal is to determine if the first element in the input can be split into two words,
where both words exist in the dictionary that is provided in the second input.
In this example, the first element can be split into two words:
hello and cat because both of those words are in the dictionary.

Your program should return the two words that exist in the dictionary separated by a comma.
So for the example above, your program should return hello,cat.
There will only be one correct way to split the first element of characters into two words.
If there is no way to split string into two words that exist in the dictionary,
return the string not possible. The first element itself will never exist in the dictionary as a real word.
Examples
Input: new String[] {"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"}
Output: base,ball
Input: new String[] {"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"}
Output: abcg,efd
 */

import java.util.HashSet;
import java.util.List;
import java.util.Set;

class WordSplit {
    public static void main(String[] args) {
        System.out.println(wordSplit(new String[]{"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"}));
        System.out.println(wordSplitHashSet(new String[]{"baseball", "a,all,b,ball,bas,base,cat,code,d,e,quit,z"}));
        System.out.println(wordSplit(new String[]{"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"}));
        System.out.println(wordSplitHashSet(new String[]{"abcgefd", "a,ab,abc,abcg,b,c,dog,e,efd,zzzz"}));
        System.out.println(wordSplit(new String[]{"hellocat", "apple,bat,cat,goodbye,hello,yellow,why"}));
        System.out.println(wordSplitHashSet(new String[]{"hellocat", "apple,bat,cat,goodbye,hello,yellow,why"}));
    }

    public static String wordSplitHashSet(String[] strArr) {
        String searchedWord = strArr[0];
        Set<String> dictionary = new HashSet<>(List.of(strArr[1].split(",")));
        for (int i = 0; i < searchedWord.length(); i++) {
            String firstPart = searchedWord.substring(0, i);
            String secondPart = searchedWord.substring(i);
            if (dictionary.contains(firstPart) && dictionary.contains(secondPart)) {
                return firstPart + "," + secondPart;
            }
        }
        return "not possible";
    }

    //my first soluton O(n^2)
    public static String wordSplit(String[] strArr) {
        String searchedWord = strArr[0];
        String[] dictionary = strArr[1].split(",");
        for (int i = 0; i < dictionary.length - 1; i++) {
            for (int j = i + 1; j < dictionary.length; j++) {
                if (dictionary[i].concat(dictionary[j]).equals(searchedWord)) {
                    return dictionary[i] + "," + dictionary[j];
                } else if (dictionary[j].concat(dictionary[i]).equals(searchedWord)) {
                    return dictionary[j] + "," + dictionary[i];
                }
            }
        }
        return "not possible";
    }
}
