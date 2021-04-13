import java.util.Arrays;

public class PizzaController {
  public static void main(String[] args) {
    Pizza cheesePizza = new Pizza("Cheese Pizza", new String[] { "cheese" }, 'L', 10);

    Pizza hawaiian = new Pizza("Hawaiian", new String[] { "pineapple", "canadian bacon", "pepperoni", "Japlapenos" },
        'L', 10);
    Pizza jesusPizza = new Pizza("Mushroom Pizza", new String[] { "3 cheese", "3 mushrooms", "oregano", "truffle oil" },
        'L', 10);

    Pizza oscarsPizza = new Pizza('L', 10);
    System.out.println(Arrays.toString(oscarsPizza.getToppings()));
    System.out.println(oscarsPizza.getName());
    cheesePizza.displayPizza();

    Pizza.advertise();
    System.out.println(Pizza.totalPizzas);
    hawaiian.pizzaFight(cheesePizza);
    System.out.println(Pizza.totalPizzas);
    cheesePizza.eat();
  }

}