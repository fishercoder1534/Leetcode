package com.fishercoder;

import com.fishercoder.solutions._791;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _791Test {
  private static _791.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _791.Solution1();
  }

  @Test
  public void test1() {
    assertEquals("cbad", solution1.customSortString("cba", "abcd"));
  }
}
