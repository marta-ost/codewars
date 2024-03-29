/*
DESCRIPTION:
#Matrix Addition of Elements

As the name suggests you just have to add all the elements of the matrix and output a single Integer.

Matrix can be of any size, not necessarily a square matrix.
Matrix can have negative elements as well.
Method should take an input 2-Dimentional Array.
Constraints

1 <= rows, columns < 20

-100 <= elements <= 100

Example

SumOfElements({{1,0},{0,1}}) should return 2.
SumOfElements({{7,9},{3,6}}) should return 25.
*/

import java.util.Arrays;

public class Sid {
    public static int sumOfElements(int matrix[][]) {
      return Arrays
        .stream(matrix)
        .flatMapToInt(Arrays::stream)
        .sum();
    }    
}