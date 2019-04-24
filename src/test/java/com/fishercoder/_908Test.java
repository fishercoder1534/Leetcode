package com.fishercoder;

import com.fishercoder.solutions._908;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _908Test {
  private static _908.Solution1 solution1;
  private static _908.Solution2 solution2;
  private static int[] A;

  @BeforeClass
  public static void setup() {
    solution1 = new _908.Solution1();
    solution2 = new _908.Solution2();
  }

  @Test
  public void test1() {
    A = new int[] {1};
    assertEquals(0, solution1.smallestRangeI(A, 0));
    assertEquals(0, solution2.smallestRangeI(A, 0));
  }

  @Test
  public void test2() {
    A = new int[] {0, 10};
    assertEquals(6, solution1.smallestRangeI(A, 2));
    assertEquals(6, solution2.smallestRangeI(A, 2));
  }

  @Test
  public void test3() {
    A = new int[] {1, 3, 6};
    assertEquals(0, solution1.smallestRangeI(A, 3));
    assertEquals(0, solution2.smallestRangeI(A, 3));
  }
}
