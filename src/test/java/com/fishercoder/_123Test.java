package com.fishercoder;

import com.fishercoder.solutions._123;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _123Test {
  private static _123.Solution1 solution1;
  private static int[] prices;

  @BeforeClass
  public static void setup() {
    solution1 = new _123.Solution1();
  }

  @Test
  public void test1() {
    prices = new int[] {1};
    assertEquals(0, solution1.maxProfit(prices));
  }
}
