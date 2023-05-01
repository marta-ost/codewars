/*
DESCRIPTION:
Task
Write a method, that replaces every nth char oldValue with char newValue.

Inputs
text: the string to modify
n: change the target letter every nth occurrencies
old_value (or similar): the targetted character
new_value (or similar): the character to use as replacement

Note for untyped languages: all inputs are always valid and of their expected type.

Rules
Your method has to be case sensitive!
If n is 0 or negative or if it is larger than the count of the oldValue, return the original text without a change.

Example:
n:         2
old_value: 'a'
new_value: 'o'
"Vader said: No, I am your father!"
  1     2          3        4       -> 2nd and 4th occurence are replaced
"Vader soid: No, I am your fother!"

As you can see in the example: The first changed is the 2nd 'a'. So the start is always at the nth suitable char and not at the first!
*/

public class Kata {
  public static String replaceNth(String text, int n, char oldValue, char newValue) {
    if (n <= 0)
      return text;
    
    StringBuilder replaced = new StringBuilder();
    int occurence = 0;
    
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == oldValue)
        occurence++;
      if (text.charAt(i) == oldValue && occurence % n == 0)
        replaced.append(newValue);
      else
        replaced.append(text.charAt(i));
    }
    
    return replaced.toString();
  }
}