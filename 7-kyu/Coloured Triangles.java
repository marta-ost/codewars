/*
DESCRIPTION:
If you finish this kata, you can try Insane Coloured Triangles by Bubbler, which is a much harder version of this one.

A coloured triangle is created from a row of colours, each of which is red, green or blue. Successive rows, each containing one fewer colour than the last, are generated by considering the two touching colours in the previous row. If these colours are identical, the same colour is used in the new row. If they are different, the missing colour is used in the new row. This is continued until the final row, with only a single colour, is generated.

The different possibilities are:

Colour here:        G G        B G        R G        B R
Becomes colour:      G          R          B          G
With a bigger example:

R R G B R G B B
 R B R G B R B
  G G B R G G
   G R G B G
    B B R R
     B G R
      R B
       G
You will be given the first row of the triangle as a string and its your job to return the final colour which would appear in the bottom row as a string. In the case of the example above, you would the given RRGBRGBB you should return G.

The input string will only contain the uppercase letters R, G, B and there will be at least one letter so you do not have to test for invalid input.
If you are only given one colour as the input, return that colour.
Adapted from the 2017 British Informatics Olympiad
*/

public class Kata {
  
  final static String R = "R";
  final static String G = "G";
  final static String B = "B";

  public static char triangle(final String row) {
    if (row.length() == 1) {
      return row.charAt(0);
    } else {
      return generateNewLine(row);
    }
  }

  public static char generateNewLine(String row) {
    StringBuilder newLine = new StringBuilder();
    int index1 = 0;
    int index2 = 2;
    while (index2 <= row.length()) {
      String substring = row.substring(index1, index2);
      if (substring.contains(R) && substring.contains(G)) {
        newLine.append(B);
      }
      if (substring.contains(R) && substring.contains(B)) {
        newLine.append(G);
      }
      if (substring.contains(B) && substring.contains(G)) {
        newLine.append(R);
      }
      if (substring.contains(B) && !substring.contains(G) && !substring.contains(R)) {
        newLine.append(B);
      }
      if (substring.contains(R) && !substring.contains(G) && !substring.contains(B)) {
        newLine.append(R);
      }
      if (substring.contains(G) && !substring.contains(R) && !substring.contains(B)) {
        newLine.append(G);
      }
      index1++;
      index2++;
    }
    if (newLine.length() == 1) {
      return newLine.toString().charAt(0);
    } else {
      return generateNewLine(newLine.toString());
    }
  }
}