package Easy;

import java.util.Set;

/*
Have the function VowelCount(str) take the str string parameter
being passed and return the number of vowels the string contains
(ie. "All cows eat grass and moo" would return 8). Do not count y as a vowel for this challenge.
Examples
Input: "hello"
Output: 2
Input: "coderbyte"
Output: 3
 */
class VowelCount {
    public static void main(String[] args) {
        System.out.println(vowelCount("All cows eat grass and moo"));
    }

    public static int vowelCount(String str) {
        return str.toLowerCase().replaceAll("[^aeiou]", "").length();
    }
}
