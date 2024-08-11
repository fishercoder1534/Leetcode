package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._758;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _758Test {
  private _758.Solution1 solution1;
  private static String[] words;

  @BeforeEach
    public void setUp() {
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
