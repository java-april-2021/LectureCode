public class FirstProgram {
  // Entry Point Method
  public static void main(String[] args) {
    System.out.println("Java April 2021 Rocks!");

    byte myByte = 100; // Stroes whole numbers from -128 to 127
    short myShort = 1000; // Stores whole numbers from -32768 to 32767
    int myInt = 100000; // Stores whole numbers from -2,147,484,648 to 2,147483,647
    long myLong = 1000000000; // Stores whole numbers from -9,223,372,036,854,775,808 to
                              // 9,223,372,036,854,775,807
    float myFloat = 3.14f; // Stores fractional numbers sufficient for storting 6 to 7 decimal digits
    double myDouble = 3.13432434234; // Stores fractional numbers. sufficient for storing up to 15 decimal digits
    boolean myBool = true; // stores true or false values
    char myChar = 'x'; // stores a single character/letter or ASCII values

    // Default To Null
    Integer myInteger = 100000;
    Character myCharacter = 'd';

    String myString = "Java April 2021";

    String bootcamp = "Java";
    String bootCamp = "April";
    String bootCAMP = "2021";
    System.out.println(bootcamp + bootCamp + bootCAMP);

    // Operators And Conditionals
    int myFirstInt = 1;
    int mySecondInt = 1;

    int isOdd = 5;
    if (isOdd % 2 != 0) {
      System.out.println("Number is odd");
    } else if (isOdd % 3 != 0) {
      System.out.println("Number is not odd");
    } else {
      System.out.println("Time To Have fun");
    }

    int i = 0;
    // Loops
    while (i < 4) {
      System.out.println(i);
      i++;
    }

    for (int j = 0; j < 4; j++) {
      System.out.println(j);
    }

    System.out.println(sayHello("Oscar"));
    myCountingApp();
  }

  public static String sayHello(String name) {
    return "Hello! " + name;
  }

  public static void myCountingApp() {
    for (int i = 0; i < 50; i++) {
      System.out.println(i);
    }
  }
}