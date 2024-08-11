package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._87;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _87Test {
  private _87.Solution1 solution1;

  @BeforeEach
    public void setUp() {
    solution1 = new _87.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(true, solution1.isScramble("great", "rgeat"));
  }

  @Test
  public void test2() {
    assertEquals(true, solution1.isScramble("great", "rgtae"));
  }

  @Test
  public void test3() {
    assertEquals(true, solution1.isScramble("abc", "bca"));
  }
}
