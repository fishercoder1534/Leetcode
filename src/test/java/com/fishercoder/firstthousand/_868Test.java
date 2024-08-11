package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._868;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _868Test {
  private _868.Solution1 solution1;

  @BeforeEach
    public void setUp() {
    solution1 = new _868.Solution1();
  }

  @Test
  public void test1() {
    assertEquals(2, solution1.binaryGap(22));
  }

  @Test
  public void test2() {
    assertEquals(2, solution1.binaryGap(5));
  }

  @Test
  public void test3() {
    assertEquals(1, solution1.binaryGap(6));
  }

  @Test
  public void test4() {
    assertEquals(0, solution1.binaryGap(8));
  }
}
