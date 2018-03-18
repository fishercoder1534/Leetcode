package com.fishercoder;

import com.fishercoder.solutions._740;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _740Test {
  private static _740.Solution1 solution1;
  private static int[] nums;

  @BeforeClass
  public static void setup() {
    solution1 = new _740.Solution1();
  }

  @Test
  public void test1() {
    nums = new int[] {3, 4, 2};
    assertEquals(6, solution1.deleteAndEarn(nums));
  }

  @Test
  public void test2() {
    nums = new int[] {2, 2, 3, 3, 3, 4};
    assertEquals(9, solution1.deleteAndEarn(nums));
  }
}
