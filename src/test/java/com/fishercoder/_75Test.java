package com.fishercoder;

import com.fishercoder.solutions._75;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _75Test {
  private static _75.Solution1 solution1;
  private static int[] nums;

  @BeforeClass
  public static void setup() {
    solution1 = new _75.Solution1();
  }

  @Test
  public void test1() {
    nums = new int[] {2, 2, 1};
    solution1.sortColors(nums);
    assertArrayEquals(new int[] {1, 2, 2}, nums);
  }

  @Test
  public void test2() {
    nums = new int[] {0, 1, 2, 0, 2, 1};
    solution1.sortColors(nums);
    assertArrayEquals(new int[] {0, 0, 1, 1, 2, 2}, nums);
  }

  @Test
  public void test3() {
    nums = new int[] {0};
    solution1.sortColors(nums);
    assertArrayEquals(new int[] {0}, nums);
  }

  @Test
  public void test4() {
    nums = new int[] {1, 0};
    solution1.sortColors(nums);
    assertArrayEquals(new int[] {0, 1}, nums);
  }

  @Test
  public void test5() {
    nums = new int[] {2};
    solution1.sortColors(nums);
    assertArrayEquals(new int[] {2}, nums);
  }
}
