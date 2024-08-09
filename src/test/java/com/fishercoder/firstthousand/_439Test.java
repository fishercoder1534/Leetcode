package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._439;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Created by fishercoder on 5/18/17.
 */
public class _439Test {
  private _439.Solution1 solution1;
  private static String expression;
  private static String expected;

  @BeforeEach
    public void setUp() {
    solution1 = new _439.Solution1();
  }

  @Test
  public void test1() {
    expression = "T?2:3";
    expected = "2";
    assertEquals(expected, solution1.parseTernary(expression));
  }

  @Test
  public void test2() {
    expression = "F?1:T?4:5";
    expected = "4";
    assertEquals(expected, solution1.parseTernary(expression));
  }

  @Test
  public void test3() {
    expression = "T?T?F:5:3";
    expected = "F";
    assertEquals(expected, solution1.parseTernary(expression));
  }

  @Test
  public void test4() {
    expression = "T?T:F?T?1:2:F?3:4";
    expected = "T";
    assertEquals(expected, solution1.parseTernary(expression));
  }
}
