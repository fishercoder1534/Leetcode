package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._750;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _750Test {
  private _750.Solution1 solution1;
  private static int[][] grid;

  @BeforeEach
    public void setUp() {
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
