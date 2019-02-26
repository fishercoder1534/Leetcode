package com.fishercoder;

import com.fishercoder.solutions._392;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class _392Test {
  private static _392.Solution1 solution1;
  private static String s;
  private static String t;
  private static boolean expected;
  private static boolean actual;

  @BeforeClass
  public static void setup() {
    solution1 = new _392.Solution1();
  }

  @Test
  public void test1() {
    s = "abc";
    t = "ahbgdc";
    expected = true;
    actual = solution1.isSubsequence(s, t);
    assertEquals(expected, actual);
  }

  @Test
  public void test2() {
    s = "axc";
    t = "ahbgdc";
    expected = false;
    actual = solution1.isSubsequence(s, t);
    assertEquals(expected, actual);
  }
}
