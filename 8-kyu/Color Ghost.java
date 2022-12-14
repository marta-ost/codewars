/*
DESCRIPTION:
Color Ghost
Create a class Ghost

Ghost objects are instantiated without any arguments.

Ghost objects are given a random color attribute of "white" or "yellow" or "purple" or "red" when instantiated

Ghost ghost = new Ghost();
ghost.getColor(); //=> "white" or "yellow" or "purple" or "red"
*/

import java.util.Random;

public class Ghost {
  public String getColor() {
    String[] values = {"white", "yellow", "purple", "red"};
    int index = new Random().nextInt(values.length);
    return values[index];
  }
}