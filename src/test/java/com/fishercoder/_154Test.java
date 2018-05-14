package com.fishercoder;

import com.fishercoder.solutions._154;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _154Test {
  private static _154.Solution1 solution1;
  private static int[] nums;

  @BeforeClass
  public static void setup() {
    solution1 = new _154.Solution1();
  }

  @Test
  public void test1() {
    nums = new int[] {1, 1, 1};
    assertEquals(1, solution1.findMin(nums));
  }
}
