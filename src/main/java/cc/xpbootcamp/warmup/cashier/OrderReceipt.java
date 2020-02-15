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
    output.append(PRINTING_ORDERS + LINE_BREAK_MARK);
    output.append(order.getCustomerName());
    output.append(order.getCustomerAddress());
    double totSalesTx = 0d;
    double tot = 0d;
    for (OrderItem orderItem : order.getOrderItems()) {
      output.append(orderItem.getDescription());
      output.append(TAB_MARK);
      output.append(orderItem.getPrice());
      output.append(TAB_MARK);
      output.append(orderItem.getQuantity());
      output.append(TAB_MARK);
      output.append(orderItem.totalAmount());
      output.append(LINE_BREAK_MARK);
      double salesTax = orderItem.totalAmount() * .10;
      totSalesTx += salesTax;
      tot += orderItem.totalAmount() + salesTax;
    }
    output.append(SALES_TAX).append(TAB_MARK).append(totSalesTx);
    output.append(TOTAL_AMOUNT).append(TAB_MARK).append(tot);
    return output.toString();
  }
}