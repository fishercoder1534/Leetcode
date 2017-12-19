package com.fishercoder;

import com.fishercoder.solutions._27;
import com.fishercoder.solutions._734;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _27Test {
  private static _27.Solution1 solution1;
  private static int[] nums;

  @BeforeClass
  public static void setup() {
    solution1 = new _27.Solution1();
  }

  @Test
  public void test1() {
    nums = new int[] {3, 2, 2, 3};
    assertEquals(2, solution1.removeElement(nums, 3));
  }

  @Test
  public void test2() {
    nums = new int[] {2, 2, 3};
    assertEquals(1, solution1.removeElement(nums, 2));
  }

  @Test
  public void test3() {
    nums = new int[] {1};
    assertEquals(0, solution1.removeElement(nums, 1));
  }
}
