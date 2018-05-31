package com.fishercoder;

import com.fishercoder.solutions._171;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _171Test {
  private static _171.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _171.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(28, solution1.titleToNumber("AB"));
  }
}
