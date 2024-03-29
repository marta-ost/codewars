/*
DESCRIPTION:
The aim of this kata is to split a given string into different strings of equal size (note size of strings is passed to the method)

Example:

Split the below string into other strings of size #3

'supercalifragilisticexpialidocious'

Will return a new string
'sup erc ali fra gil ist ice xpi ali doc iou s'
Assumptions:

String length is always greater than 0
String has no spaces
Size is always positive
*/

import java.util.stream.*;

public class InParts {
  public static String splitInParts(String s, int partLength) {
    return IntStream.range(0, s.length())
      .mapToObj(i -> i % partLength == 0 ? " " + s.charAt(i) : "" + s.charAt(i))
      .collect(Collectors.joining())
      .trim();
  }
}