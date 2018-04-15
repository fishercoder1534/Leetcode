package com.fishercoder;

import com.fishercoder.solutions._819;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _819Test {
  private static _819.Solution1 solution1;
  private static String[] banned;

  @BeforeClass
  public static void setup() {
    solution1 = new _819.Solution1();
  }

  @Test
  public void test1() {
    banned = new String[] {"hit"};
    assertEquals("ball",
        solution1.mostCommonWord("Bob hit a ball, the hit BALL flew far after it was hit.",
            banned));
  }
}
