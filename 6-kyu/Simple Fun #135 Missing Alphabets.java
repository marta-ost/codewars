/*
DESCRIPTION:

Task

Given string s, which contains only letters from a to z in lowercase.

A set of alphabet is given by abcdefghijklmnopqrstuvwxyz.

2 sets of alphabets mean 2 or more alphabets.

Your task is to find the missing letter(s). You may need to output them by the order a-z. It is possible that there is more than one missing letter from more than one set of alphabet.

If the string contains all of the letters in the alphabet, return an empty string ""

Example

For s='abcdefghijklmnopqrstuvwxy'

The result should be 'z'

For s='aabbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyy'

The result should be 'zz'

For s='abbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxy'

The result should be 'ayzz'

For s='codewars'

The result should be 'bfghijklmnpqtuvxyz'

Input/Output

[input] string s

Given string(s) contains one or more set of alphabets in lowercase.

[output] a string

Find the letters contained in each alphabet but not in the string(s). Output them by the order a-z. If missing alphabet is repeated, please repeat them like "bbccdd", not "bcdbcd"
*/

import java.util.*;
import java.util.stream.*;
import java.util.function.*;

class MissingAlphabets {
  static String find(final String text) {
    final String ALPHABET = "abcdefghijklmnopqrstuvwxyz";
    
    Map<String, Integer> lettersWithCounts = Arrays
      .stream(text.split(""))
      .collect(Collectors.groupingBy(Function.identity(),
                                    Collectors.summingInt(e -> 1)));
    
    int alphabetSets = lettersWithCounts
      .values()
      .stream()
      .max((v1, v2) -> v1.compareTo(v2))
      .map(Integer::valueOf)
      .get();
    
    return Arrays
      .stream(ALPHABET.split(""))
      .map(letter -> !lettersWithCounts.containsKey(letter) ? letter.repeat(alphabetSets)
                     : letter.repeat(alphabetSets - lettersWithCounts.get(letter)))
      .collect(Collectors.joining(""));
  }
}