package cc.xpbootcamp.warmup.cashier;

/**
 * OrderReceipt prints the details of order including customer name, address, description, quantity,
 * price and amount. It also calculates the sales tax @ 10% and prints as part of order. It computes
 * the total order amount (amount of individual lineItems + total sales tax) and prints it.
 */
public class OrderReceipt {

  private static final String TAB_MARK = "\t";
  private static final String LINE_BREAK_MARK = "\n";
  private static final String SALES_TAX = "Sales Tax";
  private static final String TOTAL_AMOUNT = "Total Amount";
  private static final String PRINTING_ORDERS = "======Printing Orders======";

  private Order order;

  public OrderReceipt(Order order) {
    this.order = order;
  }

  public String printReceipt() {
    StringBuilder output = new StringBuilder();
    output.append(buildOrderDescription(order));
    double totalSalesTax = 0d;
    double totalAmount = 0d;
    double salesTax;
    for (OrderItem orderItem : order.getOrderItems()) {
      output.append(buildOrderItemDescription(orderItem));
      salesTax = calculateOrderItemSalesTax(orderItem);
      totalSalesTax += salesTax;
      totalAmount += orderItem.totalAmount() + salesTax;
    }
    return output.append(buildPriceDescription(totalSalesTax, totalAmount)).toString();
  }

  private double calculateOrderItemSalesTax(OrderItem orderItem) {
    return orderItem.totalAmount() * .10;
  }

  private String buildOrderDescription(Order order) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(PRINTING_ORDERS + LINE_BREAK_MARK);
    stringBuilder.append(order.getCustomerName());
    stringBuilder.append(order.getCustomerAddress());
    return stringBuilder.toString();
  }

  private String buildOrderItemDescription(OrderItem orderItem) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(orderItem.getDescription());
    stringBuilder.append(TAB_MARK);
    stringBuilder.append(orderItem.getPrice());
    stringBuilder.append(TAB_MARK);
    stringBuilder.append(orderItem.getQuantity());
    stringBuilder.append(TAB_MARK);
    stringBuilder.append(orderItem.totalAmount());
    stringBuilder.append(LINE_BREAK_MARK);
    return stringBuilder.toString();
  }

  private String buildPriceDescription(double totalSalesTax, double total) {
    StringBuilder stringBuilder = new StringBuilder();
    stringBuilder.append(SALES_TAX).append(TAB_MARK).append(totalSalesTax);
    stringBuilder.append(TOTAL_AMOUNT).append(TAB_MARK).append(total);
    return stringBuilder.toString();
  }
}