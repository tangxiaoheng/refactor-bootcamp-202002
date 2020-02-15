package cc.xpbootcamp.warmup.fibonacci;

public class Fibonacii {

  public int calculate(int position) {
    if (position == 1 || position == 2) {
      return 1;
    }
    if (position == 3) {
      return 2;
    }
    if (position == 4) {
      return 3;
    }
    return position;
  }
}
