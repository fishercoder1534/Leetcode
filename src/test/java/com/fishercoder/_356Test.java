package com.fishercoder;

import com.fishercoder.solutions._356;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _356Test {
  private static _356.Solution1 solution1;
  private static int[][] points;

  @BeforeClass
  public static void setup() {
    solution1 = new _356.Solution1();
  }

  @Test
  public void test1() {
    points = new int[][] {
        {1, 1},
        {-1, 1},
    };
    assertEquals(true, solution1.isReflected(points));
  }

  @Test
  public void test2() {
    points = new int[][] {
        {1, 1},
        {-1, -1},
    };
    assertEquals(false, solution1.isReflected(points));
  }
}
