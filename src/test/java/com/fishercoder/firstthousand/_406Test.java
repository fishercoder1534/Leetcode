package com.fishercoder.firstthousand;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions.firstthousand._406;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class _406Test {
  private _406.Solution1 solution1;
  private static int[][] people;
  private static int[][] actual;

  @BeforeEach
    public void setUp() {
    solution1 = new _406.Solution1();
  }

  @Test
  public void test1() {
    people = new int[][] {
        {7, 0},
        {4, 4},
        {7, 1},
        {5, 0},
        {6, 1},
        {5, 2}
    };
    actual = solution1.reconstructQueue(people);
    CommonUtils.printArrayArray(actual);
  }
}
