import java.util.Scanner;

public class FizzBuzz {
  public String fizzBuzz(int number) {
    if (number % 5 == 0 && number % 3 == 0) {
      return "FizzBuzz";
    } else if (number % 5 == 0) {
      return "Fizz";
    } else if (number % 3 == 0) {
      return "Buzz!";
    } else {
      return Integer.toString(number);
    }
  }

  public void addNum() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter In a Number to Add");
    int int1 = sc.nextInt();
    System.out.println("Enter In Another Number");
    int int2 = sc.nextInt();
    int total = int1 + int2;
    System.out.println("The sum of the numbers is " + total);
  }

  public void FizzBuzzTester() {
    for (int i = 1; i <= 100; i++) {
      String result = fizzBuzz(i);
      System.out.println("number " + i + " Result: " + result);
    }
  }
}