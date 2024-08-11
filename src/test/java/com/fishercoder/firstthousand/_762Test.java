package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._762;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _762Test {
  private _762.Solution1 solution1;

  @BeforeEach
    public void setUp() {
    solution1 = new _762.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(4, solution1.countPrimeSetBits(6, 10));
  }
}
