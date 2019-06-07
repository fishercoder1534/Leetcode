package com.fishercoder;

import com.fishercoder.solutions._294;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _294Test {
  private static _294.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _294.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(true, solution1.canWin("++++"));
  }
}
