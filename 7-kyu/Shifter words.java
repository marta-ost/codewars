/*
DESCRIPTION:
You probably know that some characters written on a piece of paper, after turning this sheet 180 degrees, can be read, although sometimes in a different way. So, uppercase letters "H", "I", "N", "O", "S", "X", "Z" after rotation are not changed, the letter "M" becomes a "W", and Vice versa, the letter "W" becomes a "M".

We will call a word "shifter" if it consists only of letters "H", "I", "N", "O", "S", "X", "Z", "M" and "W". After turning the sheet, this word can also be read, although in a different way. So, the word "WOW "turns into the word "MOM". On the other hand, the word "HOME" is not a shifter.

Find the number of unique shifter words in the input string (without duplicates). All shifters to be counted, even if they are paired (like "MOM" and "WOW"). String contains only uppercase letters.

Examples
Shifter.count("SOS IN THE HOME") == 2 // shifter words are "SOS" and "IN"
Shifter.count("WHO IS SHIFTER AND WHO IS NO") == 3 // shifter words are "WHO", "IS", "NO"
Shifter.count("TASK") == 0 // no shifter words
Shifter.count("") == 0 // no shifter words in empty string
*/

import java.util.Arrays;

public class Shifter {
  public static int count(String st) {
    return (int) Arrays
      .stream(st.split(" "))
      .distinct()
      .filter(word -> word.matches("[HIMNOSWXZ]+"))
      .count();
  }
}