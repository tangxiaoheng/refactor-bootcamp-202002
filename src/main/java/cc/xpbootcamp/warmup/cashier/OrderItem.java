package cc.xpbootcamp.warmup.cashier;

import static cc.xpbootcamp.warmup.cashier.Constant.LINE_BREAK_MARK;
import static cc.xpbootcamp.warmup.cashier.Constant.TAB_MARK;

public class OrderItem {

  private String description;
  private double price;
  private int quantity;

  public OrderItem(String description, double price, int quantity) {
    super();
    this.description = description;
    this.price = price;
    this.quantity = quantity;
  }

  public String getDescription() {
    return description;
  }

  public double getPrice() {
    return price;
  }

  public int getQuantity() {
    return quantity;
  }

  double totalAmount() {
    return price * quantity;
  }

  double salesTax() {
    return this.totalAmount() * .10;
  }

  String buildOrderItemDescription() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(this.getDescription());
    stringBuilder.append(TAB_MARK);
    stringBuilder.append(this.getPrice());
    stringBuilder.append(TAB_MARK);
    stringBuilder.append(this.getQuantity());
    stringBuilder.append(TAB_MARK);
    stringBuilder.append(this.totalAmount());
    stringBuilder.append(LINE_BREAK_MARK);
    return stringBuilder.toString();
  }
}