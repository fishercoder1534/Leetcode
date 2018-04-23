package com.fishercoder;

import com.fishercoder.solutions._134;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _134Test {
  private static _134.Solution1 solution1;
  private static int[] gas;
  private static int[] cost;

  @BeforeClass
  public static void setup() {
    solution1 = new _134.Solution1();
  }

  @Test
  public void test1() {
    gas = new int[] {4};
    cost = new int[] {5};
    assertEquals(-1, solution1.canCompleteCircuit(gas, cost));
  }

  @Test
  public void test2() {
    gas = new int[] {5};
    cost = new int[] {4};
    assertEquals(0, solution1.canCompleteCircuit(gas, cost));
  }

  @Test
  public void test3() {
    gas = new int[] {2};
    cost = new int[] {2};
    assertEquals(0, solution1.canCompleteCircuit(gas, cost));
  }
}
