package com.fishercoder;

import com.fishercoder.solutions._800;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _800Test {
  private static _800.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _800.Solution1();
  }

  @Test
  public void test1() {
    assertEquals("#11ee66", solution1.similarRGB("#09f166"));
  }
}
