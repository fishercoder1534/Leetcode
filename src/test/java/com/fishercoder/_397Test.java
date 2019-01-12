package com.fishercoder;

import com.fishercoder.solutions._397;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _397Test {
  private static _397.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _397.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(17, solution1.integerReplacement(65535));
  }

  @Test
  public void test2() {
    assertEquals(14, solution1.integerReplacement(1234));
  }

  @Test
  public void test3() {
    assertEquals(3, solution1.integerReplacement(5));
  }
}
