package com.fishercoder;

import com.fishercoder.solutions._132;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _132Test {
  private static _132.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _132.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(1, solution1.minCut("aab"));
  }
}
