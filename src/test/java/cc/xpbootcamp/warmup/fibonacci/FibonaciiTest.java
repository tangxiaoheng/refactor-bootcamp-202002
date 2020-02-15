package cc.xpbootcamp.warmup.fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonaciiTest {

  private Fibonacii fibonacii;

  @BeforeEach
  void setUp() {
    fibonacii=new Fibonacii();
  }

  @Test
  void should_return_1_when_calculate_given_position_is_1() {
    int result = fibonacii.calculate(1);
    assertEquals(1, result);
  }
}
