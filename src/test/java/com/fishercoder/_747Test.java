package com.fishercoder;

import com.fishercoder.solutions._747;
import com.fishercoder.solutions._9;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _747Test {
  private static _747.Solution1 solution1;
  private static _747.Solution2 solution2;
  private static int[] nums;

  @BeforeClass
  public static void setup() {
    solution1 = new _747.Solution1();
    solution2 = new _747.Solution2();
  }

  @Test
  public void test1() {
    nums = new int[] {3, 6, 1, 0};
    assertEquals(1, solution1.dominantIndex(nums));
  }

  @Test
  public void test2() {
    nums = new int[] {3, 6, 1, 0};
    assertEquals(1, solution2.dominantIndex(nums));
  }

  @Test
  public void test3() {
    nums = new int[] {1, 2, 3, 4};
    assertEquals(-1, solution1.dominantIndex(nums));
  }

  @Test
  public void test4() {
    nums = new int[] {1, 2, 3, 4};
    assertEquals(-1, solution2.dominantIndex(nums));
  }
}
