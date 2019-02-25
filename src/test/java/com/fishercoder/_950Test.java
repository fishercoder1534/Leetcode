package com.fishercoder;

import com.fishercoder.solutions._950;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _950Test {
  private static _950.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _950.Solution1();
  }

  @Test
  public void test1() {
    assertArrayEquals(new int[] {2, 13, 3, 11, 5, 17, 7},
        solution1.deckRevealedIncreasing(new int[] {17, 13, 11, 2, 3, 5, 7}));
  }
}
