public class Gorilla extends Mammal {
  // Directly call the mammal constructor
  public Gorilla() {
    super("Gorilla", 500);
  }

  @Override
  public void takeDamage(int damageAmount) {
    this.health -= (damageAmount / 2);
  }

  public void eatBanana() {
    System.out.printf("I am a %s eating a banana", this.species);
  }
}