package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._748;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _748Test {
  private _748.Solution1 solution1;
  private static String[] words;
  private static String licensePlate;

  @BeforeEach
    public void setUp() {
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
