package com.fishercoder;

import com.fishercoder.solutions._28;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class _28Test {
  private static _28.Solution1 solution1;
  private static _28.Solution2 solution2;

  @Before
  public void setupForEachTest() {
    solution1 = new _28.Solution1();
    solution2 = new _28.Solution2();
  }

  @Test
  public void test1() {
    assertEquals(0, solution1.strStr("a", ""));
    assertEquals(0, solution2.strStr("sadbutsad", "sad"));
  }

  @Test
  public void test2() {

    assertEquals(-1, solution1.strStr("mississippi", "a"));
    assertEquals(8, solution2.strStr("leetcodea", "a"));
  }

  @Test
  public void test3() {
    assertEquals(0, solution1.strStr("a", "a"));
  }
}
