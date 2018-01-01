package com.fishercoder;

import com.fishercoder.solutions._44;
import org.junit.BeforeClass;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _44Test {
  private static _44.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _44.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(false, solution1.isMatch("aa", "a"));
  }

  @Test
  public void test2() {
    assertEquals(true, solution1.isMatch("aa", "aa"));
  }

  @Test
  public void test3() {
    assertEquals(false, solution1.isMatch("aaa", "aa"));
  }

  @Test
  public void test4() {
    assertEquals(true, solution1.isMatch("aa", "*"));
  }

  @Test
  public void test5() {
    assertEquals(true, solution1.isMatch("aa", "a*"));
  }

  @Test
  public void test6() {
    assertEquals(true, solution1.isMatch("ab", "?*"));
  }

  @Test
  public void test7() {
    assertEquals(false, solution1.isMatch("aab", "c*a*b"));
  }
}
