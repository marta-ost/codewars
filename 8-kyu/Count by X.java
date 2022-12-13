/*
DESCRIPTION:
Create a function with two arguments that will return an array of the first n multiples of x.

Assume both the given number and the number of times to count will be positive numbers greater than 0.

Return the results as an array or list ( depending on language ).

Examples
countBy(1,10)  // should return  {1,2,3,4,5,6,7,8,9,10}
countBy(2,5)  // should return {2,4,6,8,10}
*/

import static java.util.stream.IntStream.rangeClosed;

public class Kata {
  public static int[] countBy(int x, int n) {
    return rangeClosed(1, n)
      .map(e -> e * x)
      .toArray();
  }
}