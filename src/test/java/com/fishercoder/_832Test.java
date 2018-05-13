package com.fishercoder;

import com.fishercoder.solutions._832;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _832Test {
  private static _832.Solution1 solution1;
  private static int[][] expected;
  private static int[][] A;

  @BeforeClass
  public static void setup() {
    solution1 = new _832.Solution1();
  }

  @Test
  public void test1() {
    A = new int[][] {
        {1, 1, 0},
        {1, 0, 1},
        {0, 0, 0}
    };
    expected = new int[][] {
        {1, 0, 0},
        {0, 1, 0},
        {1, 1, 1}
    };
    assertArrayEquals(expected, solution1.flipAndInvertImage(A));
  }

  @Test
  public void test2() {
    A = new int[][] {
        {1, 1, 0, 0},
        {1, 0, 0, 1},
        {0, 1, 1, 1},
        {1, 0, 1, 0}
    };
    expected = new int[][] {
        {1, 1, 0, 0},
        {0, 1, 1, 0},
        {0, 0, 0, 1},
        {1, 0, 1, 0}
    };
    assertArrayEquals(expected, solution1.flipAndInvertImage(A));
  }
}
