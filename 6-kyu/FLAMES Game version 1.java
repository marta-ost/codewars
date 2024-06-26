/*
DESCRIPTION:
FLAMES game is a method to find out the status of a love relationship. Entering two names will give you the outcome of a relationship between them.

To get the outcome,
First, cross out all letters the names have in common.
Second, remove the cross out letter on both names.
Third, get the count of the characters that are left.
Fourth, given the word FLAMES, with each letter, starting from the left, count up to the number you got in the previous step and return to the F on the left with each pass.
Finally, the letter you land on has a word that it stands for in the acronym 'flames'.

    F = Friendship
    L = Love
    A = Affection
    M = Marriage
    E = Enemies
    S = Siblings

Now, write a method, showRelationship() that takes two names, one male and one female, and that would return the relationship between them.

Example of FLAMES Game Given names are NEIL and MAE, respectively.

E is common on NEIL and MAE.
Removing E from NEIL and MAE, will left NIL and MA on both names, respectively
NIL have 3 characters and MA have 2 characters, a total of 5 characters
FLAMES --> 1>F 2>L 3>A 4>M 5>E
E stands for "Enemies"

NEIL and MAE are enemies
*/

import java.util.*;
import java.util.stream.*;

public class Flames {
  static final String[] FLAMES = {"Friendship", "Love", "Affection", "Marriage", "Enemies", "Siblings"};
	
  public static String showRelationship(String male, String female) {
    int notCommonCharactersCount = removeCommonLettersFromFirstName(male, female).length() + removeCommonLettersFromFirstName(female, male).length();
    return FLAMES[(notCommonCharactersCount - 1) % FLAMES.length];
  }
  
  private static String removeCommonLettersFromFirstName(String first, String second) {
    return Arrays
      .stream(first.split(""))
      .filter(letter -> !second.contains(letter))
      .collect(Collectors.joining(""));
  }
}