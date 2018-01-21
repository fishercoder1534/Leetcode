package com.fishercoder;

import com.fishercoder.solutions._766;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _766Test {
  private static _766.Solution1 solution1;
  private static int[][] matrix;

  @BeforeClass
  public static void setup() {
    solution1 = new _766.Solution1();
  }

  @Test
  public void test1() {
    matrix = new int[][] {
        {1, 2, 3, 4},
        {5, 1, 2, 3},
        {9, 5, 1, 2}
    };
    assertEquals(true, solution1.isToeplitzMatrix(matrix));
  }

  @Test
  public void test2() {
    matrix = new int[][] {
        {1, 2},
        {2, 2},
    };
    assertEquals(false, solution1.isToeplitzMatrix(matrix));
  }

  @Test
  public void test3() {
    matrix = new int[][] {
        {1, 2, 3, 4, 5, 9},
        {5, 1, 2, 3, 4, 5},
        {9, 5, 1, 2, 3, 4}
    };
    assertEquals(true, solution1.isToeplitzMatrix(matrix));
  }
}
