import java.util.Arrays;
import java.util.ArrayList;
import java.util.HashMap;

public class Day2 {
  public static void main(String[] args) {
    String myName = "Matt";
    String myName2 = "Matt";

    String myName3 = new String("Matt");
    String myName4 = new String("Matt");
    System.out.println(myName3.equals(myName4));

    // Arrays

    String[] myNames = { "Matt", "Alex", "Jesse", "Oscar", "Cesar" };
    int[] numbers = new int[10];
    Object[] myPotPourri = { "Matt", 2, true };
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = i + 1;
    }
    myNames[0] = "Elizabeth";
    System.out.println(Arrays.toString(numbers));

    // Third Loop
    // for (String cookies : myNames) {
    // System.out.println(cookies);
    // }

    // ArrayLists
    ArrayList<String> stringList = new ArrayList<String>();
    stringList.add("one");
    stringList.add("two");
    stringList.add("three");

    for (int j = 0; j < stringList.size(); j++) {
      System.out.println(stringList.get(j));
    }

    // HashMaps
    HashMap<String, String> ourHobbies = new HashMap<String, String>();
    ourHobbies.put("Matthew", "Photography");
    ourHobbies.put("Oscar", "Futbol");
    ourHobbies.put("Joseph", "Gaming");
    ourHobbies.put("Jesus", "Coding");
    ourHobbies.put("Jesse", "Snowboarding");
    ourHobbies.put("Damon", "Golf");
    ourHobbies.put("Nick", "Sleep");
    ourHobbies.put("Kevin", "MERN");
    ourHobbies.put("Sal", "Taking care of the little one");
    ourHobbies.put("Platt", "Star Wars");

    for (HashMap.Entry<String, String> entry : ourHobbies.entrySet()) {
      System.out.println("Key " + entry.getKey() + " Value: " + entry.getValue());
    }

    System.out.println(maxArrayValue(numbers));
    System.out.println("Hey Damon! I have a great message for you");
  }

  public static int maxArrayValue(int[] nums) {
    int maxValue = nums[0];
    for (int i = 0; i <= nums.length; i++) {
      try {
        if (nums[i] > maxValue) {
          maxValue = nums[i];
        }
      } catch (Exception e) {
        System.out.println(e);
      }
    }
    return maxValue;
  }
}