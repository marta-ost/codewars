/*
DESCRIPTION:

Write the function resistor_parallel that receive an undefined number of resistances parallel resistors and return the total resistance.

You can assume that there will be no 0 as parameter.
Also there will be at least 2 arguments.

Formula:

total = 1 / (1/r1 + 1/r2 + .. + 1/rn)

Examples:

resistor_parallel(20, 20) will return 10.0
resistor_parallel(20, 20, 40) will return 8.0
*/

import java.util.*;

class ParallelResistors {
  public static double resistance(double... resistors) {   
    return 1 / Arrays
      .stream(resistors)
      .map(d -> 1 / d)
      .sum();
  }
}