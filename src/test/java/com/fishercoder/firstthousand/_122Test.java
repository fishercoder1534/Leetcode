package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._122;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _122Test {
  private _122.Solution1 solution1;
  private _122.Solution2 solution2;
  private static int[] prices;

  @BeforeEach
    public void setUp() {
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
