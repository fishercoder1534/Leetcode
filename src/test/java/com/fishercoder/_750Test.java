package com.fishercoder;

import com.fishercoder.solutions._750;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _750Test {
  private static _750.Solution1 solution1;
  private static int[][] grid;

  @BeforeClass
  public static void setup() {
    solution1 = new _750.Solution1();
  }

  @Test
  public void test1() {
    grid = new int[][] {
        {1, 0, 0, 1, 0},
        {0, 0, 1, 0, 1},
        {0, 0, 0, 1, 0},
        {1, 0, 1, 0, 1}};
    assertEquals(1, solution1.countCornerRectangles(grid));
  }

  @Test
  public void test2() {
    grid = new int[][] {
        {1, 1, 1},
        {1, 1, 1},
        {1, 1, 1}};
    assertEquals(9, solution1.countCornerRectangles(grid));
  }

  @Test
  public void test3() {
    grid = new int[][] {
        {1, 1, 1, 1}};
    assertEquals(0, solution1.countCornerRectangles(grid));
  }
}
