package cc.xpbootcamp.warmup.cashier;

import static cc.xpbootcamp.warmup.cashier.Constant.LINE_BREAK_MARK;
import static cc.xpbootcamp.warmup.cashier.Constant.PRINTING_ORDERS;

import java.util.List;

public class Order {

  String customerName;
  String address;
  List<OrderItem> orderItems;

  public Order(String customerName, String address, List<OrderItem> orderItems) {
    this.customerName = customerName;
    this.address = address;
    this.orderItems = orderItems;
  }

  public String getCustomerName() {
    return customerName;
  }

  public String getCustomerAddress() {
    return address;
  }

  public List<OrderItem> getOrderItems() {
    return orderItems;
  }

  double getTotalSalesTax() {
    return orderItems.stream()
        .mapToDouble(OrderItem::getSalesTax)
        .sum();
  }

  double getTotalAmount() {
    return orderItems.stream()
        .mapToDouble(OrderItem::getOrderItemTotalAmount)
        .sum() + getTotalSalesTax();
  }

  String buildOrderDescription() {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(PRINTING_ORDERS + LINE_BREAK_MARK);
    stringBuilder.append(this.getCustomerName());
    stringBuilder.append(this.getCustomerAddress());
    return stringBuilder.toString();
  }
}
