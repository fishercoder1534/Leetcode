package com.fishercoder;

import com.fishercoder.solutions._756;
import java.util.Arrays;
import java.util.List;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _756Test {
  private static _756.Solution1 solution1;
  private static List<String> allowed;

  @BeforeClass
  public static void setup() {
    solution1 = new _756.Solution1();
  }

  @Test
  public void test1() {
    allowed = Arrays.asList("XYD", "YZE", "DEA", "FFF");
    assertEquals(true, solution1.pyramidTransition("XYZ", allowed));
  }

  @Test
  public void test2() {
    allowed = Arrays.asList("XXX", "XXY", "XYX", "XYY", "YXZ");
    assertEquals(false, solution1.pyramidTransition("XXYX", allowed));
  }

  @Test
  public void test3() {
    allowed = Arrays.asList("BCE", "BCF", "ABA", "CDA", "AEG", "FAG", "GGG");
    assertEquals(false, solution1.pyramidTransition("ABCD", allowed));
  }
}
