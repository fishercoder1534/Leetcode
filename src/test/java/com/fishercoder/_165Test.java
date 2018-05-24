package com.fishercoder;

import com.fishercoder.solutions._165;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _165Test {
  private static _165.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _165.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(-1, solution1.compareVersion("1.1", "1.2"));
  }

  @Test
  public void test2() {
    assertEquals(1, solution1.compareVersion("1.0.1", "1"));
  }

  @Test
  public void test3() {
    assertEquals(-0, solution1.compareVersion("1.0", "1"));
  }
}
