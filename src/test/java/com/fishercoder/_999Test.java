package com.fishercoder;

import com.fishercoder.solutions._999;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _999Test {
  private static _999.Solution1 solution1;
  private static char[][] board;

  @BeforeClass
  public static void setup() {
    solution1 = new _999.Solution1();
  }

  @Test
  public void test1() {
    board = new char[][] {
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'.', '.', '.', 'R', '.', '.', '.', 'p'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
    };
    assertEquals(3, solution1.numRookCaptures(board));
  }

  @Test
  public void test2() {
    board = new char[][] {
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
        {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
        {'.', 'p', 'B', 'R', 'B', 'p', '.', '.'},
        {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'},
        {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
    };
    assertEquals(0, solution1.numRookCaptures(board));
  }

  @Test
  public void test3() {
    board = new char[][] {
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', 'p'},
        {'p', 'p', '.', 'R', '.', 'p', 'B', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', 'B', '.', '.', '.', '.'},
        {'.', '.', '.', 'p', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.'},
    };
    assertEquals(3, solution1.numRookCaptures(board));
  }
}
