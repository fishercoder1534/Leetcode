package com.fishercoder;

import com.fishercoder.solutions._186;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _186Test {
  private static _186.Solution1 solution1;
  private static char[] s;
  private static char[] expected;

  @BeforeClass
  public static void setup() {
    solution1 = new _186.Solution1();
  }

  @Test
  public void test1() {
    s = new char[] {'h', 'i', '!'};
    solution1.reverseWords(s);
    expected = new char[] {'h', 'i', '!'};
    assertArrayEquals(expected, s);
  }
}
