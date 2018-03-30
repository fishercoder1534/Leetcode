package com.fishercoder;

import com.fishercoder.solutions._769;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _769Test {
  private static _769.Solution1 solution1;
  private static _769.Solution2 solution2;
  private static int[] arr;

  @BeforeClass
  public static void setup() {
    solution1 = new _769.Solution1();
    solution2 = new _769.Solution2();
  }

  @Test
  public void test1() {
    arr = new int[] {4, 3, 2, 1, 0};
    assertEquals(1, solution1.maxChunksToSorted(arr));
    assertEquals(1, solution2.maxChunksToSorted(arr));
  }

  @Test
  public void test2() {
    arr = new int[] {1, 0, 2, 3, 4};
    assertEquals(4, solution1.maxChunksToSorted(arr));
    assertEquals(4, solution2.maxChunksToSorted(arr));
  }
}
