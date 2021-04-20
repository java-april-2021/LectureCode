import java.util.Collections;
import java.util.Random;
import java.util.ArrayList;

public class Puzzaling {
  /*
   * Create an array with the following values: Nancy, Jinichi, Fujibayashi,
   * Momochi, Ishikawa. Shuffle the array and print the name of each person. Have
   * the method also return an array with names that are longer than 5 characters.
   */

  public ArrayList<String> namesLongerThanFive() {
    String[] names = { "Nancy", "Jiinich", "Fujibayashi", "Momochi", "Ishikawa" };
    ArrayList<String> namesLongerThanFive = new ArrayList<String>();
    Random r = new Random();
    for (int i = 0; i < names.length / 2; i++) {
      String temp = names[i];
      int randomIndex = r.nextInt(names.length - i) + i;
      names[i] = names[randomIndex];
      names[randomIndex] = temp;
    }

    for (int j = 0; j < names.length; j++) {
      if (names[j].length() >= 5) {
        namesLongerThanFive.add(names[j]);
      }
    }
    return namesLongerThanFive;

  }

}