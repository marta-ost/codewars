/*
DESCRIPTION:
In this Kata, you will be given a string that may have mixed uppercase and lowercase letters and your task is to convert that string to either lowercase only or uppercase only based on:

make as few changes as possible.
if the string contains equal number of uppercase and lowercase letters, convert the string to lowercase.
For example:

solve("coDe") = "code". Lowercase characters > uppercase. Change only the "D" to lowercase.
solve("CODe") = "CODE". Uppercase characters > lowecase. Change only the "e" to uppercase.
solve("coDE") = "code". Upper == lowercase. Change all to lowercase.
More examples in test cases. Good luck!
*/

import java.util.Arrays;

public class Solution {
  public static String solve(final String str) {
    long lowerCaseLetters = Arrays.stream(str.split(""))
      .filter(letter -> letter.matches("[a-z]"))
      .count();
    long upperCaseLetters = str.length() - lowerCaseLetters;
    
    return lowerCaseLetters >= upperCaseLetters ? str.toLowerCase() : str.toUpperCase();
  }
}
