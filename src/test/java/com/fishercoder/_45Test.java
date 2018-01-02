package com.fishercoder;

import com.fishercoder.solutions._45;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _45Test {
  private static _45.Solution1 solution1;
  private static int[] A;

  @BeforeClass
  public static void setup() {
    solution1 = new _45.Solution1();
  }

  @Test
  public void test1() {
    A = new int[] {2, 3, 1, 1, 4};
    assertEquals(2, solution1.jump(A));
  }
}
