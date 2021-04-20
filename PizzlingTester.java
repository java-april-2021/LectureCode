import java.util.ArrayList;
import java.util.Arrays;

public class PizzlingTester {
  // Entry Point Method
  public static void main(String[] args) {
    Puzzaling pz = new Puzzaling();
    String[] names = { "Nancy", "Jiinich", "Fujibayashi", "Momochi", "Ishikawa" };

    names[0] = "Jesus";
    System.out.println(Arrays.toString(names));
    ArrayList<Integer> number2s = new ArrayList<Integer>();
    number2s.add(1);
    number2s.add(2);
    number2s.add(3);
    number2s.add(4);
    number2s.add(5);
    number2s.add(6);

    System.out.println(pz.namesLongerThanFive());
  }
}