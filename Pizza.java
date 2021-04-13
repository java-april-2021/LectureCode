public class Pizza {
  // Things Pizzas Have
  private String name;
  private String[] toppings;
  private char size;
  private int slices;
  static int totalPizzas;

  // Method Overloading
  public Pizza(char size, int slices) {
    this.name = "Chilinean Pizza";
    this.toppings = new String[] { "Anchovies", "onions", "veggies", "Green Peppers" };
    this.size = size;
    this.slices = slices;
  }

  public Pizza(String name, String[] toppings, char size, int slices) {
    this.name = name;
    this.toppings = toppings;
    this.size = size;
    this.slices = slices;
    this.totalPizzas = this.totalPizzas += 1;
  }

  // Getters And Setters Methods
  public String getName() {
    return this.name;
  }

  public String[] getToppings() {
    return this.toppings;
  }

  public char getSize() {
    return this.size;
  }

  public int getSlices() {
    return this.slices;
  }

  public void setName(String name) {
    if (name.equals("")) {
      System.out.println("Name cannot be blank");
      return;
    }
    this.name = name;
  }

  public void setToppings(String[] toppings) {
    this.toppings = toppings;
  }

  public void setSize(char size) {
    this.size = size;
  }

  public void setSlices(int slices) {
    this.slices = slices;
  }

  // Things you can do with the Pizza Object
  // Advertise()
  // Eat()

  public void displayPizza() {
    System.out.printf("This is a %s pizza with %s slices \n", this.name, this.slices);
  }

  public void pizzaFight(Pizza otherPizza) {
    int otherSlices = otherPizza.getSlices();
    otherPizza.setSlices(otherSlices -= 1);
    System.out.println(this.name + " just took a slice out of " + otherPizza.getName());
    System.out.println(otherPizza.getName() + " now has " + otherPizza.getSlices() + " slices.");
  }

  // Method Overloading

  public int eat(int slices) {
    this.slices -= slices;
    System.out.println("We just ate " + slices + " slices of " + this.name);
    return this.slices;
  }

  public int eat() {
    this.eat(1);
    return this.slices;
  }

  // Static
  public static void advertise() {
    System.out.println("Hey come to Oscar's pizza shop, not mafia owned, we promise wink wink");
  }
}