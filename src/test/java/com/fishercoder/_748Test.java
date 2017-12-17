package com.fishercoder;

import com.fishercoder.solutions._748;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class _748Test {
  private static _748.Solution1 solution1;
  private static String[] words;
  private static String licensePlate;

  @BeforeClass
  public static void setup() {
    solution1 = new _748.Solution1();
  }

  @Test
  public void test1() {
    words = new String[] {"step", "steps", "stripe", "stepple"};
    licensePlate = "1s3 PSt";
    assertEquals("steps", solution1.shortestCompletingWord(licensePlate, words));
  }

  @Test
  public void test2() {
    words = new String[] {"looks", "pest", "stew", "show"};
    licensePlate = "1s3 456";
    assertEquals("pest", solution1.shortestCompletingWord(licensePlate, words));
  }

  @Test
  public void test3() {
    words = new String[]{"suggest","letter","of","husband","easy","education","drug","prevent","writer","old"};
    licensePlate = "Ah71752";
    assertEquals("husband", solution1.shortestCompletingWord(licensePlate, words));
  }
}
