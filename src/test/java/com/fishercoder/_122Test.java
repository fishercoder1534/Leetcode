package com.fishercoder;

import com.fishercoder.solutions._122;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _122Test {
  private static _122.Solution1 solution1;
  private static _122.Solution2 solution2;
  private static int[] prices;

  @BeforeClass
  public static void setup() {
    solution1 = new _122.Solution1();
    solution2 = new _122.Solution2();
  }

  @Test
  public void test1() {
    prices = new int[] {1, 2, 4};
    assertEquals(3, solution1.maxProfit(prices));
    assertEquals(3, solution2.maxProfit(prices));
  }
}
