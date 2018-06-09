package com.fishercoder;

import com.fishercoder.solutions._190;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _190Test {
  private static _190.Solution1 solution1;

  @BeforeClass
  public static void setup() {
    solution1 = new _190.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(536870912, solution1.reverseBits(4));
  }


  @Test
  public void test2() {
    assertEquals(964176192, solution1.reverseBits(  43261596));
  }
}
