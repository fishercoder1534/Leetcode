package com.fishercoder;

import com.fishercoder.solutions._746;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _746Test {
  private static _746.Solution1 solution1;
  private static int[] cost;

  @BeforeClass
  public static void setup() {
    solution1 = new _746.Solution1();
  }

  @Test
  public void test1() {
    cost = new int[] {10, 15, 20};
    assertEquals(15, solution1.minCostClimbingStairs(cost));
  }

  @Test
  public void test2() {
    cost = new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
    assertEquals(6, solution1.minCostClimbingStairs(cost));
  }
}
