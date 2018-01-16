package com.fishercoder;

import com.fishercoder.solutions._755;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _755Test {
  private static _755.Solution1 solution1;
  private static int[] heights;
  private static int[] expected;

  @BeforeClass
  public static void setup() {
    solution1 = new _755.Solution1();
  }

  @Test
  public void test1() {
    heights = new int[] {2, 1, 1, 2, 1, 2, 2};
    expected = new int[] {2, 2, 2, 3, 2, 2, 2};
    assertArrayEquals(expected, solution1.pourWater(heights, 4, 3));
  }

  @Test
  public void test2() {
    heights = new int[] {1, 2, 3, 4};
    expected = new int[] {2, 3, 3, 4};
    assertArrayEquals(expected, solution1.pourWater(heights, 2, 2));
  }

  @Test
  public void test3() {
    heights = new int[] {3, 1, 3};
    expected = new int[] {4, 4, 4};
    assertArrayEquals(expected, solution1.pourWater(heights, 5, 1));
  }

  @Test
  public void test4() {
    heights = new int[] {1, 2, 3, 4, 3, 2, 1, 2, 3, 4, 3, 2, 1};
    expected = new int[] {1, 2, 3, 4, 3, 3, 2, 2, 3, 4, 3, 2, 1};
    assertArrayEquals(expected, solution1.pourWater(heights, 2, 5));
  }

  @Test
  public void test5() {
    heights = new int[] {1, 2, 3, 4, 3, 2, 1, 2, 3, 4, 3, 2, 1};
    expected = new int[] {3, 4, 4, 4, 3, 2, 1, 2, 3, 4, 3, 2, 1};
    assertArrayEquals(expected, solution1.pourWater(heights, 5, 2));
  }

  @Test
  public void test6() {
    heights = new int[] {1, 2, 3, 4, 3, 2, 1, 2, 3, 4, 3, 2, 1};
    expected = new int[] {4, 4, 4, 4, 3, 3, 3, 3, 3, 4, 3, 2, 1};
    assertArrayEquals(expected, solution1.pourWater(heights, 10, 2));
  }

  @Test
  public void test7() {
    heights = new int[] {1, 2, 3, 4, 3, 2, 1, 2, 3, 4, 3, 2, 1};
    expected = new int[] {2, 3, 3, 4, 3, 2, 1, 2, 3, 4, 3, 2, 1};
    assertArrayEquals(expected, solution1.pourWater(heights, 2, 2));
  }

  @Test
  public void test8() {
    heights = new int[] {1, 2, 3, 4, 3, 2, 1, 2, 3, 4, 3, 2, 1};
    expected = new int[] {3, 3, 3, 4, 3, 2, 1, 2, 3, 4, 3, 2, 1};
    assertArrayEquals(expected, solution1.pourWater(heights, 3, 2));
  }

  @Test
  public void test9() {
    heights = new int[] {1, 2, 3, 4, 3, 2, 1, 2, 3, 4, 3, 2, 1};
    expected = new int[] {3, 3, 4, 4, 3, 2, 1, 2, 3, 4, 3, 2, 1};
    assertArrayEquals(expected, solution1.pourWater(heights, 4, 2));
  }

  @Test
  public void test10() {
    heights = new int[] {1, 2, 3, 4, 3, 2, 1, 2, 3, 4, 3, 2, 1};
    expected = new int[] {3, 4, 4, 4, 3, 2, 1, 2, 3, 4, 3, 2, 1};
    assertArrayEquals(expected, solution1.pourWater(heights, 5, 2));
  }
}
