package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._132;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _132Test {
  private _132.Solution1 solution1;

  @BeforeEach
    public void setUp() {
    solution1 = new _132.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(1, solution1.minCut("aab"));
  }
}
