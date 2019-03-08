package com.fishercoder;

import com.fishercoder.common.utils.CommonUtils;
import com.fishercoder.solutions._406;
import org.junit.BeforeClass;
import org.junit.Test;

public class _406Test {
  private static _406.Solution1 solution1;
  private static int[][] people;
  private static int[][] actual;

  @BeforeClass
  public static void setup() {
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
