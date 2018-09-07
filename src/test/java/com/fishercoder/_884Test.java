package com.fishercoder;

import com.fishercoder.solutions._884;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class _884Test {
  private static _884.Solution1 solution1;
  private static String[] expected;

  @BeforeClass
  public static void setup() {
    solution1 = new _884.Solution1();
  }

  @Test
  public void test1() {
    expected = new String[] {"sweet", "sour"};
    assertArrayEquals(expected,
        solution1.uncommonFromSentences("this apple is sweet", "this apple is sour"));
  }

  @Test
  public void test2() {
    expected = new String[] {"banana"};
    assertArrayEquals(expected,
        solution1.uncommonFromSentences("apple apple", "banana"));
  }
}
