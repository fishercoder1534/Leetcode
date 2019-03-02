package com.fishercoder;

import com.fishercoder.solutions._400;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _400Test {
  private static _400.Solution1 solution1;
  private static int expected;
  private static int actual;
  private static int n;

  @BeforeClass
  public static void setup() {
    solution1 = new _400.Solution1();
  }

  @Test
  public void test1() {
    n = 11;
    expected = 0;
    actual = solution1.findNthDigit(n);
    assertEquals(expected, actual);
  }
}
