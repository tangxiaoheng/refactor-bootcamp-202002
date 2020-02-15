package cc.xpbootcamp.warmup.fibonacci;

public class Fibonacii {

  public int calculate(int position) {
    if (position == 1 || position == 2) {
      return 1;
    }
    return calculate(position - 1) + calculate(position - 2);
  }
}
