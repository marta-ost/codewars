/*
DESCRIPTION:
Jurassic Word is full of wonderful prehistoric creatures...eating a lot. In this kata your task is to take in a lunchtime scene of a dinosaur and their food, and decipher exactly what ate what.

Now, there isn't much mystery in what a dino might be eating. It can be one of:

String dead_dino = "_C     C}>";   // When this case is included in your return string, use "a dead dino" instead of "dead_dino"
String flowers   = "iii     iii";
String leaves    = "|||     |||";
String something = "...     ...";  // for any other food you could encounter (dots being the food, in a regexp notation, all the characters in the middle being the bitemarks)
These empty spaces in the middle of each food are reserved for the bitemarks made by a dinosaur, which will always be 5 characters long.

Unfortunately, you don't get to see the action. You have to look at the bite marks made on the leftovers, and make your judgement that way.

There are four kinds of dinosaurs in the park that you know of:

static String T_Rex = "VvvvV";  
// When this case is included in your return string, 
// use "T-Rex" instead of "T_Rex"
static String brachiosaurus = "uuuuu";
static String velociraptor = "vvvvv";
static String triceratops = "uuVuu";
Although a dinosaur will be eating one of the three available foods, some dinosaurs will only eat certain items. For example, both the brachiosaurus and the triceratops are vegetarians and would love to eat flowers, but only the brachiosaurus would be able to reach the leaves. On the other hand, the T-Rex and the velociraptor would only want to eat dead dinos. Thus, if you see their bitemarks on a food that you know they wouldn't be eating, you must be mistaken and something else is feeding...(DUN DUN DUN). This is also true for bitemarks you have never seen before!

Here are a few examples of how your program should work:

lunchTime("_CVvvvVC}>")   // => "A T-Rex is eating a dead dino."
lunchTime("_CvvvvvC}>")   // => "A velociraptor is eating a dead dino."
lunchTime("iiiuuVuuiii")  // => "A triceratops is eating flowers."
lunchTime("|||uuVuu|||")  // => "Something is eating leaves."
lunchTime("_CVvVvVC}>")   // => "Something is eating a dead dino."
NOTE: All of these strings for bitemarks and food are given to you.
*/

public class JurassicWord {

  static String T_Rex = "VvvvV";
  static String brachiosaurus = "uuuuu";
  static String velociraptor = "vvvvv";
  static String triceratops = "uuVuu";
	
  static String dead_dino = "_C     C}>";
  static String flowers = "iii     iii";
  static String leaves = "|||     |||";
  static String something = "...     ...";
  
  public static String lunchTime (String scene) {
    StringBuilder result = new StringBuilder();
    
    String dinosaur = "";
    String food = "";
    
    if (scene.substring(0, 2).equals("_C")) {
      dinosaur = scene.substring(2, 7);
      food = scene.substring(0, 2) + "     " + scene.substring(7);
    } else {
      dinosaur = scene.substring(3, 8);
      food = scene.substring(0, 3) + "     " + scene.substring(8);
    }
    
    if (dinosaur.equals(brachiosaurus) && !food.equals(dead_dino))
      result.append("A brachiosaurus");
    else if (dinosaur.equals(triceratops) && !food.equals(dead_dino) && !food.equals(leaves))
      result.append("A triceratops");
    else if (dinosaur.equals(velociraptor) && !food.equals(flowers) && !food.equals(leaves))
      result.append("A velociraptor"); 
    else if (dinosaur.equals(T_Rex) && !food.equals(flowers) && !food.equals(leaves))
      result.append("A T-Rex");
    else
      result.append("Something");
    
    result.append(" is eating ");
    
    if (food.equals(flowers))
      result.append("flowers");
    else if (food.equals(leaves))
      result.append("leaves");
    else if (food.equals(dead_dino))
      result.append("a dead dino");
    else
      result.append("something");
    
    result.append(".");
    
    return result.toString();
	}
}