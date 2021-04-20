public class Animal {
  private String name;
  private int strength;
  private int health;
  private char gender;

  // Constructor
  public Animal(String name, int strength, char gender) {
    this.name = name;
    this.strength = strength;
    this.gender = gender;
    this.health = 100;
  }

  // Method Overloading
  public Animal(String name, char gender) {
    this.name = name;
    this.strength = 50;
    this.gender = gender;
    this.health = 100;
  }

  // Getters and Setters
  public String getName() {
    return this.name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public int getStrength() {
    return this.strength;
  }

  public void setStrength(int strength) {
    this.strength = strength;
  }

  public char getGender() {
    return this.gender;
  }

  public void setGender(char gender) {
    this.gender = gender;
  }

  public int getHealth() {
    return this.health;
  }

  public void setHealth(int health) {
    this.health = health;
  }

  // Method for Object interacting with another object
  public void battle(Animal otherAnimal, String powerMove) {
    // Define logic of how animal attacks;
    int damage;
    if (powerMove.equals("bite")) {
      damage = 3;
    } else if (powerMove.equals("slash")) {
      damage = 4;
    } else if (powerMove.equals("fireball")) {
      damage = 5;
    } else {
      System.out.println("Move not Recognized");
      return;
    }

    // Multiple Strength x Damage
    int effectiveDamage = this.strength * damage;

    // reduce our target animals health by effectiveDamage
    int targetsHealth = otherAnimal.getHealth();
    targetsHealth -= effectiveDamage;
    otherAnimal.setHealth(targetsHealth);

    // print to the console what just happened, using a formatted string
    System.out.printf("%s attacks %s for %d health points \n", this.name, otherAnimal.name, effectiveDamage);
    System.out.println(otherAnimal.name + " health is now " + otherAnimal.health);
  }

  // Method Overloading for Battle
  public void battle(Animal otherAnimal) {
    this.battle(otherAnimal, "bite");
  }
}