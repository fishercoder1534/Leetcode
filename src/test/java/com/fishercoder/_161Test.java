package com.fishercoder;

import com.fishercoder.solutions._161;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _161Test {
  private static _161.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _161.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(true, solution1.isOneEditDistance("a", "ac"));
  }
}
