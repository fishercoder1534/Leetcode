package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._765;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _765Test {
  private _765.Solution1 solution1;
  private static int[] row;

  @BeforeEach
    public void setUp() {
    solution1 = new _765.Solution1();
  }

  @Test
  public void test1() {
    row = new int[] {0, 2, 1, 3};
    assertEquals(1, solution1.minSwapsCouples(row));
  }

  @Test
  public void test2() {
    row = new int[] {3, 2, 0, 1};
    assertEquals(0, solution1.minSwapsCouples(row));
  }

  @Test
  public void test3() {
    row = new int[] {0, 4, 7, 3, 1, 5, 2, 8, 6, 9};
    assertEquals(3, solution1.minSwapsCouples(row));
  }

  @Test
  public void test4() {
    row = new int[] {5, 6, 4, 0, 2, 1, 9, 3, 8, 7, 11, 10};
    assertEquals(4, solution1.minSwapsCouples(row));
  }
}
