package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._186;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class _186Test {
  private _186.Solution1 solution1;
  private static char[] s;
  private static char[] expected;

  @BeforeEach
    public void setUp() {
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
