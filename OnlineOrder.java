public class OnlineOrder extends Order {
  private int storeId;

  public OnlineOrder(int id, int total, String name) {
    super(id, total, name);
    this.storeId = 30;
  }

  public void cancel() {
    System.out.println("order has been canceled from " + this.storeId);
  }

  public int getStoreId() {
    return storeId;
  }

  public void setStoreId(int storeId) {
    this.storeId = storeId;
  }
}