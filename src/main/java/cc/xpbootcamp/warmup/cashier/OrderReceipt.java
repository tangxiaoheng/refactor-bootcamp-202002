package cc.xpbootcamp.warmup.cashier;

import static cc.xpbootcamp.warmup.cashier.Constant.SALES_TAX;
import static cc.xpbootcamp.warmup.cashier.Constant.TAB_MARK;
import static cc.xpbootcamp.warmup.cashier.Constant.TOTAL_AMOUNT;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part of order. It computes
 * the total order amount (amount of individual lineItems + total sales tax) and prints it.
 */
public class OrderReceipt {

  private Order order;

  public OrderReceipt(Order order) {
    this.order = order;
  }

  public String printReceipt() {
    StringBuilder output = new StringBuilder();
    output.append(order.buildOrderDescription());
    output.append(buildOrderItemsDescription());
    output.append(buildPriceDescription(order.getTotalSalesTax(), order.getTotalAmount()));
    return output.toString();
  }

  private String buildOrderItemsDescription() {
    StringBuilder stringBuilder = new StringBuilder();
    order.getOrderItems().stream()
        .forEach(orderItem -> stringBuilder.append(orderItem.buildOrderItemDescription()));
    return stringBuilder.toString();
  }

  private String buildPriceDescription(double totalSalesTax, double total) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(SALES_TAX).append(TAB_MARK).append(totalSalesTax);
    stringBuilder.append(TOTAL_AMOUNT).append(TAB_MARK).append(total);
    return stringBuilder.toString();
  }
}