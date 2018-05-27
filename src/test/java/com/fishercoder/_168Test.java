package com.fishercoder;

import com.fishercoder.solutions._168;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _168Test {
  private static _168.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _168.Solution1();
  }

  @Test
  public void test1() {
    assertEquals("APSM", solution1.convertToTitle(28899));
  }
}
