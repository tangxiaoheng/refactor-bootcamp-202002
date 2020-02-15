package cc.xpbootcamp.warmup.fibonacci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FibonaciiTest {

  private Fibonacii fibonacii;

  @BeforeEach
  void setUp() {
    fibonacii = new Fibonacii();
  }

  @Test
  void should_return_1_when_calculate_given_position_is_1() {
    long result = fibonacii.calculate(1L);
    assertEquals(1L, result);
  }

  @Test
  void should_return_1_when_calculate_given_position_is_2() {
    long result = fibonacii.calculate(2L);
    assertEquals(1L, result);
  }

  @Test
  void should_return_2_when_calculate_given_position_is_3() {
    long result = fibonacii.calculate(3L);
    assertEquals(2, result);
  }

  @Test
  void should_return_3_when_calculate_given_position_is_4() {
    long result = fibonacii.calculate(4L);
    assertEquals(3L, result);
  }

  @Test
  void should_return_5_when_calculate_given_position_is_5() {
    long result = fibonacii.calculate(5L);
    assertEquals(5L, result);
  }

  @Test
  void should_return_8_when_calculate_given_position_is_6() {
    long result = fibonacii.calculate(6L);
    assertEquals(8L, result);
  }

  @Test
  void should_return_13_when_calculate_given_position_is_7() {
    long result = fibonacii.calculate(7L);
    assertEquals(13L, result);
  }

  @Test
  void should_return_12586269025_when_calculate_given_position_is_50() {
    long result = fibonacii.calculate(50L);
    assertEquals(12586269025L, result);
  }
}
