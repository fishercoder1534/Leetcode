package com.fishercoder;

import com.fishercoder.solutions._348;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _348Test {
  @Test
  public void test1() {
    int n = 3;
    _348.Solution1.TicTacToe ticTacToe = new _348.Solution1.TicTacToe(n);
    assertEquals(0, ticTacToe.move(0, 0, 1));
    assertEquals(0, ticTacToe.move(0, 2, 2));
    assertEquals(0, ticTacToe.move(2, 2, 1));
    assertEquals(0, ticTacToe.move(1, 1, 2));
    assertEquals(0, ticTacToe.move(2, 0, 1));
    assertEquals(0, ticTacToe.move(1, 0, 2));
    assertEquals(1, ticTacToe.move(2, 1, 1));
  }

  @Test
  public void test2() {
    int n = 3;
    _348.Solution1.TicTacToe ticTacToe = new _348.Solution1.TicTacToe(n);
    assertEquals(0, ticTacToe.move(0, 0, 1));
    assertEquals(0, ticTacToe.move(1, 1, 1));
    assertEquals(1, ticTacToe.move(2, 2, 1));
  }

  @Test
  public void test3() {
    int n = 3;
    _348.Solution1.TicTacToe ticTacToe = new _348.Solution1.TicTacToe(n);
    assertEquals(0, ticTacToe.move(0, 2, 2));
    assertEquals(0, ticTacToe.move(1, 1, 2));
    assertEquals(2, ticTacToe.move(2, 0, 2));
  }
}
