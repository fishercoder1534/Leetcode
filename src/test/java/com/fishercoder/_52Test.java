package com.fishercoder;

import com.fishercoder.solutions._52;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _52Test {
  private static _52.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _52.Solution1();
  }

  @Before
  public void clear() {
    /**Solution1 has an instance variable `count`, so I'll have to create a new one for each test*/
    solution1 = new _52.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(1, solution1.totalNQueens(1));
  }

  @Test
  public void test2() {
    assertEquals(92, solution1.totalNQueens(8));
  }

  @Test
  public void test3() {
    assertEquals(0, solution1.totalNQueens(2));
  }
}
