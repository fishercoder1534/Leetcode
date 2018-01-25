package com.fishercoder;

import com.fishercoder.solutions._64;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _64Test {
  private static _64.Solution1 solution1;
  private static int[][] grid;

  @BeforeClass
  public static void setup() {
    solution1 = new _64.Solution1();
  }

  @Test
  public void test1() {
    grid = new int[][] {
        {1, 2},
        {1, 1}
    };
    assertEquals(3, solution1.minPathSum(grid));
  }

  @Test
  public void test2() {
    grid = new int[][] {{1}};
    assertEquals(1, solution1.minPathSum(grid));
  }

  @Test
  public void test3() {
    grid = new int[][] {
        {1, 3, 1},
        {1, 5, 1},
        {4, 2, 1}
    };
    assertEquals(7, solution1.minPathSum(grid));
  }
}
