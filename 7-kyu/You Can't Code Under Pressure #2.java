/*
DESCRIPTION:
Code as fast as you can!

You need to make a constructor function with two methods (and only these two methods) to return and increment a counter, but the counter should not be directly accessible from outside the function.
*/

class Counter {
  private long counter;
 
  public long check() {
    return counter;
  }

  public void increment() {
    counter++;
  }
}