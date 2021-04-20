public class Store {
  public static void main(String[] args) {
    Order o = new OnlineOrder(12, 300, "guitar");

    System.out.println(o.displayOrder());
    o.cancel();
  }
}