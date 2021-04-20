public class AnimalController {
  // Entry Point Method
  public static void main(String[] args) {
    Animal sloth = new Animal("Carl", 10, 'M');
    Animal lion = new Animal("Simba", 11, 'M');

    Animal whale = new Animal("Wally", 'M');
    sloth.battle(lion, "fireball");
    lion.battle(sloth, "slash");

    whale.battle(sloth);
  }
}