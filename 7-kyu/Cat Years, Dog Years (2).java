/*
DESCRIPTION:
This is related to my other Kata about cats and dogs.

Kata Task
I have a cat and a dog which I got as kitten / puppy.

I forget when that was, but I do know their current ages as catYears and dogYears.

Find how long I have owned each of my pets and return as a list [ownedCat, ownedDog]

NOTES:

Results are truncated whole numbers of "human" years

Cat Years

15 cat years for first year
+9 cat years for second year
+4 cat years for each year after that

Dog Years

15 dog years for first year
+9 dog years for second year
+5 dog years for each year after that

References

http://www.catster.com/cats-101/calculate-cat-age-in-cat-years
http://www.slate.com/articles/news_and_politics/explainer/2009/05/a_dogs_life.html
*/

public class Dinglemouse {
  public static int[] ownedCatAndDog(final int catYears, final int dogYears) {
    final int FIRST_YEAR = 15;
    final int SECOND_YEAR = 9;
    final int CAT_NEXT_YEARS = 4;
    final int DOG_NEXT_YEARS = 5;
     
    int ownedCat = 
      catYears < FIRST_YEAR ? 0 :
      catYears < FIRST_YEAR + SECOND_YEAR ? 1 :
      2 + (catYears - FIRST_YEAR - SECOND_YEAR) / CAT_NEXT_YEARS;
    
    int ownedDog = 
      dogYears < FIRST_YEAR ? 0 :
      dogYears < FIRST_YEAR + SECOND_YEAR ? 1 :
      2 + (dogYears - FIRST_YEAR - SECOND_YEAR) / DOG_NEXT_YEARS;
    
    return new int[]{ownedCat, ownedDog};
  }
}