package com.fishercoder;

import com.fishercoder.solutions._410;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _410Test {
  private static _410.Solution1 test;
  private static int[] nums;

  @BeforeClass
  public static void setup() {
    test = new _410.Solution1();
  }

  @Test
  public void test1() {
    nums = new int[] {7, 2, 5, 10, 8};
    assertEquals(18, test.splitArray(nums, 2));
  }
}
