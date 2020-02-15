package cc.xpbootcamp.warmup.fibonacci;

public class Fibonacii {

  public long calculate(int position) {
    long[] array = new long[51];
    array[1] = 1;
    array[2] = 1;
    for (int i = 3; i < 51; i++) {
      array[i] = array[i - 1] + array[i - 2];
    }
    return array[position];
  }
}
