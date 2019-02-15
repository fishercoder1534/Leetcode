package com.fishercoder;

import com.fishercoder.solutions._703;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _703Test {
  private static _703.Solution1.KthLargest solution1;
  private static int[] A;

  @Test
  public void test1() {
    solution1 = new _703.Solution1.KthLargest(3, new int[] {4, 5, 8, 2});
    assertEquals(4, solution1.add(3));
    assertEquals(5, solution1.add(5));
    assertEquals(5, solution1.add(10));
    assertEquals(8, solution1.add(9));
    assertEquals(8, solution1.add(4));
  }
}
