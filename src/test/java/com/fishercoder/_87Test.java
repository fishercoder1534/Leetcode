package com.fishercoder;

import com.fishercoder.solutions._87;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _87Test {
  private static _87.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _87.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(true, solution1.isScramble("great", "rgeat"));
  }

  @Test
  public void test2() {
    assertEquals(true, solution1.isScramble("great", "rgtae"));
  }

  @Test
  public void test3() {
    assertEquals(true, solution1.isScramble("abc", "bca"));
  }
}
