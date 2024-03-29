/*
DESCRIPTION:
Create a method that returns the center of a 2-dim array.

It should return null if there is no single center element.

You can assume all inputs will be rectangular matricies in array form. ex: [[1, 2, 3], [4, 5, 6], [7, 8, 9]]
*/

public class Kata {
  public static Integer center(int[][] matrix) {
    return matrix.length == 0 || matrix[0].length % 2 == 0 || matrix.length % 2 == 0 ? null 
      : matrix[matrix.length / 2][matrix[0].length / 2];
  }
}