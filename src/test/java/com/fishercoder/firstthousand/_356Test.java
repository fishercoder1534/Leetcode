package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._356;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _356Test {
  private _356.Solution1 solution1;
  private static int[][] points;

  @BeforeEach
    public void setUp() {
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
