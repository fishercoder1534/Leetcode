package com.fishercoder;

import com.fishercoder.solutions._36;
import com.fishercoder.solutions._735;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertArrayEquals;

public class _36Test {
  private static _36.Solution1 solution1;
  private static char[][] board;

  @BeforeClass
  public static void setup() {
    solution1 = new _36.Solution1();
  }

  @Test
  public void test1() {
    board = new char[][] {
        {'4', '3', '5', '2', '6', '9', '7', '8', '1'},
        {'6', '8', '2', '5', '7', '1', '4', '9', '3'},
        {'1', '9', '7', '8', '3', '4', '5', '6', '2'},
        {'8', '2', '6', '1', '9', '5', '3', '4', '7'},
        {'3', '7', '4', '6', '8', '2', '9', '1', '5'},
        {'9', '5', '1', '7', '4', '3', '6', '2', '8'},
        {'5', '1', '9', '3', '2', '6', '8', '7', '4'},
        {'2', '4', '8', '9', '5', '7', '1', '3', '6'},
        {'7', '6', '3', '4', '1', '8', '2', '5', '9'},
    };
    assertEquals(true, solution1.isValidSudoku(board));
  }

  @Test
  public void test2() {
    board = new char[][] {
        {'.', '8', '7', '6', '5', '4', '3', '2', '1'},
        {'2', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'3', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'4', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'5', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'6', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'7', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'8', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'9', '.', '.', '.', '.', '.', '.', '.', '.'},
    };
    assertEquals(true, solution1.isValidSudoku(board));
  }

  @Test
  public void test3() {
    board = new char[][] {
        {'.', '.', '.', '.', '5', '.', '.', '1', '.'},
        // this upper right corner 3*3 square is invalid, '1' appears twice
        {'.', '4', '.', '3', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '3', '.', '.', '1'},
        {'8', '.', '.', '.', '.', '.', '.', '2', '.'},
        {'.', '.', '2', '.', '7', '.', '.', '.', '.'},
        {'.', '1', '5', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '2', '.', '.', '.'},
        {'.', '2', '.', '9', '.', '.', '.', '.', '.'},
        {'.', '.', '4', '.', '.', '.', '.', '.', '.'},
    };
    assertEquals(false, solution1.isValidSudoku(board));
  }

  @Test
  public void test4() {
    board = new char[][] {
        {'.', '.', '4', '.', '.', '.', '6', '3', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'5', '.', '.', '.', '.', '.', '.', '9', '.'},
        {'.', '.', '.', '5', '6', '.', '.', '.', '.'},
        {'4', '.', '3', '.', '.', '.', '.', '.', '1'},
        {'.', '.', '.', '7', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '5', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
        {'.', '.', '.', '.', '.', '.', '.', '.', '.'}
    };
    assertEquals(false, solution1.isValidSudoku(board));
  }
}
