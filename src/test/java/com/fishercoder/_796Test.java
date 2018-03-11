package com.fishercoder;

import com.fishercoder.solutions._796;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _796Test {
  private static _796.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _796.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(true, solution1.rotateString("abcde", "cdeab"));
  }

  @Test
  public void test2() {
    assertEquals(false, solution1.rotateString("abcde", "abced"));
  }
}
