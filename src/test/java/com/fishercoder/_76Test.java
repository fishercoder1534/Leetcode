package com.fishercoder;

import com.fishercoder.solutions._76;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _76Test {
  private static _76.Solution1 solution1;
  private static int[] nums;

  @BeforeClass
  public static void setup() {
    solution1 = new _76.Solution1();
  }

  @Test
  public void test1() {
    assertEquals("BANC", solution1.minWindow("ADOBECODEBANC", "ABC"));
  }
}
