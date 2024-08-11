package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._165;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _165Test {
  private _165.Solution1 solution1;

  @BeforeEach
    public void setUp() {
    solution1 = new _165.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(-1, solution1.compareVersion("1.1", "1.2"));
  }

  @Test
  public void test2() {
    assertEquals(1, solution1.compareVersion("1.0.1", "1"));
  }

  @Test
  public void test3() {
    assertEquals(-0, solution1.compareVersion("1.0", "1"));
  }
}
