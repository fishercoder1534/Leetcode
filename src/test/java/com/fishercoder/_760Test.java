package com.fishercoder;

import com.fishercoder.solutions._760;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _760Test {
  private static _760.Solution1 solution1;
  private static int[] A;
  private static int[] B;
  private static int[] expected;

  @BeforeClass
  public static void setup() {
    solution1 = new _760.Solution1();
  }

  @Test
  public void test1() {
    A = new int[] {12, 28, 46, 32, 50};
    B = new int[] {50, 12, 32, 46, 28};
    expected = new int[] {1, 4, 3, 2, 0};
    assertArrayEquals(expected, solution1.anagramMappings(A, B));
  }
}
