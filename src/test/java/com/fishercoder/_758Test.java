package com.fishercoder;

import com.fishercoder.solutions._758;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _758Test {
  private static _758.Solution1 solution1;
  private static String[] words;

  @BeforeClass
  public static void setup() {
    solution1 = new _758.Solution1();
  }

  @Test
  public void test1() {
    words = new String[] {"ab", "bc"};
    assertEquals("a<b>abc</b>d", solution1.boldWords(words, "aabcd"));
  }

  @Test
  public void test2() {
    words = new String[] {"ccb", "b", "d", "cba", "dc"};
    assertEquals("eeaa<b>d</b>a<b>d</b>a<b>dc</b>", solution1.boldWords(words, "eeaadadadc"));
  }
}
