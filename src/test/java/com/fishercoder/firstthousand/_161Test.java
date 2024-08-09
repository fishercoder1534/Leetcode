package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._161;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _161Test {
  private _161.Solution1 solution1;

  @BeforeEach
    public void setUp() {
    solution1 = new _161.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(true, solution1.isOneEditDistance("a", "ac"));
  }
}
