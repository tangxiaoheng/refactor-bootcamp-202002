package cc.xpbootcamp.warmup.fibonacci;

public class Fibonacii {

  public long calculate(long position) {
    if (position == 1L || position == 2L) {
      return 1L;
    }
    return calculate(position - 1) + calculate(position - 2);
  }
}
