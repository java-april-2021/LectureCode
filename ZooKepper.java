import java.util.ArrayList;

public class ZooKepper {
  public static void main(String[] args) {
    Mammal matt = new Mammal("human", 100);
    Gorilla magilla = new Gorilla();
    Gorilla dK = new Gorilla();
    Barrel b1 = new Barrel("Barrel2");
    dK.attack(b1);
    magilla.eatBanana();
  }
}