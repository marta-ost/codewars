/*
DESCRIPTION:
You have read the title: you must guess a sequence. It will have something to do with the number given.

Example
x = 16
result = [1, 10, 11, 12, 13, 14, 15, 16, 2, 3, 4, 5, 6, 7, 8, 9]

Good luck!
*/

import java.util.stream.*;

class JomoPipi {
  static int[] sequence(int x) {
    return IntStream
      .rangeClosed(1, x)
      .mapToObj(String::valueOf)
      .sorted()
      .mapToInt(Integer::parseInt)
      .toArray();
  } 
}