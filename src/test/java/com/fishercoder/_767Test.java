package com.fishercoder;

import com.fishercoder.solutions._767;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _767Test {
  private static _767.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _767.Solution1();
  }

  @Test
  public void test1() {
    assertEquals("aba", solution1.reorganizeString("aab"));
  }

  @Test
  public void test2() {
    assertEquals("", solution1.reorganizeString("aaab"));
  }

  @Test
  public void test3() {
    assertEquals("bababab", solution1.reorganizeString("aaabbbb"));
  }

  @Test
  public void test4() {
    assertEquals("vovlv", solution1.reorganizeString("vvvlo"));
  }
}
