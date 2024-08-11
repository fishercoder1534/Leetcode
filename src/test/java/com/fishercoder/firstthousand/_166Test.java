package com.fishercoder.firstthousand;

import com.fishercoder.solutions.firstthousand._166;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class _166Test {
  private _166.Solution1 solution1;

  @BeforeEach
    public void setUp() {
    solution1 = new _166.Solution1();
  }

  @Test
  public void test1() {
    assertEquals("0.5", solution1.fractionToDecimal(1, 2));
  }

  @Test
  public void test2() {
    assertEquals("2", solution1.fractionToDecimal(2, 1));
  }

  @Test
  public void test3() {
    assertEquals("0.(6)", solution1.fractionToDecimal(2, 3));
  }

  @Test
  public void test4() {
    assertEquals("-6.25", solution1.fractionToDecimal(-50, 8));
  }

  @Test
  public void test5() {
    assertEquals("-0.58(3)", solution1.fractionToDecimal(7, -12));
  }

  @Test
  public void test6() {
    assertEquals("0.0000000004656612873077392578125", solution1.fractionToDecimal(-1, -2147483648));
  }

  @Test
  public void test7() {
    assertEquals("0", solution1.fractionToDecimal(0, -5));
  }

  @Test
  public void test8() {
    assertEquals("-2147483648", solution1.fractionToDecimal(-2147483648, 1));
  }
}
